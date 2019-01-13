package ui.tools;


import model.Rect;
import ui.DrawingEditor;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class RectTool extends ShapeTool {

	public RectTool(DrawingEditor editor, JComponent parent) {
		super(editor, parent);
	}

	@Override
	String getLabel() {
		return "Rectangle";
	}

	@Override
	void makeShape(MouseEvent e) {
		shape = new Rect(e.getPoint(), editor.getMidiSynth());
	}


}

