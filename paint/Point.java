package paint;

import java.awt.Color;

public class Point {

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x;
	private int y;
	private Color bgcolor;

	public Point(int x1, int y1, int x2, int y2, Color bgcolor) {
		// TODO Auto-generated constructor stub
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.bgcolor = bgcolor;
		setXY();
	}

	private void setXY() {
		// TODO Auto-generated method stub
		x = x2 - x1;
		y = y2 - y1;

	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return (String) "X1:" + getX1() + " Y1:" + getY1() + " X2:" + getX2()
				+ " Y2:" + getY2() + " X:" + getX() + " Y:" + getY();
	}

	public Color getBgcolor() {
		return bgcolor;
	}

	public void setBgcolor(Color bgcolor) {
		this.bgcolor = bgcolor;
	}
}
