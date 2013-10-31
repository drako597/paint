package figle;

import java.awt.Graphics;
import java.awt.Graphics2D;

import paint.Point;

public class Oval extends Figure{

	public Oval(Point point) {
		super(point);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(point.getBgcolor());
		g.drawOval(point.getX1(), point.getY1(), point.getX(), point.getY());
		
	}

}
