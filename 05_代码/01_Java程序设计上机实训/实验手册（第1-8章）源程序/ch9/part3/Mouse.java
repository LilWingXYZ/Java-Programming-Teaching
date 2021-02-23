import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Mouse {
	public static void main(String[] args) {
		MouseExample f = new MouseExample();
		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}

class MouseExample extends JFrame {
	private JTextArea txa = new JTextArea();
	private MouseLis mlis = new MouseLis();

	public MouseExample() {
		JButton btn = new JButton(" Çëµã»÷ ");
		btn.addMouseListener(mlis);
		txa.setEditable(false);
		this.getContentPane().add(btn, BorderLayout.WEST);
		this.getContentPane().add(new JScrollPane(txa), BorderLayout.CENTER);
	}

	class MouseLis extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			txa.append("µã»÷×ø±ê£ºx=" + x + ",y=" + y + "\n");
			super.mouseClicked(e);
		}

	}
}
