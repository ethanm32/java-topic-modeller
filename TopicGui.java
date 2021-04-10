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
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class TopicGui extends JFrame implements ActionListener

{
	JButton Button1,Button2;
	ArrayList<String> file_1 = new ArrayList<String>();
	ArrayList<String> file_2 = new ArrayList<String>();
	ArrayList<String> new_file_1 = new ArrayList<String>();
	String str = "";
	String [] stop = {"a","about","above","after","again","against","ain","all","am","an","and","any","are","aren","aren't","as","at","be","because","been","before","being","below","between","both","but","by","can","couldn","couldn't","d","did","didn","didn't","do","does","doesn","doesn't","doing","don","don't","down","during","each","few","for","from","further","had","hadn","hadn't","has","hasn","hasn't","have","haven","haven't","having","he","her","here","hers","herself","him","himself","his","how","i","if","in","into","is","isn","isn't","it","it's","its","itself","just","ll","m","ma","me","mightn","mightn't","more","most","mustn","mustn't","my","myself","needn","needn't","no","nor","not","now","o","of","off","on","once","only","or","other","our","ours","ourselves","out","over","own","re","s","same","shan","shan't","she","she's","should","should've","shouldn","shouldn't","so","some","such","t","than","that","that'll","the","their","theirs","them","themselves","then","there","these","they","this","those","through","to","too","under","until","up","ve","very","was","wasn","wasn't","we","were","weren","weren't","what","when","where","which","while","who","whom","why","will","with","won","won't","wouldn","wouldn't","y","you","you'd","you'll","you're","you've","your","yours","yourself","yourselves","could","he'd","he'll","he's","here's","how's","i'd","i'll","i'm","i've","let's","ought","she'd","she'll","that's","there's","they'd","they'll","they're","they've","we'd","we'll","we're","we've","what's","when's","where's","who's","why's","would","able","abst","accordance","according","accordingly","across","act","actually","added","adj","affected","affecting","affects","afterwards","ah","almost","alone","along","already","also","although","always","among","amongst","announce","another","anybody","anyhow","anymore","anyone","anything","anyway","anyways","anywhere","apparently","approximately","arent","arise","around","aside","ask","asking","auth","available","away","awfully","b","back","became","become","becomes","becoming","beforehand","begin","beginning","beginnings","begins","behind","believe","beside","besides","beyond","biol","brief","briefly","c","ca","came","cannot","can't","cause","causes","certain","certainly","co","com","come","comes","contain","containing","contains","couldnt","date","different","done","downwards","due","e","ed","edu","effect","eg","eight","eighty","either","else","elsewhere","end","ending","enough","especially","et","etc","even","ever","every","everybody","everyone","everything","everywhere","ex","except","f","far","ff","fifth","first","five","fix","followed","following","follows","former","formerly","forth","found","four","furthermore","g","gave","get","gets","getting","give","given","gives","giving","go","goes","gone","got","gotten","h","happens","hardly","hed","hence","hereafter","hereby","herein","heres","hereupon","hes","hi","hid","hither","home","howbeit","however","hundred","id","ie","im","immediate","immediately","importance","important","inc","indeed","index","information","instead","invention","inward","itd","it'll","j","k","keep","keeps","kept","kg","km","know","known","knows","l","largely","last","lately","later","latter","latterly","least","less","lest","let","lets","like","liked","likely","line","little","'ll","look","looking","looks","ltd","made","mainly","make","makes","many","may","maybe","mean","means","meantime","meanwhile","merely","mg","might","million","miss","ml","moreover","mostly","mr","mrs","much","mug","must","n","na","name","namely","nay","nd","near","nearly","necessarily","necessary","need","needs","neither","never","nevertheless","new","next","nine","ninety","nobody","non","none","nonetheless","noone","normally","nos","noted","nothing","nowhere","obtain","obtained","obviously","often","oh","ok","okay","old","omitted","one","ones","onto","ord","others","otherwise","outside","overall","owing","p","page","pages","part","particular","particularly","past","per","perhaps","placed","please","plus","poorly","possible","possibly","potentially","pp","predominantly","present","previously","primarily","probably","promptly","proud","provides","put","q","que","quickly","quite","qv","r","ran","rather","rd","readily","really","recent","recently","ref","refs","regarding","regardless","regards","related","relatively","research","respectively","resulted","resulting","results","right","run","said","saw","say","saying","says","sec","section","see","seeing","seem","seemed","seeming","seems","seen","self","selves","sent","seven","several","shall","shed","shes","show","showed","shown","showns","shows","significant","significantly","similar","similarly","since","six","slightly","somebody","somehow","someone","somethan","something","sometime","sometimes","somewhat","somewhere","soon","sorry","specifically","specified","specify","specifying","still","stop","strongly","sub","substantially","successfully","sufficiently","suggest","sup","sure","take","taken","taking","tell","tends","th","thank","thanks","thanx","thats","that've","thence","thereafter","thereby","thered","therefore","therein","there'll","thereof","therere","theres","thereto","thereupon","there've","theyd","theyre","think","thou","though","thoughh","thousand","throug","throughout","thru","thus","til","tip","together","took","toward","towards","tried","tries","truly","try","trying","ts","twice","two","u","un","unfortunately","unless","unlike","unlikely","unto","upon","ups","us","use","used","useful","usefully","usefulness","uses","using","usually","v","value","various","'ve","via","viz","vol","vols","vs","w","want","wants","wasnt","way","wed","welcome","went","werent","whatever","what'll","whats","whence","whenever","whereafter","whereas","whereby","wherein","wheres","whereupon","wherever","whether","whim","whither","whod","whoever","whole","who'll","whomever","whos","whose","widely","willing","wish","within","without","wont","words","world","wouldnt","www","x","yes","yet","youd","youre","z","zero","a's","ain't","allow","allows","apart","appear","appreciate","appropriate","associated","best","better","c'mon","c's","cant","changes","clearly","concerning","consequently","consider","considering","corresponding","course","currently","definitely","described","despite","entirely","exactly","example","going","greetings","hello","help","hopefully","ignored","inasmuch","indicate","indicated","indicates","inner","insofar","it'd","keep","keeps","novel","presumably","reasonably","second","secondly","sensible","serious","seriously","sure","t's","third","thorough","thoroughly","three","well","wonder"};
	ArrayList<String> stopwords = new ArrayList<String>();
	boolean check1; 
	boolean check2;
	JPanel panel;
	final JFileChooser fc = new JFileChooser();
	TopicGui(String title)
	{
		super(title);
		setSize(300,300);
		Collections.addAll(stopwords, stop);
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
		//List<String> file_1 = new ArrayList<String>();
		//List<String> file_2 = new ArrayList<String>();
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
						StringBuffer sb = new StringBuffer();
						for (String s : file_1) {
					         sb.append(s);
					         sb.append(" ");
					      }
						
						str += sb.toString();
						System.out.println("This is the string" + str);
						//for(int i = 0;i < file_1.size(); i++) {
						//	System.out.println(file_1.get(i));
						//}
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
						StringBuffer sb = new StringBuffer();
						for (String s : file_2) {
					         sb.append(s);
					         sb.append(" ");
					      }
						String str2 = sb.toString();
						//removeStopWords1(str, stop);
						//removeStopWords2(str2, stop);
						printingOutArrayLists();
						printFiles();
						System.out.println(TenFreq(convertarray1(), 10));
						System.out.println(TenFreq(convertarray2(), 10));
						//for(int i = 0;i < file_2.size(); i++) {
						//	System.out.println(file_2.get(i));
						//}
					}
					newScan2.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("Not found");
				}
				
			}
	}
		doTheyEqual();
		//printStopwords();
	
	
		
 }
	
	
	public void printFiles() {
		System.out.println(file_1);
		System.out.println(file_2) ;
	}
	
	public void doTheyEqual() {
		if(file_1.equals(file_2)) {
			System.out.println("These are the same file");
		}
		else {
			System.out.println("These may be similiar in topic");
		}
	}
	
	
	public static ArrayList removeStopWords1(String document, String[] stopwords) {
		document = document.toLowerCase().trim();
		   
		ArrayList<String> words = new ArrayList<>();
		words.addAll(Arrays.asList(document.split(" ")));
		
		List<String> stopList = new ArrayList<>();
		stopList.addAll(Arrays.asList(stopwords));
		
		words.removeAll(stopList);
		//System.out.println("Text without stop words 1 : " + words.toString());
		return words;
		
		
	}
	
	public static ArrayList removeStopWords2(String document, String[] stopwords) {
		document = document.toLowerCase().trim();
		
		ArrayList<String> words2 = new ArrayList<>();
		words2.addAll(Arrays.asList(document.split(" ")));
		
		List<String> stopList2 = new ArrayList<>();
		stopList2.addAll(Arrays.asList(stopwords));
		
		words2.removeAll(stopList2);
		//System.out.println("Text without stop word 2: " + words2.toString());
		return words2;
		
		
	}
	
	
	public void printingOutArrayLists() {
		ArrayList<String> List1 = new ArrayList<>();
		List1.addAll(removeStopWords1(str,stop));
		ArrayList<String> List2 = new ArrayList<>();
		List2.addAll(removeStopWords2(str,stop));
		System.out.println("Hi" + List1);
		System.out.println("Hi" + List2);
	}
	
	public String[] convertarray1() {
		ArrayList<String> List1 = new ArrayList<>();
		List1.addAll(removeStopWords1(str,stop));
		String[] wordArray1 = new String[List1.size()];
		wordArray1 = List1.toArray(wordArray1);
		return wordArray1;
		
	}
	public String[] convertarray2() {
		ArrayList<String> List2 = new ArrayList<>();
		List2.addAll(removeStopWords2(str,stop)); 
		String[] wordArray2 = new String[List2.size()];
		wordArray2 = List2.toArray(wordArray2);
		return wordArray2;
		
	}
	
	
	//Priority queue algorithm approach with help from - https://www.youtube.com/watch?v=cupg2TGIkyM
	public List<String> TenFreq(String[] words, int k) {
		Map<String, Integer> map = new HashMap<>();
		for (String word: words) {
			map.put(word, map.getOrDefault(word,0) + 1);
			
		}
		
		PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() {

			@Override
			public int compare(String word1, String word2) {
				int frequency1 = map.get(word1);
				int frequency2 = map.get(word2);
				if(frequency1 == frequency2) {
					return word2.compareTo(word1);
				}
				return frequency1 - frequency2;
			}
		});
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			queue.add(entry.getKey());
			if(queue.size() > k) queue.poll();
		}
		
		List<String> frequentWords = new ArrayList<>();
		while (!queue.isEmpty()) {
			frequentWords.add(queue.poll());
		}
		
		
		Collections.reverse(frequentWords);
		
		return frequentWords;
	}
	
	
}


