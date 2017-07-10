package com.sunilpandey.demos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			FileReader file = new FileReader("C:\\Users\\sunil\\Desktop\\StepGitPush.txt");
			BufferedReader br = new BufferedReader(file);
			
			FileWriter fr = new FileWriter("C:\\Users\\sunil\\Desktop\\Java_output.txt");
			BufferedWriter bw = new BufferedWriter(fr);
			String line= br.readLine();
			while(line != null){
				String[] arr = line.split(" ");
				bw.write(arr[0]);
				bw.newLine();
				bw.flush();
				line=br.readLine();
				
			}
			bw.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
