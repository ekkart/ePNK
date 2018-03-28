package org.pnml.tools.epnk.managers.graphics.resources;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Resource;


/**
 * This class manages graphical resources that are created by the ePNK over
 * the lifetime of an editor instance. This is to make sure that all resources
 * created are disposed when the editor is closed; moreover, this mechanism
 * is used to share resources within the editor for efficiency reasons. 
 * 
 * Note that this resource manager only takes responsibility for resources 
 * created by the ePNK parts, not for the GMF parts, which are taken care of 
 * by the GMF part (according to the SWT guidelines for graphical resources).
 * 
 * @author eki
 * @generated NOT
 */
public class GraphicsResourcesManager extends Resource {
	
	private List<Color> usedColours;
	private Map<RGB,Color> awt2swtMapping;
	
	private List<Image> usedImages;
	private Map<String,Image> path2ImageMapping;
	
	public GraphicsResourcesManager() {		
		usedColours = new ArrayList<Color>();
		awt2swtMapping = new HashMap<RGB, Color>();
		
		usedImages = new ArrayList<Image>();
		path2ImageMapping = new HashMap<String, Image>();
	}
	
	public org.eclipse.swt.graphics.Color getSWTColor(RGB rgb) {
		 Color colour = awt2swtMapping.get(rgb);
		 if (colour == null) {
			 colour = new Color(this.getDevice(), rgb);
			 usedColours.add(colour);
			 
		 }
		 
		 return colour;
	}
	
	public Image getImage(EObject object, String path) {
		Image image = null;
		
		if (!path2ImageMapping.containsKey(path)) {
			org.eclipse.emf.ecore.resource.Resource resource = object.eResource();
			URI uri = resource.getURI();
			String basePath = uri.toString(); 
			URL baseURL = null;
			try {
				URL url = new URL(basePath);
				baseURL = FileLocator.resolve(url);
			} catch (Exception e) {

			} 

			URL url = null;
			try {
				url = new URL(baseURL, path);
			} catch (MalformedURLException e) {

			}

			if (url != null) {
				try {
					// image = new Image(null, url.getFile());
					ImageDescriptor imageDescr = ImageDescriptor.createFromURL(url);
					image = imageDescr.createImage(false);
				} catch (Exception e) {
					
				}
			}
		
			if (image != null) {
			    usedImages.add(image);
			}
			// eki: Note that we register null for an image in case the
			//      image was not found, this way, we do not try loading it over
			//      and over again (to become aware of the existence of an
			//      image, clearImageCache() needs to be called.
			path2ImageMapping.put(path, image);
		} else {
			image = path2ImageMapping.get(path);
		}

		return image;
	}

	public void clearImageCache() {
		if (!isDisposed()) {
			for (Image image: usedImages) {
				image.dispose();
			}
			usedImages = new ArrayList<Image>();
			path2ImageMapping = new HashMap<String, Image>();
		}
	}

	@Override
	public boolean isDisposed() {
		return usedColours == null;
	}
	
	@Override
	public void dispose() {
		if (!isDisposed()) {
			for (Image image: usedImages) {
				image.dispose();
			}
			for (Color colour: usedColours) {
				colour.dispose();
			}
			
			super.dispose();
			usedImages = null;
			path2ImageMapping = null;
			usedColours = null;
			awt2swtMapping = null;
		}
	}

}
