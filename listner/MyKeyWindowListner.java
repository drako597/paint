package listner;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyWindowListner implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
			if(e.getKeyCode()==(KeyEvent.VK_CONTROL+KeyEvent.VK_X)){
				System.out.println(e.getID());
			}
			System.out.println(e.getKeyCode());
			System.out.println(KeyEvent.VK_CONTROL);
			System.out.println(KeyEvent.VK_X);
		

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
