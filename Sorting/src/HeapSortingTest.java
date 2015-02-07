public class HeapSortingTest{
	static int size = 6;
	static PriQueueInterface<Integer> test = new Heap(size);
	static int[] array;
	public static void main(String[] args){
		test.enqueue(6);						//{ 6, 5, 3, 1, 8, 7, 2, 4 }
		//test.enqueue(5);
		test.enqueue(3);
		test.enqueue(1);
		test.enqueue(8);
		test.enqueue(7);
		//test.enqueue(2);
		test.enqueue(4);
		System.out.println(test.toString());
		System.out.println();
		heapSort();
		printValues();
	}
	private static void heapSort(){
		array = new int[size];
		for(int i = 0; i < size; i++){
			array[i] = test.dequeue();
			
		}
	}
	private static void printValues(){
		System.out.print(array[0] + "  ");
		for(int i = 1; i < array.length; i++){
			if(i % 10 == 0){
				System.out.println();
			}
			System.out.print(array[i] + "  ");
		}
	}
}
