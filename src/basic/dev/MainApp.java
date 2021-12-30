package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bai 1:
		int arr[] = new int [5];
		//Cau a
		nhap(arr);
		//Cau b
		in(arr);
		//Cau c
		phanTuLonNhat(arr);
		
	}
	static void nhap(int arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mang 5 so Nguyen");
		for(int i = 0;i < arr.length; i ++) {
			arr[i] = sc.nextInt();
			
			
		}
	 
		
	}
	static void in(int arr[]) {
		System.out.println(" Cac phan tu cua mang ");
		for (int i=0; i <arr.length; i ++) {
		System.out.println(arr[i]);
		}
	}
	static void phanTuLonNhat(int arr[]) {
		int LonNhat = arr[0];
		for (int i = 0;  i< arr.length; i++) {
			if( arr[i]>LonNhat) {
				LonNhat = arr[i];
			}
		}
		System.out.println(LonNhat);
		
	}
}
