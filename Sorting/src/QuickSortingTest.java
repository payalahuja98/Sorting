public class QuickSortingTest{
	static int[] array = {-2,34,23,11,5};
	static int[] tempArray;
	public static void main(String[] args){
		printValues();
		int splitVal = array[0];	//splitVal = 1
		quickSort(splitVal);
		System.out.println();
		printValues();
	}
	public static void quickSort(int splitVal){
		tempArray = new int[array.length];	
		int index = 0;
		for(int i = 1; i < array.length; i++){		//for(int i = 3; i < 5; i++)
			if(array[i] < splitVal){				//if(0 < 1)
				tempArray[index] = array[i];		//tempArray
				index++;
			}
		}
		tempArray[index] = splitVal;
		int specialIndex = index;
		index++;
		for(int i = 0; i < array.length; i++){		//for(int i = 3; i < 5; i++)
			if(array[i] > splitVal){				//if(0 < 1)
				tempArray[index] = array[i];		//tempArray
				index++;
			}
		}
		for(int i = 0; i < specialIndex - 1; i++){
			if(tempArray[i] > tempArray[i + 1]){
				int hold = tempArray[i];				
				tempArray[i] = tempArray[i + 1];			 
				tempArray[i + 1] = hold;
			}
		}
		for(int i = specialIndex + 1; i < array.length - 1; i++){ 	//i = 1; i < 4; i++
			if(tempArray[i] > tempArray[i + 1]){  					//if(tempArray[0] > tempArray[1])  
				int hold = tempArray[i];		  
				tempArray[i] = tempArray[i + 1];  	 
				tempArray[i + 1] = hold;		  					//-2 23 34 11 5
				i--;                   			        
				i--;												//i = -1;
			}
		}
		transfer(tempArray);
	}
	private static void transfer(int[] temp){
		for(int i = 0; i < array.length; i++){
			array[i] = temp[i];
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
