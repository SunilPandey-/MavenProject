package com.sunilpandey.demos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWordInFile {

	public static void main(String[] args) {
		/*HashMap
		The important points about Java HashMap class are:

			A HashMap contains values based on the key.
			It contains only unique elements.
			It may have one null key and multiple null values.
			It maintains no order.*/
		//Creating wordCountMap which holds words as keys and their occurrences as values
		HashMap<String,Integer> wordCountMap = new HashMap<String,Integer>();
		BufferedReader reader = null;
		try{
			reader = new BufferedReader(new FileReader("C:\\Users\\sunil\\Desktop\\JavaPrgList.txt"));
			String currentLine = reader.readLine();
			while(currentLine != null){
				String[] words = currentLine.toLowerCase().split(" ");
				for(String word : words){
					if(wordCountMap.containsKey(word)){
						wordCountMap.put(word, wordCountMap.get(word)+1);
					}
					else{
						wordCountMap.put(word, 1);
					}
				}
				currentLine = reader.readLine();
			}
			String mostRepeatedWord = null;
			int count = 0;
			Set<Entry<String,Integer>> entrySet = wordCountMap.entrySet();
			for(Entry<String,Integer> entry : entrySet){
				if(entry.getValue() > count){
					mostRepeatedWord = entry.getKey();
					count = entry.getValue();
				}
			}
			System.out.println("The most repeated word in input file is : "+mostRepeatedWord);
            
            System.out.println("Number Of Occurrences : "+count);
		}
		catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();           //Closing the reader
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }


	}

}
/*
Step 1 : Create one HashMap object called wordCountMap which will hold words of the input file as keys and their occurrences as values.

HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();

Step 2 : Create BufferedReader object to read the input text file.

BufferedReader reader = new BufferedReader(new FileReader(“Pass The File Location Here”));

Step 3 : Read all the lines of input text file one by one into currentLine using reader.readLine() method.

String currentLine = reader.readLine();

Step 4 : Split the currentLine into words by using space as delimiter. Use toLowerCase() method here if you don’t want case sensitiveness.

String[] words = currentLine.toLowerCase().split(” “);

Step 5 : Iterate through each word of words array and check whether the word is present in wordCountMap. If word is already present in wordCountMap, update its count. Otherwise insert the word as a key and 1 as its value.

if(wordCountMap.containsKey(word))
{ 
         wordCountMap.put(word, wordCountMap.get(word)+1);
}
else
{
         wordCountMap.put(word, 1);
}

Step 6 : Get the mostRepeatedWord and its count by iterating through each entry of the wordCountMap.

Step 7 : Close the resources.*/