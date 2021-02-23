package ch9.part2;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class CalendarBean {
	String day[];
	int year = 2010, month = 0;

	public void setYear(int year) {
		this.year = year; // 对成员变量year赋值
	}

	public int getYear() {
		return year;
	}

	public void setMonth(int month) {
		this.month = month; // 对成员变量month赋值
	}

	public int getMonth() {
		return month;
	}

	public String[] getCalendar() {
		String a[] = new String[42];
		Calendar myCalendar = Calendar.getInstance();
		myCalendar.set(year, month - 1, 1);
		int week = myCalendar.get(Calendar.DAY_OF_WEEK) - 1;
		int day = 0;
		if (month == 1 || month == 3 || month == 7 || month == 8 || month == 10
				|| month == 12) { // 月份为1、3、5、7、8、10、12
			day = 31;
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			day = 30;
		}
		if (month == 2) {
			if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {// 判断是否为闰年
				day = 29;
			} else {
				day = 28;
			}
		}
		for (int i = week, n = 1; i < week + day; i++) {
			a[i] = String.valueOf(n);
			n++;
		}
		return a;
	}
}

class CalendarFrame extends Frame implements ActionListener {
	Label labelDay[] = new Label[42];
	Button titleName[] = new Button[7];
	String name[] = { "日", "一", "二", "三", "四", "五", "六" };
	Button nextMonth, previousMonth;
	int year = 2011, month = 10;
	CalendarBean calendar;
	Label showMessage = new Label("", Label.CENTER);

	public CalendarFrame() {
		Panel pCenter = new Panel();
		pCenter.setLayout(new GridLayout(7, 7)); // 将pCenter的布局设置为7行7列的GridLayout
		// 布局。
		for (int i = 0; i < 7; i++) {
			titleName[i] = new Button(name[i]);
			pCenter.add(titleName[i]); // pCenter添加组件titleName[i]。
		}
		for (int i = 0; i < 42; i++) {
			labelDay[i] = new Label("", Label.CENTER);
			pCenter.add(labelDay[i]); // pCenter添加组件labelDay[i]。
		}
		calendar = new CalendarBean();
		calendar.setYear(year);
		calendar.setMonth(month);
		String day[] = calendar.getCalendar();
		for (int i = 0; i < 42; i++) {
			labelDay[i].setText(day[i]);
		}
		nextMonth = new Button("下月");
		previousMonth = new Button("上月");
		nextMonth.addActionListener(this);
		previousMonth.addActionListener(this);
		Panel pNorth = new Panel(), pSouth = new Panel();
		pNorth.add(previousMonth);
		pNorth.add(nextMonth);
		pSouth.add(showMessage);
		showMessage.setText("日历：" + calendar.getYear() + "年"
				+ calendar.getMonth() + "月");
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.add(pCenter);
		this.add(scrollPane, BorderLayout.CENTER);// 窗口添加scrollPane在中心区域
		this.add(pNorth, BorderLayout.NORTH); // 窗口添加pNorth 在北面区域
		this.add(pSouth, BorderLayout.SOUTH); // 窗口添加pSouth 在南区域
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == nextMonth) {// 获取事件源
			month = month + 1;
			if (month > 12)
				month = 1;
			calendar.setMonth(month);
			String day[] = calendar.getCalendar();
			for (int i = 0; i < 42; i++) {
				labelDay[i].setText(day[i]);
			}
		} else if (e.getSource() == previousMonth) {
			month = month - 1;
			if (month < 1)
				month = 12;
			calendar.setMonth(month);
			String day[] = calendar.getCalendar();
			for (int i = 0; i < 42; i++) {
				labelDay[i].setText(day[i]);
			}
		}
		showMessage.setText("日历：" + calendar.getYear() + "年"
				+ calendar.getMonth() + "月");
	}
}

public class CalendarMain {
	public static void main(String args[]) {
		CalendarFrame frame = new CalendarFrame();
		frame.setBounds(100, 100, 360, 300);
		frame.setVisible(true);
		frame.validate();
		/*
		 * 此段代码由学生独立完成 功能：利用匿名类实现frame窗口事件的监听 当用户单击【关闭】按钮时退出该程序
		 */
		frame.addWindowListener(new WindowAdapter(){
           	public void windowClosing(WindowEvent e) {
         		System.exit(0);	};
		}
		);
	}
}

		
