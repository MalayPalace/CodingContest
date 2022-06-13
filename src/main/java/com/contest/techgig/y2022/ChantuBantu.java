/***********************************
 * AlgoSolutions Project
 * Filename: ChantuBantu.java
 * Author : malay
 * Date : 08-May-2022
 * 
 **********************************/
package com.contest.techgig.y2022;

import java.util.Scanner;

import com.malay.util.ExecutionCalc;

public class ChantuBantu {

	public static void main(String[] args) {

		ExecutionCalc.start();
		Scanner s = new Scanner(System.in);
		int noOfTest = s.nextInt();
		s.nextLine();

		for (int i = 0; i < noOfTest; i++) {
			// Inputs
			int giftReq = s.nextInt();
			s.nextLine();
			int giftAvailable = s.nextInt();
			s.nextLine();
			String giftPriceStr = s.nextLine();

			ChantuBantu ob = new ChantuBantu();
			System.out.println(ob.getNLowestGiftsSum(giftPriceStr, giftAvailable, giftReq));

		}
		s.close();
		ExecutionCalc.endAndPrint();
	}

	private long getNLowestGiftsSum(String giftPriceStr, int giftAvailable, int giftReq) {
		String[] gifts = giftPriceStr.split(" ");
		SmallestArray arr = new SmallestArray(giftReq);

		for (int i = 0; i < giftAvailable; i++) {
			int giftAmount = Integer.parseInt(gifts[i]);

			arr.addToArray(giftAmount);
		}
		return arr.getSum();
	}

	class SmallestArray {

		Node start;
		int capacity;
		int size = 0;

		public SmallestArray(int capacity) {
			this.capacity = capacity;
		}

		public void addToArray(int value) {
			if (size == 0) {
				// For entering the first element
				this.start = new Node(value);
				size++;
			} else {
				Node iter = start;
				Node previous = start;
				boolean endFlag = true;

				do {
					if (value > iter.getValue() || iter.getNext() == null) {
						// Found the insertion point
						endFlag = false;

						if (iter == previous) {
							// Adding at the very start
							this.start = new Node(value);
							this.start.setNext(iter);
							size++;
						} else if (value <= iter.getValue()) {
							// Adding at the end
							Node newNode = new Node(value);
							iter.setNext(newNode);
							size++;
						} else {
							// Adding at somewhere in middle
							Node newNode = new Node(value);
							newNode.setNext(iter);
							previous.setNext(newNode);
							size++;
						}
					}
					previous = iter;
					iter = iter.getNext();
				} while (endFlag);
			}

			// If size is more than capacity, remove the largest(which is at the start of the linkedList)
			if (size > capacity) {
				this.start = start.getNext();
				size--;
			}
		}

		public long getSum() {
			Node iter = start;

			long sum = iter.getValue();
//			System.out.print(iter.getValue());
			while (iter.getNext() != null) {
				iter = iter.getNext();
				sum += iter.getValue();
//				System.out.print(" " + iter.getValue());
			}
			return sum;
		}

		class Node {
			private int value;
			private Node next = null;

			Node(int value) {
				this.value = value;
			}

			public void setValue(int value) {
				this.value = value;
			}

			public int getValue() {
				return value;
			}

			public Node getNext() {
				return next;
			}

			public void setNext(Node next) {
				this.next = next;
			}
		}
	}
}
