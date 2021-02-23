package ch9.part1;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Exe2 extends Applet implements MouseListener {
	int x, y, k;
	Image pic;

	public void init() {
		pic = getImage(getDocumentBase(), "a.jpg");
		addMouseListener(this);
	}

	public void paint(Graphics g) {
		if (k == 1) {
			Font f1 = new Font("Courier", Font.PLAIN, 25);
			g.setFont(f1);
			g.drawString("释放鼠标将显示图象.", x, y);
		}
		if (k == 2) {
			g.drawImage(pic, x, y, 200, 160, this);
		}
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
		k = 1;
		x = e.getX();
		y = e.getY();
		repaint();
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
		k = 2;
		x = e.getX();
		y = e.getY();
		repaint();
	}
}
