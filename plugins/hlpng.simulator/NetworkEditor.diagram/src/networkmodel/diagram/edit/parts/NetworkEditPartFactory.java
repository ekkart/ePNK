package networkmodel.diagram.edit.parts;

import networkmodel.diagram.part.NetworkVisualIDRegistry;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class NetworkEditPartFactory implements EditPartFactory
{

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model)
	{
		if(model instanceof View)
		{
			View view = (View) model;
			switch(NetworkVisualIDRegistry.getVisualID(view))
			{

				case NetworkEditPart.VISUAL_ID:
					return new NetworkEditPart(view);

				case CategoryEditPart.VISUAL_ID:
					return new CategoryEditPart(view);

				case CategoryNameEditPart.VISUAL_ID:
					return new CategoryNameEditPart(view);

				case NodeEditPart.VISUAL_ID:
					return new NodeEditPart(view);

				case NodeLabelEditPart.VISUAL_ID:
					return new NodeLabelEditPart(view);

				case DirectedEdgeEditPart.VISUAL_ID:
					return new DirectedEdgeEditPart(view);

				case UndirectedEdgeEditPart.VISUAL_ID:
					return new UndirectedEdgeEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model)
	{
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
	        ITextAwareEditPart source)
	{
		if(source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else
		{
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator
	{

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel)
		{
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel()
		{
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor)
		{
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if(!text.getFont().isDisposed())
			{
				if(getWrapLabel().isTextWrapOn()
				        && getWrapLabel().getText().length() > 0)
				{
					rect.setSize(new Dimension(text.computeSize(rect.width,
					        SWT.DEFAULT)));
				}
				else
				{
					int avr = FigureUtilities.getFontMetrics(text.getFont())
					        .getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					        SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if(!rect.equals(new Rectangle(text.getBounds())))
			{
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator
	{

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label)
		{
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel()
		{
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor)
		{
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if(!text.getFont().isDisposed())
			{
				int avr = FigureUtilities.getFontMetrics(text.getFont())
				        .getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
				        SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if(!rect.equals(new Rectangle(text.getBounds())))
			{
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
