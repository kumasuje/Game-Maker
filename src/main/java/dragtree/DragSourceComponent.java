package dragtree;

import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;

import javax.swing.JPanel;

import models.Sprites;

@SuppressWarnings("serial")
public class DragSourceComponent extends Sprites implements DragGestureListener, DragSourceListener{

	DragSource dragSource;
	
	public DragSourceComponent(JPanel parentPanel) {
		// TODO Auto-generated constructor stub
	
		this.dragSource = new DragSource();
	    this.dragSource.createDefaultDragGestureRecognizer(parentPanel, DnDConstants.ACTION_COPY_OR_MOVE, this);

	
	}

	public void dragGestureRecognized(DragGestureEvent dge) {
		// TODO Auto-generated method stub
	    Transferable t = new StringSelection("aString");
		dragSource.startDrag(dge, DragSource.DefaultCopyDrop, t, this);
	
	}
	
	public void dragEnter(DragSourceDragEvent dsde) {
		// TODO Auto-generated method stub
		System.out.println("Drag Enter");
	}

	public void dragOver(DragSourceDragEvent dsde) {
		// TODO Auto-generated method stub
		System.out.println("Drag Over");
		
	}

	public void dropActionChanged(DragSourceDragEvent dsde) {
		// TODO Auto-generated method stub
		System.out.println("Drag Action Changed");

	}

	public void dragExit(DragSourceEvent dse) {
		// TODO Auto-generated method stub
		System.out.println("Drag Exit");

	}

	public void dragDropEnd(DragSourceDropEvent dsde) {
		// TODO Auto-generated method stub
		System.out.println("Drag Drop");

	}

}
