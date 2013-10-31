package paint;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import listner.MyMouseMotionListener;

public class Bar implements MouseMotionListener {
	private JPanel panel;
	private JLabel x;
	private JLabel y;

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x.setText("X:"+e.getX());
		y.setText("Y:"+e.getY());
	}

	public JPanel getPanel(){
		panel = new JPanel();
		x = new JLabel("X:");
		y = new JLabel("Y:");
		panel.add(x);
		panel.add(y);
		return panel;
		
	}
}
