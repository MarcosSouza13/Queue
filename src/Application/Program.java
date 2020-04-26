package Application;

import java.util.Scanner;

import Entities.Queue;

public class Program {
public static void main(String[] args) {
		
		@SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inform the queue capacity: ");        
        int capacity = scanner.nextInt();
        
        Queue queue = new Queue(capacity);
        
        while(true) {
        	System.out.println("\nOptions");
            System.out.println("0 - Exit");
            System.out.println("1 - Enqueue");
			System.out.println("2 - Dequeue");
			System.out.println("3 - Check the front of the queue");
			System.out.println("4 - Check the rear of the queue");
			System.out.println("5 - Search an element");
            System.out.println("6 - Print the queue");

            System.out.println("\nInform a number: ");
            int ch = scanner.nextInt();
			
			switch(ch) {
				case 0:
					System.out.println("End");
					System.exit(0);
					break;

				case 1:
					System.out.println("\nInform the value: ");
					int n = scanner.nextInt();	
					queue.enqueue(n);
					break;

				case 2:
					if(!queue.isEmpty())
						queue.dequeue();
					else 
						System.out.println("\nError, stack is empty");
					break;

				case 3:
					System.out.println("Front item is " + queue.front());
					break;
				
				case 4:
					System.out.println("Rear item is " + queue.rear());
					break;
				
				case 5:
					System.out.println("\nInform the value: ");
					int x = scanner.nextInt();	
					queue.search(x);
					break;
				
				case 6:
					queue.display();
					break;
				
				default:
					break;
			}
		}
	}
}
