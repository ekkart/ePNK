package Appearence.presentation;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage.Literals;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

import Appearence.AppearencePackage;
/*
 * Author: Morten Valvik (s062189)
 */

public class AppearanceAdapterFactoryContentProvider extends AdapterFactoryContentProvider  {
	//Inner class for creating the FileDialog
	private final class FileDialogCellEditor extends DialogCellEditor {
		private final String[] filterExts;
		private final String initialPath;

		private FileDialogCellEditor(Composite parent, String[] filterExts, String intialPath) {
			super(parent);
			this.filterExts = filterExts;
			this.initialPath = intialPath;
		}

	
		
		@Override
		protected Object openDialogBox(Control cellEditorWindow) {
			FileDialog fileDialog = new FileDialog(cellEditorWindow.getShell());
			fileDialog.setFilterExtensions(filterExts);
			fileDialog.setFileName(initialPath);
			return makeRelative(fileDialog.open());
		}
		
		/**
		 * @author Jesper Jepsen (s011936)
		 * @author Magnus Tryggvason (s093265)
		 * 
		 * Implements support for relative paths.
		 * All user graphics should be placed in run-time workbench or a sub-folder.
		 * "Models" project folder (in development workbench) is now obsolete.
		 */
		
		private String makeRelative(String inputPath) {
			
			IPath fullPath = new Path(inputPath);
			IPath workspace = ResourcesPlugin.getWorkspace().getRoot().getLocation();
			
			if (workspace.isPrefixOf(fullPath)) {
				String relative = fullPath.toString().substring(workspace.toString().length());
				final URI uri = URI.createPlatformResourceURI(relative, true);
				return uri.toString();
			} else {
				return fullPath.toPortableString();
			}
		}
	}
	
	public AppearanceAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	@Override
	protected IPropertySource createPropertySource(Object object, IItemPropertySource itemPropertySource) {
		return new PropertySource(object, itemPropertySource) {
			@Override
			protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
				return new PropertyDescriptor(object, itemPropertyDescriptor) {
					@Override
					public CellEditor createPropertyEditor(Composite composite) {
						Object feature = itemPropertyDescriptor.getFeature(this.object);
						
						
						Object value = ((EObject) this.object).eGet((EStructuralFeature) feature);
						
						if(feature == AppearencePackage.Literals.SHAPE__OBJECT_STRING_PATH){	
							return new FileDialogCellEditor(composite, new String[]{"*.obj"}, value != null ? value.toString() : null);
						}
						else{
							return super.createPropertyEditor(composite);
						}
						
					}

				};
			}
		};
	}
}
