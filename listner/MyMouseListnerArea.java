package listner;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import paint.DrawMenager;

public class MyMouseListnerArea implements MouseListener {

	private int x;
	private int y;
	private DrawMenager dm;

	public MyMouseListnerArea(DrawMenager dm) {
		// TODO Auto-generated constructor stub
		this.dm = dm;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
		// System.out.print(x);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		// System.out.print(e.getX());
		dm.setPoint(x, y, e.getX(), e.getY());

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
