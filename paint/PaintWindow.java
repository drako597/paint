package paint;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import listner.MyKeyWindowListner;

/**
 * 
 * @author karol Główne okno programu
 */

public class PaintWindow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MyMenu mymenu = new MyMenu(this);
	private Area area;

	public PaintWindow() {
		// TODO Auto-generated constructor stub
		setTitle("Paint");
		setSize(new Dimension(400, 600));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		addKeyListener(new MyKeyWindowListner());
		add(getMymenu().getMenu(), BorderLayout.PAGE_START);
		add(setArea(new Area(getMymenu())), BorderLayout.CENTER);
		add(area.getBar().getPanel(), BorderLayout.PAGE_END);
		setVisible(true);

	}

	public MyMenu getMymenu() {
		return mymenu;
	}

	public void setMymenu(MyMenu mymenu) {
		this.mymenu = mymenu;
	}

	public Area getArea() {
		return area;
	}

	public Area setArea(Area area) {
		this.area = area;
		return area;
	}

}
