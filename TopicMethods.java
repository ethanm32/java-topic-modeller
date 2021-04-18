package com.topic.modeller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;





public class TopicMethods {
	
	
	
	// removes all stop words from a string given a stop word array list
	
	public static ArrayList<String> removeStopWords1(String document, ArrayList<String> stopwords) {
		document = document.toLowerCase().trim(); // converts all words to lower case
		   
		ArrayList<String> words = new ArrayList<>(); // creates a new array list
		words.addAll(Arrays.asList(document.split(" "))); //adds each word in the document string to the words array. Each word is determined by a space.
		
		words.removeAll(stopwords); //removes all stop words
		
		return words;
		}
	
	
	
	
	
	
	
	
	/*
	
		Priority queue algorithm approach with help from - https://www.youtube.com/watch?v=cupg2TGIkyM
		 
	*/
		
	public List<String> TenFreq(String[] words, int k) {
			Map<String, Integer> map = new HashMap<>(); //stores the frequencies of each word
			//loops over every word in the string
			for (String word: words) {
				map.put(word, map.getOrDefault(word,0) + 1); //if the word is in the map add a frequency of 1. If not the frequency of that word defaults to 1.
				
			}
			
			//Priority Queue that stores strings
			PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() {

				@Override
				public int compare(String word1, String word2) {
					int frequency1 = map.get(word1); // frequency of word1 from map
					int frequency2 = map.get(word2); // frequency of word2 from map
					
					//if the frequency is the same - alphabetical order is implemented
					if(frequency1 == frequency2) {
						return word2.compareTo(word1);
					}
					
					return frequency1 - frequency2; // if the frequency isnt the same then it is sorted by the lesser frequency
				}
			});
			
			for (Map.Entry<String, Integer> enter: map.entrySet()) {
				queue.add(enter.getKey()); //adds the string to the priority queue
				
				//checks if the size of the queue is greater than the number of elements we have specified.
				if(queue.size() > k) {
					queue.poll(); //returns the element at the head of the queue
				}
			}
			
			List<String> frequentWords = new ArrayList<>(); //frequent words added here
			
			//this adds all the frequent words to the the Array list in reverse
			while (queue.isEmpty() != true) {
				frequentWords.add(queue.poll());
			}
			
			//this puts them all in the correct order
			Collections.reverse(frequentWords);
			
			//returns the array list
			return frequentWords;
		}
		
		
		//this method checks how many words are in common in the two documents
		public String arrayCheck(List<String> setArray1,   List<String> setArray2) {
			
			//two sets are made that contain each array of the documents
			Set<String> set1 = new HashSet<String>(setArray1);
	        Set<String> set2 = new HashSet<String>(setArray2);	       
	        set1.retainAll(set2); //this puts the overlap of both sets into set 1
	        int size = set1.size(); //gets the amount of elements in the set
	        
	        int percentage = size * 10; // gets the percentage of the words in common
	        
	        // Strings returned to display in a dialog box depending on the percentage of words in common 
	        
	        if(percentage == 0) {
	        	return "Percentage: " + percentage + "%" + "\n" + "These two documents have nothing in common";

	        }
	        else if(percentage < 50 && percentage > 0) { 
	        	return "Percentage: " + percentage + "%" + "\n" + "These two documents have very little in common";
	        }
	       
	     
	        else if(percentage >= 50 && percentage < 70) { 
	        	return "Percentage:" + percentage + "%" + "\n" + "These two documents have a bit in common";
	        }
	        
	        return "Percentage:" + percentage + "%" + "\n" + "These two documents have a lot in common";
	        
	        
	    }
		
		
	//this method returns the details of the most frequent words in each document to be displayed in a text area 
	public String displayDetails1(List<String> setArray1, List<String> setArray2) {
		//converts arrays to sets as done in the last method 
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		set1 = new HashSet<String>(setArray1);
        set2 = new HashSet<String>(setArray2);
        return "File 1 - Most frequent words: " + "\n" + set1 + "\n" + "File 2 - Most frequent words: " + "\n" + set2;
        
	}
	
	//this method returns the details of the common words in each document to be displayed in a text area 
	public String displayextraDetails(List<String> setArray1, List<String> setArray2) {
		//converts arrays to sets as done in the last method 
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		set1 = new HashSet<String>(setArray1);
        set2 = new HashSet<String>(setArray2);
        set1.retainAll(set2);
        return "\n" + "Words that match in both files: " + set1;
        
        
	}
	 
}

