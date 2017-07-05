package dragtree;

import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DropTargetComponent extends JPanel implements DropTargetListener {

	public DropTargetComponent() {
		// TODO Auto-generated constructor stub
	
		new DropTarget(this, DnDConstants.ACTION_COPY_OR_MOVE, this);
	
	}
	
	public void dragEnter(DropTargetDragEvent dtde) {
		// TODO Auto-generated method stub
		System.out.println("Drop Enter");

	}

	public void dragOver(DropTargetDragEvent dtde) {
		// TODO Auto-generated method stub

		System.out.println("Drop Over");
	}

	public void dropActionChanged(DropTargetDragEvent dtde) {
		// TODO Auto-generated method stub

		System.out.println("Drop Action changed");
	}

	public void dragExit(DropTargetEvent dte) {
		// TODO Auto-generated method stub

		System.out.println("Drop Exit");
	}

	public void drop(DropTargetDropEvent dtde) {
		// TODO Auto-generated method stub

		System.out.println("Drop");
	}

}
