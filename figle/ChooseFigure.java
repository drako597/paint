package figle;

import paint.Point;

public enum ChooseFigure {
	
	LINE{ 
		public Figure drawFigle(Point point){
			return new Line(point);
			}
	},
	RECTANGLE{
		public Figure drawFigle(Point point){
			return new Rectangle(point);
		}
		
	},
	OVAL{
		public Figure drawFigle(Point point){
			return new Oval(point);
		}
		
	};
	
	public abstract Figure drawFigle(Point point);

}
