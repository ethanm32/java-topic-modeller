package com.topic.modeller;

import java.awt.Color;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JFileChooser;

public class TopicGui extends JFrame implements ActionListener

{   

	
	TopicMethods tm = new TopicMethods(); //constructor for topic method class 
	
	
	//java swing 
	
	//labels
	JLabel label1,label2;
	
	
	//buttons
	JButton Button1,Button2;
	
	//text field
	JTextField textField;
	
	//text area 
	JTextArea display;
	
	
	//panels 
	JPanel panel,panel2, panel3, panel4, panel5;
	
	
	//strings created for each file
	String file1str = "";
	String file2str = "";
	
	//arrays used to store the ten most frequent words. These are converted to sets for the common words check also
	List<String> setArray1;
	List<String> setArray2;
	
	//stop words
	String [] stop = {"a","about","above","after","again","against","ain","all","am","an","and","any","are","aren","aren't","as","at","be","because","been","before","being","below","between","both","but","by","can","couldn","couldn't","d","did","didn","didn't","do","does","doesn","doesn't","doing","don","don't","down","during","each","few","for","from","further","had","hadn","hadn't","has","hasn","hasn't","have","haven","haven't","having","he","her","here","hers","herself","him","himself","his","how","i","if","in","into","is","isn","isn't","it","it's","its","itself","just","ll","m","ma","me","mightn","mightn't","more","most","mustn","mustn't","my","myself","needn","needn't","no","nor","not","now","o","of","off","on","once","only","or","other","our","ours","ourselves","out","over","own","re","s","same","shan","shan't","she","she's","should","should've","shouldn","shouldn't","so","some","such","t","than","that","that'll","the","their","theirs","them","themselves","then","there","these","they","this","those","through","to","too","under","until","up","ve","very","was","wasn","wasn't","we","were","weren","weren't","what","when","where","which","while","who","whom","why","will","with","won","won't","wouldn","wouldn't","y","you","you'd","you'll","you're","you've","your","yours","yourself","yourselves","could","he'd","he'll","he's","here's","how's","i'd","i'll","i'm","i've","let's","ought","she'd","she'll","that's","there's","they'd","they'll","they're","they've","we'd","we'll","we're","we've","what's","when's","where's","who's","why's","would","able","abst","accordance","according","accordingly","across","act","actually","added","adj","affected","affecting","affects","afterwards","ah","almost","alone","along","already","also","although","always","among","amongst","announce","another","anybody","anyhow","anymore","anyone","anything","anyway","anyways","anywhere","apparently","approximately","arent","arise","around","aside","ask","asking","auth","available","away","awfully","b","back","became","become","becomes","becoming","beforehand","begin","beginning","beginnings","begins","behind","believe","beside","besides","beyond","biol","brief","briefly","c","ca","came","cannot","can't","cause","causes","certain","certainly","co","com","come","comes","contain","containing","contains","couldnt","date","different","done","downwards","due","e","ed","edu","effect","eg","eight","eighty","either","else","elsewhere","end","ending","enough","especially","et","etc","even","ever","every","everybody","everyone","everything","everywhere","ex","except","f","far","ff","fifth","first","five","fix","followed","following","follows","former","formerly","forth","found","four","furthermore","g","gave","get","gets","getting","give","given","gives","giving","go","goes","gone","got","gotten","h","happens","hardly","hed","hence","hereafter","hereby","herein","heres","hereupon","hes","hi","hid","hither","home","howbeit","however","hundred","id","ie","im","immediate","immediately","importance","important","inc","indeed","index","information","instead","invention","inward","itd","it'll","j","k","keep","keeps","kept","kg","km","know","known","knows","l","largely","last","lately","later","latter","latterly","least","less","lest","let","lets","like","liked","likely","line","little","'ll","look","looking","looks","ltd","made","mainly","make","makes","many","may","maybe","mean","means","meantime","meanwhile","merely","mg","might","million","miss","ml","moreover","mostly","mr","mrs","much","mug","must","n","na","name","namely","nay","nd","near","nearly","necessarily","necessary","need","needs","neither","never","nevertheless","new","next","nine","ninety","nobody","non","none","nonetheless","noone","normally","nos","noted","nothing","nowhere","obtain","obtained","obviously","often","oh","ok","okay","old","omitted","one","ones","onto","ord","others","otherwise","outside","overall","owing","p","page","pages","part","particular","particularly","past","per","perhaps","placed","please","plus","poorly","possible","possibly","potentially","pp","predominantly","present","previously","primarily","probably","promptly","proud","provides","put","q","que","quickly","quite","qv","r","ran","rather","rd","readily","really","recent","recently","ref","refs","regarding","regardless","regards","related","relatively","research","respectively","resulted","resulting","results","right","run","said","saw","say","saying","says","sec","section","see","seeing","seem","seemed","seeming","seems","seen","self","selves","sent","seven","several","shall","shed","shes","show","showed","shown","showns","shows","significant","significantly","similar","similarly","since","six","slightly","somebody","somehow","someone","somethan","something","sometime","sometimes","somewhat","somewhere","soon","sorry","specifically","specified","specify","specifying","still","stop","strongly","sub","substantially","successfully","sufficiently","suggest","sup","sure","take","taken","taking","tell","tends","th","thank","thanks","thanx","thats","that've","thence","thereafter","thereby","thered","therefore","therein","there'll","thereof","therere","theres","thereto","thereupon","there've","theyd","theyre","think","thou","though","thoughh","thousand","throug","throughout","thru","thus","til","tip","together","took","toward","towards","tried","tries","truly","try","trying","ts","twice","two","u","un","unfortunately","unless","unlike","unlikely","unto","upon","ups","us","use","used","useful","usefully","usefulness","uses","using","usually","v","value","various","'ve","via","viz","vol","vols","vs","w","want","wants","wasnt","way","wed","welcome","went","werent","whatever","what'll","whats","whence","whenever","whereafter","whereas","whereby","wherein","wheres","whereupon","wherever","whether","whim","whither","whod","whoever","whole","who'll","whomever","whos","whose","widely","willing","wish","within","without","wont","words","world","wouldnt","www","x","yes","yet","youd","youre","z","zero","a's","ain't","allow","allows","apart","appear","appreciate","appropriate","associated","best","better","c'mon","c's","cant","changes","clearly","concerning","consequently","consider","considering","corresponding","course","currently","definitely","described","despite","entirely","exactly","example","going","greetings","hello","help","hopefully","ignored","inasmuch","indicate","indicated","indicates","inner","insofar","it'd","keep","keeps","novel","presumably","reasonably","second","secondly","sensible","serious","seriously","sure","t's","third","thorough","thoroughly","three","well","wonder"};
	
	//array list to contain stop words later in the program
	ArrayList<String> stopwords = new ArrayList<String>();
		
	final JFileChooser fc = new JFileChooser();
	

	TopicGui(String title)
	{
		super(title);
		
		Collections.addAll(stopwords, stop);
		
		//GUI - layout
		setSize(520,520);
		Color mycolor = new Color(252, 3, 78);
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.white);
		
		//text area 
		display = new JTextArea(50, 30);
		
		
		//labels 
		label1 = new JLabel("Welcome to Topic Modeller!");
		label1.setBackground(Color.white);
		label2 = new JLabel("Pick two files to compare and enter any extra stopwords below");
		label2.setBackground(Color.white);
		
		
		//text field
		textField = new JTextField("Enter an extra stopword");
		textField.addActionListener(this);
		
		
		// Buttons 
		
		Button1 = new JButton("Select a file");
		Button2 = new JButton("Select a file to compare");
	    Button1.setBackground(mycolor);
	    Button2.setBackground(mycolor);
	    Button1.setForeground(Color.white);
	    Button2.setForeground(Color.white);
		Button1.addActionListener(this);
		Button2.addActionListener(this);
		
		
		//Panels
		
		panel = new JPanel(new FlowLayout());
		panel2 = new JPanel(new FlowLayout());
		panel3 = new JPanel(new FlowLayout());
		panel4 = new JPanel(new FlowLayout());
		panel5 = new JPanel(new FlowLayout());
		
		panel3.add(label1);
		panel4.add(label2);
		panel2.add(textField);
		panel.add(Button1);
		panel.add(Button2);
		panel5.add(display);
		
		//adding panels 
		
		add(panel3);
		add(panel4);
		add(panel2);
		add(panel);
		add(panel5);
		
		//ensures all panels are visible
		setVisible(true);
	}
	
	
	//Actions performed on the GUI by user
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == Button1)
		{
			
			//Clears file strings so there are no errors when comparing different files
			file1str = "";
			file2str = "";
			
			//creating a file
			File file1 = null;
			
			//allows for a file chooser to pop up when the first button is chosen
			int buttonChoose = fc.showOpenDialog(Button1);
			if (buttonChoose == JFileChooser.APPROVE_OPTION)
			{
				display.setText("");
				file1 = fc.getSelectedFile();
				//A buffered reader is used here to read in multiple lines to a string
				try {
					BufferedReader fileIn = new BufferedReader(new FileReader(file1));
					String lines = null;
				
					//puts every line that is not null into the lines string
					while ((lines = fileIn.readLine()) != null) {
						file1str += lines.replaceAll("\\p{Punct}",""); // removes any punctuation
						System.out.println(lines);
					}
					fileIn.close(); //closes buffered reader
				} catch (IOException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(this, "This file doesn't exist");
				}
			}
		}
		else if(arg0.getSource() == Button2)
		{
			//creating a file
			File file2 = null;
			
			//allows for a file chooser to pop up when the first button is chosen

			int buttonChoose2 = fc.showOpenDialog(Button1);
			if (buttonChoose2 == JFileChooser.APPROVE_OPTION)
			{
				file2 = fc.getSelectedFile();
				//A buffered reader is used here to read in multiple lines to a string
				try {
						BufferedReader fileIn = new BufferedReader(new FileReader(file2));
						String lines = null;
						
						while ((lines = fileIn.readLine()) != null) {
							file2str += lines.replaceAll("\\p{Punct}",""); // removes any punctuation
							System.out.println(lines);
						}
						
						setArray1 = tm.TenFreq(convertarray1(), 10);
						setArray2 = tm.TenFreq(convertarray2(), 10);
						JOptionPane.showMessageDialog(this, tm.arrayCheck(setArray1,setArray2));
						display.append(tm.displayDetails1(setArray1,setArray2));
						display.append(tm.displayextraDetails(setArray1,setArray2));
						fileIn.close(); //closes buffered reader
				} catch (IOException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(this, "This file doesn't exist");
				}
				
			}
			
	//if text is entered in the text field
	} else if(arg0.getSource() == textField) {
		String text = textField.getText();
		stopwords.add(text); //this text is added to the array list of stop words
		System.out.println(stopwords.toString());
	}
	
		
	
	
		 
	}
	
	
 
	
	
	//this converts the first array list of words to an array
	public String[] convertarray1() {
		ArrayList<String> List1 = new ArrayList<>(); //creation of an array list
		
		List1.addAll(TopicMethods.removeStopWords1(file1str,stopwords)); //adding the words to the array list
		
		String[] wordArray1 = new String[List1.size()]; //creating an array that can contain the words from the array list
		wordArray1 = List1.toArray(wordArray1); //converting to normal array
		
		return wordArray1; //returns array
 		
	}
	
	//this converts the second array list of words to an array
	public String[] convertarray2() {
		ArrayList<String> List2 = new ArrayList<>(); //creation of an array list
		
		List2.addAll(TopicMethods.removeStopWords1(file2str,stopwords)); //adding the words to the array list
		
		String[] wordArray2 = new String[List2.size()]; //creating an array that can contain the words from the array list
		
		wordArray2 = List2.toArray(wordArray2); //converting to normal array
		
		return wordArray2; //returns array
		
	}
	
	
}


