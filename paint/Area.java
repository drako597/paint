package paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import figle.Figle;
import figle.Figure;

import listner.MyMouseListnerArea;
import listner.MyMouseMotionListener;

public class Area extends JPanel{
	private DrawMenager dm;
	private MyMenu mymenu;
	private Bar bar;
	public Area(MyMenu mymenu) {
		// TODO Auto-generated constructor stub
		this.setMymenu(mymenu);
		setDm(new DrawMenager(this,mymenu));
		setBackground(Color.WHITE);
		addMouseMotionListener(setBar(new Bar()));
		addMouseListener(new MyMouseListnerArea(getDm()));
		
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Graphics2D g2d =(Graphics2D) g;
		for (Figle f : getDm().getCollectionFigle()) {
			f.draw(g2d);
		}
		
	}
	public MyMenu getMymenu() {
		return mymenu;
	}
	public void setMymenu(MyMenu mymenu) {
		this.mymenu = mymenu;
	}
	public DrawMenager getDm() {
		return dm;
	}
	public void setDm(DrawMenager dm) {
		this.dm = dm;
	}
	public Bar getBar() {
		return bar;
	}
	public Bar setBar(Bar bar) {
		this.bar = bar;
		return bar;
	}

}
