package paint;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AboutProgramWindow extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Box uklad;
	private JLabel image, txt;
	private JButton colse;

	public AboutProgramWindow() {
		// TODO Auto-generated constructor stub
		super();
		setSize(400, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		uklad = Box.createVerticalBox();
		image = new JLabel(new ImageIcon("smok.jpeg"));
		image.setAlignmentX(Component.CENTER_ALIGNMENT);
		uklad.add(image);
		txt = new JLabel(
				"<html>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam lacinia in purus ac sodales. Morbi aliquam, tellus pellentesque malesuada facilisis, risus tellus vehicula lectus, ac ultricies nulla diam et orci. Duis non erat felis. Integer non mauris quis quam molestie auctor sodales quis augue. Pellentesque luctus tellus quis ullamcorper cursus. Ut venenatis, nulla ac gravida aliquet, nunc mi tincidunt metus, vel gravida diam risus eu tellus. Morbi quis ultricies magna. Sed elit diam, tristique ut sodales vitae, eleifend ut risus. Sed et ultricies nisl. Aliquam sit amet urna in dui varius dignissim sed in mauris. Suspendisse rhoncus aliquet lacus, sed bibendum dolor ornare ut. Ut dapibus faucibus nisi, eleifend rhoncus augue bibendum ac. Suspendisse at bibendum ante. </html>",
				JLabel.CENTER);
		txt.setAlignmentX(Component.CENTER_ALIGNMENT);
		uklad.add(txt);
		colse = new JButton("Close");
		colse.addActionListener(this);
		colse.setAlignmentX(Component.CENTER_ALIGNMENT);
		uklad.add(colse);
		uklad.setAutoscrolls(true);
		add(uklad, BorderLayout.CENTER);
		setVisible(true);
	}

	// Ukryj okno po nacisnięciu przycisku zamknij
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		// disable();
	}

}
