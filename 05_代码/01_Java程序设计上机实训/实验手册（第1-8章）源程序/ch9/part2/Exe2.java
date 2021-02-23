package ch9.part2;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Exe2 extends Applet implements ActionListener {
	Button opt1, opt2, opt3, opt4;

	public void init() {
		opt1 = new Button("东");
		add(opt1);
		opt1.addActionListener(this);
		opt2 = new Button("西");
		add(opt2);
		opt2.addActionListener(this);
		opt3 = new Button("南");
		add(opt3);
		opt3.addActionListener(this);
		opt4 = new Button("北");
		add(opt4);
		opt4.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		setLayout(new BorderLayout(5, 5));
		if (e.getSource() == opt1) {
			opt1.setVisible(true);
			opt2.setVisible(false);
			opt3.setVisible(false);
			opt4.setVisible(false);
			add(opt1, BorderLayout.EAST);
		}
		if (e.getSource() == opt2) {
			opt1.setVisible(false);
			opt2.setVisible(true);
			opt3.setVisible(false);
			opt4.setVisible(false);
			add(opt2, BorderLayout.WEST);
		}
		if (e.getSource() == opt3) {
			opt1.setVisible(false);
			opt2.setVisible(false);
			opt3.setVisible(true);
			opt4.setVisible(false);
			add(opt3, BorderLayout.SOUTH);
		}
		if (e.getSource() == opt4) {
			opt1.setVisible(false);
			opt2.setVisible(false);
			opt3.setVisible(false);
			opt4.setVisible(true);
			add(opt4, BorderLayout.NORTH);
		}
		validate();
	}
}
