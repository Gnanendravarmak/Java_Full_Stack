package com.grayMatter;

import java.util.Arrays;
import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,7,4,5,3,2,8,2,9};
//		arr[0]=45;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i=0;i<5;i++) {
//			arr[i]=sc.nextInt();
//			
//			
//		}
		
		System.out.println(Arrays.toString(arr));
		
//		int sum=0;
//		
//		for(int i=0;i<5;i++) {
//			sum += arr[i];
//			if(arr[i]%2==0) {
//				System.out.println(arr[i]);
//			}
//		}
		
//		System.out.println(sum);
		
//		isPrime(10);
		
//		search(arr,9);
		binary(arr,4);
		
		dupliactes(arr);
		insertAt(arr,5);
		
		deleteAt(arr,3);
		
		
		int matrix1 [][] = {
				{1,2,3,},
				{4,5,6},
				{7,8,9}
		};
		int matrix2 [][] = {
				{7,8,9},
				{4,5,6},
				{1,2,3}
		};
		
		
		findAdd(matrix1,matrix2);
		
		

	}
	
	
	
	
	
	private static void findAdd(int[][] matrix1, int[][] matrix2) {

		int sum=0;
		
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix1[0].length;j++) {
				System.out.println(matrix1[i][j]+" "+matrix2[i][j]);
				sum+=matrix1[i][j]+matrix1[i][j];
			}
		}
		
		System.out.println(sum);

		
	}





	public static void deleteAt(int arr[],int pos) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(i==pos) {
				arr[i]=-1;
			}
		}
		int j;
		boolean flag = false;
		for(j=0;j<arr.length-1;j++) {
			if(arr[j] == -1) {
				flag=true;
				break;
			}
		}
		
		System.out.println(j);
		
		for(int k=j;k<arr.length-1;k++) {
			arr[k]=arr[k+1];
		}
		
		arr[arr.length-1]=0;
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insertAt(int arr[],int pos) {
		
		int k=0;
		
		
		if(pos > arr.length-1) {
			System.out.println("Unable to insert");
		}
		
		System.out.println(arr[arr.length-1]);
		
		for(int i=arr.length-1;i>0;i--) {
			
			if(pos==k) {
				
				arr[k]=pos;
				
			}else {
				arr[i]=arr[i-1];
				k++;
			}
			
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	
	
	public static void dupliactes(int arr[]) {
		
		int num =0;
		
		for(int ar: arr) {
			if(ar==2) {
				num++;
			}
		}
		
		System.out.println(num);
	}
	
	
	
	
//	public static void search(int arr[],int target) {
//		for(int num: arr) {
//			if(num==target) {
//				System.out.println("Element found");
//				break;
//			}
//		}
//		
//		System.out.println("Element Not found");
//		
//	}
	
	public static void binary(int arr[],int target) {
		
		
		int left =0, right = arr.length-1;
		
		
		
		while(left <= right) {
			int mid = left +(right-left)/2;
			if(arr[mid]==target) {
				System.out.println("Element found");
				break;
			}
			
			else if(arr[mid] < target) {
				left = mid+1;
				
			}else {
				right = mid - 1;
			}
		}
		
//		System.out.println("Elent not found");
		
		
				
	}
	
	
//	public static boolean isPrime(int num) {
//		
//		for(int i=2;i<num;i++) {
//			if(num%i==0) {
//				return false;
//			}
//		}
//		
//		return true;
//	}

}
