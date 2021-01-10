package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceofList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arrayList= new ArrayList<>();
		LinkedList linkedList=new LinkedList<>();
		
		long startTime=System.nanoTime();//Arraylist add
		for (int i=0;i<100000;i++) {
			arrayList.add(i);
		}
		long endTime=System.nanoTime();//arryalist end
		long duration=endTime-startTime;
		System.out.println("Arraylist add duration(nanosec) : " +duration);
		
//		Linked list
		startTime=System.nanoTime();
		for (int i=0;i<100000;i++) {
			linkedList.add(i);
		}
		endTime=System.nanoTime();//linklist end
		duration=endTime-startTime;
		System.out.println("Linklist add duration(nano sec) : " +duration);
		//Retrieving data	
		startTime=System.nanoTime();//Arraylist get
		for (int i=0;i<100000;i++) {
			arrayList.get(i);
		}
		endTime=System.nanoTime();//Arraylist get
		duration=endTime-startTime;
		System.out.println("Arraylist get duration(nano sec) : " +duration);
		//LL get
		startTime=System.nanoTime();
		for (int i=0;i<100000;i++) {
			linkedList.get(i);
		}
		endTime=System.nanoTime();//Linklist get
		duration=endTime-startTime;
		System.out.println("Linklist get duration(nano sec) : " +duration);
		//Removing Data
		startTime=System.nanoTime();//Arraylist get
		for (int i=9999;i>0;i--) {
			arrayList.remove(i);
		}
		endTime=System.nanoTime();//Arraylist get
		duration=endTime-startTime;
		System.out.println("Arraylist remove duration(nano sec) : " +duration);
		//LL get
		startTime=System.nanoTime();
		for (int i=9999;i>0;i--) {
			linkedList.remove(i);
		}
		endTime=System.nanoTime();//Linklist get
		duration=endTime-startTime;
		System.out.println("Linklist remove duration(nano sec) : " +duration);
		
	}
	
	
}
