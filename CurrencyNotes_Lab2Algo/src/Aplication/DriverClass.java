package Aplication;
import java.util.Arrays;
import java.util.Scanner;

import ServiceCodes.BubbleSort;
import ServiceCodes.NotesCount;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //HAS-A
		System.out.println("Please enter the size of currency denomination");
		int size=sc.nextInt();
		
		int currency[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Please enter the currency denominations value "+i);
			currency[i]=sc.nextInt();
		}
		System.out.println("B4" +Arrays.toString(currency));
		BubbleSort bs=new BubbleSort();
		bs.sort(currency);
		System.out.println("AF" +Arrays.toString(currency));
		
		
		System.out.println("Please enter the amount you want to pay");
		int amount=sc.nextInt();
		
		NotesCount nc=new NotesCount();
		nc.counting(currency,amount);

	}

}