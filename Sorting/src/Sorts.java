import java.util.Random;
public class Sorts {
	static final int SIZE = 50;
	static int[] values = new int[SIZE];
	static boolean sorted;
	
	public static void initValues(){
		Random num = new Random();
		for(int i = 0; i < SIZE; i++){
			values[i] = num.nextInt(100);
		}
	}
	public boolean isSorted(){
		return sorted;
	}
	public void swap(int x, int y){
		int hold = values[x];
		values[x] = values[y];
		values[y] = hold;
	}
	public void printValues(){
		System.out.print("values[0]: " + values[0] + "  ");
		for(int i = 1; i < SIZE; i++){
			if(i % 10 == 0){
				System.out.println();
			}
			System.out.print("values[i]: " + values[i] + "  ");
		}
	}
}
