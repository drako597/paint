package figle;

import java.io.Serializable;

import paint.Point;

public abstract class Figure implements Figle, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Point point;

	public Figure(Point point) {
		// TODO Auto-generated constructor stub
		this.point = point;
	}

}
