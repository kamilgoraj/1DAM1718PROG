
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

public class Frame extends JFrame {
 
	Lienzo lienzo;
	
	public Frame() {
		super("Swing Text Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(lienzo = new Lienzo(500, 500));
		pack();
		Action izda = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		};
		KeyStroke key = KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0);
		getRootPane().getInputMap().put(key, "izda");
		getRootPane().getActionMap().put("izda", izda);
		Action dcha = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		};
		key = KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0);
		getRootPane().getInputMap().put(key, "dcha");
		getRootPane().getActionMap().put("dcha", dcha);
	}
	
}
