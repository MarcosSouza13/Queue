package Entities;

public class Queue {

		private int capacity;
	    private int[] numbers;
	    private int front = 0, rear = 0, quantity = 0;

	    public Queue(int n){
	    	numbers = new int[n];
	    	capacity = n;
	    }

	    public boolean enqueue(int n){
	        if (!isFull()) {
	        	numbers[rear] = n;
	        	rear = (rear + 1) % capacity;
	        	quantity++;
	        	
	        	System.out.println(n + " enqueued to queue");
	        	return true;
	        }
	        return false;
	    }

	    public void display(){
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print(numbers[i] + " ");
	        }
	    }

	    public int search(int n){
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] == n)
	                System.out.println("Number " + n + " is in position: " + i);
	        }
	        return -1;
	    }
	    
	    public int dequeue() {
	        if (!isEmpty()) {
	        	numbers[front] = 0;
	        	front = (front + 1) % capacity;
	        	
	        	System.out.println(front + " dequeued to queue");
	        	return quantity--;
	        } 
	        
	        return -1;
	    }
	    
	    public int front() {
	    	if(isEmpty()) 
	    		return Integer.MIN_VALUE;
	    	
	    	return this.numbers[this.front];
	    }
	    
	    public int rear() {
	    	if(isEmpty()) 
	    		return Integer.MIN_VALUE;
    	
	    	return this.numbers[this.rear];
	    }
	    
	    public boolean isEmpty(){
	        if (quantity == 0) {
	            System.out.println("\nQueue is empty");
	            return true;
	        }
	        return false;
	    }
	    
	    public boolean isFull(){
	        if (quantity == capacity) {
	            System.out.println("\nQueue is full");
	            return true;
	        }
	        return false;
	    }
}
