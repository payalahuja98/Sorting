public class BubbleSortingTest{
	static int[] array = {0,-2,-17,23,-2};
	public static void main(String[] args){
		printValues();
		bubbleSort();
		System.out.println();
		printValues();
	}
	public static void bubbleSort(){
		for(int i = 0; i < array.length; i++){          //i = 4
			for(int j = i + 1; j < array.length; j++){ //j = 5
				if(array[j] < array[i]){
					int hold = array[i];				
					array[i] = array[j];			 
					array[j] = hold;
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
