package com.aabed.priority_queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queue = new PriorityQueue<>();

		queue.add("Red");
		queue.add("Green");
		queue.add("Orange");
		queue.add("White");
		queue.add("Black");
		
		IO.println(queue);
	}

}
