public class MergeSortingTest{
	static int[] array = {2,3,4,-2};
	static int[] tempArray;
	public static void main(String[] args){
		printValues();
		mergeSort(0,array.length - 1);  //mergeSort(0,4)
		System.out.println();
		printValues();
	}
	public static void mergeSort(int first, int last){	//mergeSort(0,4)	mergeSort(0,2)   mergeSort(0,1)   mergeSort(1,4)   mergeSort(1,2)
		if(first < last){								//if(0 < 4)			if(0 < 2)		 if(0 < 1)		  if(1 < 4)		   if(1 < 2)
			int middle = (first + last) / 2;			//middle = 2		middle = 1		 middle = 0		  middle = 2	   middle = 1
			mergeSort(first,middle);					//mergeSort(0,2)    mergeSort(0,1)   mergeSort(0,0)   mergeSort(1,2)   mergeSort(1,1)
			mergeSort(middle + 1,last);					//mergeSort(1,4)    												   mergeSort(2,4)
			merge(first,middle,middle + 1,last);
		}
	}
	public static void merge(int leftFirst, int leftLast, int rightFirst, int rightLast){
		tempArray = new int[array.length];
		int index = leftFirst;
		int saveFirst = leftFirst;
		
		while((leftFirst <= leftLast) && (rightFirst <= rightLast)){
			if(array[leftFirst] < array[rightFirst]){
				tempArray[index] = array[leftFirst];
				leftFirst++;
			}
			else{
				tempArray[index] = array[rightFirst];
				rightFirst++;
			}
			index++;
		}
		while(leftFirst <= leftLast){
			tempArray[index] = array[leftFirst];
			leftFirst++;
			index++;
		}
		while(rightFirst <= rightLast){
			tempArray[index] = array[rightFirst];
			rightFirst++;
			index++;
		}
		for(index = saveFirst; index <= rightLast; index++){
			array[index] = tempArray[index];
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
