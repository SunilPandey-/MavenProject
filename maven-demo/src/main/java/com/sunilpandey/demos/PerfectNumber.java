package com.sunilpandey.demos;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in = 0;
		System.out.println("Enter a number to check whether it is a perfect number ");
		Scanner sc = new Scanner(System.in);
		in = sc.nextInt();
		perfectNumber(in);
		

	}
	
	public static void perfectNumber(int n){
		int sum=0;
		for(int i =1; i<n;i++){
			if(n%i == 0){
				sum = sum+i;
			}
			
		}
		
		if(sum == n){
			System.out.println("Number " + n + " is a perfect number");
		}else{
			System.out.println("Number " + n + " is not a perfect number");
		}
		
	}

}
