package paint;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import listner.ExitListner;
import listner.MyColorChooserBackGraund;
import listner.MyColorChooserFigleBackGraund;
import listner.WindowSave;

/**
 * 
 * @author karol Górne menu programu
 */

public class MyMenu {

	JMenuBar menu = new JMenuBar();
	private PaintWindow paintWindow;
	
	
	public MyMenu(final PaintWindow paintWindow) {
		this.setPaintWindow(paintWindow);
		// Menu Plik
		JMenu file = new JMenu("Plik");
		JMenuItem open, save, exit;
		open = new JMenuItem("Otwórz");
		open.addActionListener(new WindowOpen(this));
		file.add(open);
		save = new JMenuItem("Zapisz");
		save.addActionListener(new WindowSave(this));
		file.add(save);
		exit = new JMenuItem("Zakończ");
		exit.addActionListener(new ExitListner());
		file.add(exit);
		menu.add(file);

		// Menu Edycja
		JMenu edit = new JMenu("Edycja");
		JMenuItem clean,undo, line, rectangle, circutle, setting;
		undo = new JMenuItem("Cofnij");
		undo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				paintWindow.getArea().getDm().undo();
			}
		});
		edit.add(undo);
		clean = new JMenuItem("Czyść");
		clean.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				paintWindow.getArea().getDm().clean();
			}
		});
		edit.add(clean);
		JMenu draw = new JMenu("Rusuj");
		line = new JMenuItem("Linia");
		line.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				paintWindow.getArea().getDm().setChoose("LINE");
				
			}
		});
		draw.add(line);
		rectangle = new JMenuItem("Prostokąt");
		rectangle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				paintWindow.getArea().getDm().setChoose("RECTANGLE");
				
			}
		});
		draw.add(rectangle);
		circutle = new JMenuItem("Koło");
		circutle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				paintWindow.getArea().getDm().setChoose("OVAL");
			}
		});
		draw.add(circutle);
		edit.add(draw);
		setting = new JMenuItem("Ustawienia");
		edit.add(setting);
		menu.add(edit);

		// Menu Kolor
		JMenu color = new JMenu("Kolor");
		JMenuItem bg, figlebg;
		bg = new JMenuItem("Kolor Tła");
		bg.addActionListener(new MyColorChooserBackGraund(paintWindow));
		color.add(bg);
		figlebg = new JMenuItem("Kolor Figury");
		figlebg.addActionListener(new MyColorChooserFigleBackGraund(paintWindow));
		color.add(figlebg);
		menu.add(color);

		// Menu Pomoc
		JMenu help = new JMenu("Pomoc");
		JMenuItem aboutprogram;
		aboutprogram = new JMenuItem("O Programie");
		aboutprogram.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new AboutProgramWindow();

			}
		});
		help.add(aboutprogram);
		menu.add(help);
	}

	public JMenuBar getMenu() {
		return menu;
	}

	public PaintWindow getPaintWindow() {
		return paintWindow;
	}

	public void setPaintWindow(PaintWindow paintWindow) {
		this.paintWindow = paintWindow;
	}

}
