package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


	
	
	
	
	
	

	
	
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String input = in.nextLine();
//		ArrayList newArr = new ArrayList();
//		ArrayList newestArr = new ArrayList();
//		for(int i = 0 ; i < input.length(); i++) {
//			if(i % 2 == 1) {
//				newArr.add(input.charAt(i));
//			}
//			else if (i%2 == 0) {
//				newestArr.add(input.charAt(i));
//			}
//		}
//		System.out.println(newestArr + " " + newArr);
//		
//		
//		
//		
//	}
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int numberOfStrings = in.nextInt();
//		in.nextLine();
//		
//		
//		for(int i = 0; i < numberOfStrings; i++) {
//			String input = in.nextLine();
//			System.out.println(input);
////			String inputz = in.nextLine();
//			for(int z = 0; z <input.length();z++ ) {
//				if(z%2==0) {
//					System.out.print(input.charAt(z));
//				}
//
//			}
//			
//			
//			System.out.print(" ");
//			for(int c = 0; c <input.length();c++ ) {
//				if(c%2==1) {
//					System.out.print(input.charAt(c));
//
//				}
//				
//			}
//			System.out.println("");
////			for(int o = 0; o < inputz.length(); o++) {
////				if(o%2==0) {
////					System.out.print(inputz.charAt(o));
////				}
////			}
////			System.out.print(" ");
////			for(int l = 0; l < inputz.length(); l++) {
////				if(l%2==1) {
////					System.out.print(inputz.charAt(l));
////				}
////			}
//			
//
//		
//		
//}
//}
//}
	
	import java.io.*;
	import java.util.*;

	public class Solution {

		public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        boolean isPrime = true;
	        int z = 0;
	        for(int i = 0; i<n ; i++){
	        	z = in.nextInt();
	        	if(z<=1) {
	        		System.out.println("Not Prime");
	        	}else {
	        		isPrime = true;
	        		for(int j =2 ; j * j <= z; j++) {
	        			if(z%j == 0) {
	        				isPrime = false;
	        				break;
	        			}
	        		}
	        		if(isPrime) {
	        			System.out.println("Prime");
	        		}else {
	        			System.out.println("Not prime");
	        		}
	        	}

	            
	            
	        }
	        in.close();
	    }
	}
	
	
	
	
	