package com.alsahli.UI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TaskPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7879733092259339913L;
	private JCheckBox check;
	private JLabel label;
	
	public TaskPanel()
	{
		check = new JCheckBox();
		label = new JLabel("This is a test");
		check.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (check.isSelected())
				{
					Map attributes =label.getFont().getAttributes();
					attributes.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
					label.setFont(new Font(attributes));
				}else
				{
					label.setFont(getFont());
				}
			}
		});
		JButton btn = new JButton("X");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getParent().removeAll(); // needs double buffering
			}
		});
		this.add(check);
		this.add(label);
		this.add(btn);
		this.setVisible(true);
	}
}
