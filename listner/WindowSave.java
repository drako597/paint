package listner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import javax.swing.JFileChooser;

import paint.CollectionFigle;
import paint.MyMenu;

import figle.Figle;

public class WindowSave extends JFileChooser implements ActionListener {
	private MyMenu myMenu;
	private PrintWriter printFile;
	private int fileName;
	private ObjectOutputStream out;

	public WindowSave(MyMenu myMenu) {
		// TODO Auto-generated constructor stub
		super();
		this.myMenu = myMenu;
		setSize(300, 400);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		final int tmp = showSaveDialog(getParent());
		addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (tmp == JFileChooser.APPROVE_OPTION) {
					try {
						out = new ObjectOutputStream(new BufferedOutputStream(
								new FileOutputStream(getSelectedFile())));
						out.writeObject(myMenu.getPaintWindow().getArea()
								.getDm().getCf());
						out.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
	}

}
