package ch9.part1;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Exe3 extends Applet implements KeyListener {
	char ch;

	public void init() {
		addKeyListener(this);
		requestFocus();// 获取焦点
	}

	public void paint(Graphics g) {
		if (ch == 'r' | ch == 'R')
			this.setBackground(Color.red);
		else if(ch=='b'||ch=='B')
			this.setBackground(Color.BLUE);
		else if(ch=='g' || ch=='G')
			this.setBackground(Color.green);
		else
			this.setBackground(Color.black);
	}

	public void keyPressed(KeyEvent e)// 键压下时执行
	{
	}

	public void keyReleased(KeyEvent e)// 键释放时执行
	{
	}

	public void keyTyped(KeyEvent e)// //键敲击时执行
	{
		ch = e.getKeyChar();
		repaint();
	}
}
