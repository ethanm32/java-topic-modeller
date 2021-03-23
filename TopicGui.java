package com.topic.modeller;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class TopicGui extends JFrame implements ActionListener

{
	JButton Button1,Button2;
	JPanel panel;
	final JFileChooser fc = new JFileChooser();
	TopicGui(String title)
	{
		super(title);
		setSize(300,300);
		setLayout(new FlowLayout());
		Button1 = new JButton("Select a file");
		Button2 = new JButton("Select a file to compare");
		Button1.addActionListener(this);
		Button2.addActionListener(this);
		panel = new JPanel(new FlowLayout());
		panel.add(Button1);
		panel.add(Button2);
		add(panel);
		setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		List<String> file_1 = new ArrayList<String>();
		List<String> file_2 = new ArrayList<String>();
		if(arg0.getSource() == Button1)
		{
			int buttonChoose = fc.showOpenDialog(Button1);
			if (buttonChoose == JFileChooser.APPROVE_OPTION)
			{
				File file1 = fc.getSelectedFile();
				try {
					Scanner newScan = new Scanner(file1);
					while (newScan.hasNextLine())
					{
						file_1.add(newScan.nextLine());
						for(int i = 0;i < file_1.size(); i++) {
							System.out.println(file_1.get(i));
						}
					}
					newScan.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("Not found");
				}
				
			}
		}
		else if(arg0.getSource() == Button2)
		{
			int buttonChoose2 = fc.showOpenDialog(Button1);
			if (buttonChoose2 == JFileChooser.APPROVE_OPTION)
			{
				File file2 = fc.getSelectedFile();
				try {
					Scanner newScan2 = new Scanner(file2);
					while (newScan2.hasNextLine())
					{
						file_2.add(newScan2.nextLine());
						for(int i = 0;i < file_2.size(); i++) {
							System.out.println(file_2.get(i));
						}
					}
					newScan2.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("Not found");
				}
				
			}
	}
 }
	
}
