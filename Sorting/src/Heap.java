import java.util.ArrayList;
public class Heap<T extends Comparable<T>> implements PriQueueInterface<T>{
	ArrayList<T> elements;
	int maxIndex;
	int lastIndex;
	int hole;
	
	public Heap(int maxSize){
		elements = new ArrayList<T>(maxSize);
		lastIndex = -1;
		maxIndex = maxSize - 1;
	}
	public boolean isFull(){
		if(lastIndex == maxIndex){
			return true;
		}
		return false;
	}
	public boolean isEmpty() {
		if(elements.size() == 0){
			return true;
		}
		return false;
	}
	private void reheapUp(T element){
		hole = elements.size() - 1;
		while((hole > 0) && (element.compareTo(elements.get((hole - 1) / 2)) > 0)){
			elements.set(hole, elements.get((hole - 1) / 2));
			hole = (hole - 1) / 2;
		}
		elements.set(hole,element);
	}
	public void enqueue(T element) throws PriQueueOverflowException{
		if(lastIndex == maxIndex){
			throw new PriQueueOverflowException("Priority Queue is full");
		}
		else{
			lastIndex++;
			elements.add(lastIndex, element);
			reheapUp(element);
		}
	}
	public T dequeue() throws PriQueueUnderflowException{
		T hold;
		T toMove;
		
		if(lastIndex == -1){
			throw new PriQueueUnderflowException("Priority Queue is empty.");
		}
		else{
			hold = elements.get(0);
			toMove = elements.remove(lastIndex);
			lastIndex--;
			if(lastIndex != -1){
				reheapDown(toMove);
			}
			return hold;
		}
		
	}
	private void reheapDown(T element){
		hole = 0;
		int newhole = newHole(hole,element);
		while(hole != newhole){
			elements.set(hole,elements.get(newhole));
			hole = newhole;
			newhole = newHole(hole,element);
		}
		elements.set(hole,element);
		
	}
	private int newHole(int h, T el){
		int left = (hole * 2) + 1;
		int right = (hole * 2) + 2;
		
		if(left > lastIndex){
			return hole;
		}
		else{
			if(left == lastIndex){
				if(el.compareTo(elements.get(left)) < 0){
					return left;
				}
				else{
					return hole;
				}
			}
			else{
				if(elements.get(left).compareTo(elements.get(right)) < 0){
					if(elements.get(right).compareTo(el) <= 0){
						return hole;
					}
					else{
						return right;
					}
				}
				else{
					if(elements.get(left).compareTo(el) <= 0){
						return hole;
					}
					else{
						return left;
					}
				}
			}
		}
	}
	public String toString(){
		String theHeap = new String("the heap is:\n");
		for(int i = 0; i <= lastIndex; i++){
			theHeap = theHeap + i + ". " + elements.get(i) + "\n";
		}
		return theHeap;
	}
	@Override
	public int compareTo(T arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
