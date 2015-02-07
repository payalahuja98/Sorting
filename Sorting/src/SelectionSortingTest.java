public class SelectionSortingTest{
	static int[] array = {0,4,-2,6,10};
	public static void main(String[] args){
		printValues();
		selectionSort();
		System.out.println();
		printValues();
	}
	public static int minIndex(int startIndex){	  //minIndex(1)
		int smallest = startIndex;				  //smallest = 1
		for(int i = startIndex; i < array.length; i++){    //for(int i = 1; i < 5; i++)
			if(array[i] < array[smallest]){		  //if(array[1] < array[0]
				smallest = i;
			}
		}
		return smallest;						  //return 0
	}
	public static void selectionSort(){
		for(int i = 0; i < array.length; i++){   //for(int i = 1; i < 5; i++
			int small = minIndex(i);			 //int small = minIndex(1) = 0
			int hold = array[i];				 //hold = array[0]
			array[i] = array[small];			 //array[0] = array[0]
			array[small] = hold;
		}
	}
	public static void printValues(){
		System.out.print(array[0] + "  ");
		for(int i = 1; i < array.length; i++){
			if(i % 10 == 0){
				System.out.println();
			}
			System.out.print(array[i] + "  ");
		}
	}
}
