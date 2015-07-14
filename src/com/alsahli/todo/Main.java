package com.alsahli.todo;

import javax.swing.JFrame;

import com.alsahli.UI.TaskPanel;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("TODO");
		TaskPanel pan = new TaskPanel();
		frame.add(pan);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(60, 60);
		//frame.setLocation(null);
		frame.setVisible(true);
		
	}

}
