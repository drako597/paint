package figle;

import java.io.Serializable;

import paint.CollectionFigle;
import paint.Point;


public abstract class Figure implements Figle, Serializable{
	
	Point point;
	
	public Figure(Point point) {
		// TODO Auto-generated constructor stub
		this.point=point;
	}



}
