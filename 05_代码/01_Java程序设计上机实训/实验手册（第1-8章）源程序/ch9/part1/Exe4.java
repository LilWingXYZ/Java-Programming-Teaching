package ch9.part1;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Exe4 extends Applet {
	char ch;
	int x = 20, y = 20;

	public void init() {
		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == e.VK_DOWN)
					y += 2;
				if (e.getKeyCode() == e.VK_UP)
					y -= 2;
				if (e.getKeyCode() == e.VK_RIGHT)
					x += 2;
				if (e.getKeyCode() == e.VK_LEFT)
					x -= 2;
				repaint();
			}
		});
		this.requestFocus();
	}

	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.fillOval(x, y, 30, 30);
	}
}