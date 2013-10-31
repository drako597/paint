package paint;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JFileChooser;

public class WindowOpen extends JFileChooser implements ActionListener {
	private MyMenu myMenu;
	private ObjectInputStream in;
	private CollectionFigle collectionFigle;

	public WindowOpen(MyMenu myMenu) {
		// TODO Auto-generated constructor stub
		super();
		this.myMenu = myMenu;
		setSize(400, 300);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int tmp = showOpenDialog(getParent());
		if (tmp == JFileChooser.APPROVE_OPTION) {
			try {
				/*
				in = new ObjectInputStream(new BufferedInputStream(
						new FileInputStream(getSelectedFile())));
				*/
				in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("/home/karol/1"))));
				System.out.print(in.toString());
				collectionFigle = (CollectionFigle) in.readObject();
				myMenu.getPaintWindow().getArea().getDm()
						.setCf(collectionFigle);
				in.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
