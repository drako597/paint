package listner;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;

import paint.PaintWindow;

public class MyColorChooserFigleBackGraund implements ActionListener {

	private PaintWindow paintWindow;

	public MyColorChooserFigleBackGraund(PaintWindow paintWindow) {
		this.paintWindow = paintWindow;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Color c;
		c = new JColorChooser().showDialog((Component)e.getSource(), "Tło", Color.BLACK);
		paintWindow.getArea().getDm().setFigleColor(c);
	}

}
