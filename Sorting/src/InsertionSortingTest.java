public class InsertionSortingTest{
	static int[] array = {-2,0,45,23,0};
	public static void main(String[] args){
		printValues();
		insertionSort();
		System.out.println();
		printValues(); 
	}
	public static void insertionSort(){
		for(int i = 1; i < array.length; i++){ //i = 4    /0
			for(int j = i - 1; j >= 0; j--){   //j = 3    /12
				if(array[i] < array[j]){	   //array[4] < array[3]  /0 < 12
					int hold = array[i];				
					array[i] = array[j];			 
					array[j] = hold;
					i = j;
				}
			}
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
