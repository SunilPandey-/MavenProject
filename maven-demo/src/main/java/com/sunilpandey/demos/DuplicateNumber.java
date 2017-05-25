package com.sunilpandey.demos;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;

public class DuplicateNumber {

	/*Question - You have got a range of numbers between 1 to N,
	   where one of the number is repeated.You need to write a program 
	   to find out the duplicate number without using loop.*/
	
	/*Answer - You are given a list of length n+1 which contains the numbers 1,……,n,
	one of them appearing twice (and the rest appearing once).
   Find the number which appears twice.
  The sum of numbers from 1 to n is n(n+1)/2, 
  so if you subtract that from the sum of the list you get the number appearing twice.*/
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i=1;i<30;i++){
			numbers.add(i);
		}
		// adding duplicate number into list
		numbers.add(21);
		//System.out.println("list is : " + numbers);
		DuplicateNumber dn = new DuplicateNumber();
		
		System.out.println("Duplicate number is : " +dn.findDuplicateNumbers(numbers) );
		
	}
	
	public int findDuplicateNumbers(List<Integer> numbers){
		
		int highestNumber = numbers.size() - 1;
		System.out.println(highestNumber);
		int total =  getSum(numbers);
		int duplicate = total - (highestNumber*(highestNumber+1)/2);
		return duplicate;
		
	}
	
	public int getSum(List<Integer> numbers){
		int sum = 0;
		for (int num : numbers){
			
			sum += num;
		}
		//System.out.println(sum);
		return sum;
		
	}
	
}
