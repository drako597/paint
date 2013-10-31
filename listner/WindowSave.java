package listner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;

import paint.MyMenu;

public class WindowSave extends JFileChooser implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MyMenu myMenu;
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
