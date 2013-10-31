package paint;

import java.awt.Color;
import java.util.Collection;
import java.util.Iterator;

import figle.*;

public class DrawMenager {

	private CollectionFigle cf = new CollectionFigle();
	private Area area;
	private String choose = "LINE";
	private Color figleColor = Color.RED;

	public DrawMenager(Area area, MyMenu mymenu) {
		// TODO Auto-generated constructor stub
		this.area = area;

	}

	public void draw(Point point) {
		// TODO Auto-generated method stub
		getCf().add(ChooseFigure.valueOf(getChoose()).drawFigle(point));
		area.repaint();

	}

	public Collection<Figle> getCollectionFigle() {
		return getCf().getCollectionFigle();
	}

	public String getChoose() {
		return choose;
	}

	public void setChoose(String choose) {
		this.choose = choose;
	}

	public void clean() {
		getCf().getCollectionFigle().removeAll(getCollectionFigle());
		area.repaint();
	}

	public void undo() {
		Iterator<Figle> interaor = getCf().getCollectionFigle().iterator();
		Figle tmp = null;
		while (interaor.hasNext()) {
			tmp = interaor.next();
		}
		getCf().getCollectionFigle().remove(tmp);
		area.repaint();
	}

	public Color getFigleColor() {
		return figleColor;
	}

	public void setFigleColor(Color figleColor) {
		this.figleColor = figleColor;
	}

	public void setPoint(int x, int y, int x1, int y1) {
		draw(new Point(x, y, x1, y1, figleColor));
	}

	public CollectionFigle getCf() {
		return cf;
	}

	public void setCf(CollectionFigle cf) {
		this.cf = cf;
	}

}
