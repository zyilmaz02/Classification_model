

import java.util.*;

public final class minHeapTest
{
	public static void main(String args[])
	{
		minHeapClass H = new minHeapClass(); /* create an empty heap */

		System.out.println("Enter the number of items:");
		int n = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.printf("Enter %1$s items:" + "\r\n", n);
		for (int i = 0; i < n; i++) 
		{
			Car item = new Car();
			H.inputToArray(item);
		};
		
		System.out.println("Display the items before build the min heap:");
		H.printHeap();
		
		H.buildHeap(); /* Build the max heap for the inputed items */
		System.out.println("Display the items after build the min heap:");
		H.printHeap();
		
        /* Test the operations of the max heap */
		System.out.println("Enter 1 for extractMin, 2 for heapInsert");
		int s = Integer.parseInt(new Scanner(System.in).nextLine());
		while (s == 1 || s == 2)
		{
			if (s == 1)
			{
				Car min = H.extractMin();
				if (min != null)
				{
					System.out.println("The extracted minimum element is:");
					System.out.println("Make =" +min.Make+"\n"+"Model ="+min.Model+"\n"+"Price ="+min.price+"\n"+ "Mileage ="+min.mileage+"\n"+"Year ="+min.Year);
					System.out.println("The elements in the array after extraction:");
					H.printHeap();
				};
			};
			if (s == 2)
			{
				System.out.println("Insert a new item to the heap:");
				Car newItem = new Car();
				H.heapInsert(newItem);
				System.out.println("The elements in the array after insertion:");
				H.printHeap();
			};
			System.out.println("Enter 1 for extractMin, 2 for heapInsert");
			s = Integer.parseInt(new Scanner(System.in).nextLine());
		}
	}
}
