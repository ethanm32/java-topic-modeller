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
		
		
		
		public void arrayCheck(String[] arrayList1, String[] arrayList2) {
	        Set<String> set1 = new HashSet<String>();
	        Set<String> set2 = new HashSet<String>();
	        Collections.addAll(set1, arrayList1);
	        Collections.addAll(set2, arrayList2);
	        //System.out.println("set1" + set1);
	        //System.out.println("set2" + set2);
	        set1.retainAll(set2);
	        
	        int size = set1.size();
	        
	        int percentage = size * 10;
	        
	        if(percentage < 50) { 
	        	System.out.println("Percentage:" + percentage);
	        	System.out.println("These two documents have very little in common");
	        }
	        else { 
	        	System.out.println("Percentage:" + percentage);
	        	System.out.println("These two documents have quite a bit in common");
	        }
	        
	        
	    }
}

