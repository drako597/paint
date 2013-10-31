package figle;

import java.awt.Graphics;

import paint.CollectionFigle;
import paint.Point;

public class Line extends Figure {



	public Line(Point point) {
		super(point);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(point.getBgcolor());
		g.drawLine(point.getX1(), point.getY1(), point.getX2(), point.getY2());
		
	}

}
