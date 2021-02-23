package ch9.part2;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Exe1 extends Applet implements ActionListener {
	Button b1, b2;
	int i;

	public void init() {
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		b1 = new Button("ª≠æÿ–Œ");
		add(b1);
		b1.addActionListener(this);
		b2 = new Button("ª≠Õ÷‘≤");
		add(b2);
		b2.addActionListener(this);
	}

	public void paint(Graphics g) {
		if (i == 1)
			g.drawRect(50, 50, 60, 30);
		if (i == 2)
			g.drawOval(50, 50, 60, 30);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1)
			i = 1;
		if (e.getSource() == b2)
			i = 2;
		repaint();
	}
}
