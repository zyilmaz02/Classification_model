

import java.util.*;

public class minHeapClass
{
	public int heapSize;
	public Car [] Arr = new Car[100];
	public minHeapClass()
	{
		heapSize = 0;
	}

	public final void inputToArray(Car item)
	{
		Arr[heapSize] = item;
		heapSize = heapSize + 1;
	}

	public void heapify(int parent)
	{
		int Lson, Rson, smallest;
		Car temp;
		Lson = 2 * parent + 1;
		Rson = 2 * parent + 2;
		
		/* find the largest among Arr[parent], Arr[lson] and Arr[rson] */
		if (Lson <= heapSize - 1 && Arr[Lson].price < Arr[parent].price)
			smallest = Lson;
		else
			smallest = parent;
		if (Rson <= heapSize -1 && Arr[Rson].price < Arr[smallest].price)
			smallest = Rson;

		/* Swap Arr[parent] with Arr[largest]*/
		if (smallest != parent)
		{
			temp = Arr[parent];
			Arr[parent] = Arr[smallest];
			Arr[smallest] = temp;
			heapify(smallest);
		}

	}

	public void buildHeap()
	{
		for (int i = (heapSize - 1) / 2; i >= 0; i--)
			heapify(i);
	}


	public Car extractMin()
	{
		if (heapSize == 0)
		{
			System.out.println("Heap is empty");
			return null;
		}
		else
		{
			Car min = Arr[0];
			Arr[0] = Arr[heapSize - 1];
			heapSize = heapSize - 1;
			heapify(0);
			return min;
		}
	}

	public void heapInsert(Car item)
	{
		if (heapSize <= Arr.length - 1)
		{
			int parent;
			heapSize = heapSize + 1;
			int i = heapSize - 1;
			parent = (i - 1) / 2;
			while (i > 0 && Arr[parent].price < item.price)
			{
				Arr[i] = Arr[parent];
				i = parent;
				parent = (i - 1) / 2;
			}
			Arr[i] = item;
		}
		else 
			System.out.println("It is full!");
	}
	

	public void printHeap()
	{
		for (int i = 0; i <= heapSize - 1; i++) {
			System.out.printf("%d. car in the heap ",i+1);
			System.out.println("\n");
			System.out.println("Make =" +Arr[i].Make+"\n"+"Model ="+Arr[i].Model+"\n"+"Price ="+Arr[i].price+"\n"+ "Mileage ="+Arr[i].mileage+"\n"+"Year ="+Arr[i].Year);
	}
	}

}
