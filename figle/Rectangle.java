package figle;

import java.awt.Graphics;

import paint.Point;

public class Rectangle extends Figure {

	public Rectangle(Point point) {
		super(point);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(point.getBgcolor());
		g.drawRect(point.getX1(), point.getY1(), point.getX(), point.getY());
		
	}

}
