package com.sunilpandey.demos;

public class FindMiddleIndex {
	
	public static void main(String[] args) {
		int array[] = {2, 4, 4, 5, 4, 1};
		try {
			System.out.println("Starting from index 0, adding numbers till index "  
					+ findMiddleIndex(array) + " and adding rest numbers will be equal"
					);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static int findMiddleIndex(int a[]) throws Exception{
		
		
		int endIndex=a.length-1;
		int startIndex = 0;
		int sumLeft = 0;
		int sumRight = 0;
		while(true){
			if(sumLeft > sumRight){
				sumRight += a[endIndex--];
			}else {
				sumLeft += a[startIndex++];
			}
			if(startIndex > endIndex){
				if(sumLeft == sumRight){
					break;
				}else{
					throw new Exception("Please provide proper array");
				}
			}
			
		}
		
		
		
		
		
		return endIndex;
	}

	
}
