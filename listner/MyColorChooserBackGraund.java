package listner;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;

import paint.PaintWindow;

public class MyColorChooserBackGraund implements ActionListener {
	private PaintWindow paintWindow;

	public MyColorChooserBackGraund(PaintWindow paintWindow) {
		// TODO Auto-generated constructor stub
		this.paintWindow = paintWindow;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Color c;
		c = JColorChooser.showDialog((Component) e.getSource(), "Tło",
				Color.BLACK);
		paintWindow.getArea().setBackground(c);
		paintWindow.getArea().repaint();

	}

}
