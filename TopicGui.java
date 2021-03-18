package com.topic.modeller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class TopicGui extends JFrame implements ActionListener

{
	JButton Button1;
	final JFileChooser fc = new JFileChooser();
	TopicGui(String title)
	{
		super(title);
		setSize(300,300);
		Button1 = new JButton("Select a file");
		Button1.addActionListener(this);
		add(Button1);
		setVisible(true);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == Button1)
		{
			int op = fc.showOpenDialog(Button1);
			if (op == JFileChooser.APPROVE_OPTION)
			{
				File file1 = fc.getSelectedFile();
				try {
					Scanner newScan = new Scanner(file1);
					while (newScan.hasNextLine())
					{
						String newLine = newScan.nextLine();
						System.out.println(newLine);
					}
					newScan.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("Not found");
				}
				
			}
		}
	}
}
