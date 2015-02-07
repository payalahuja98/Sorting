public interface PriQueueInterface<T> extends Comparable<T> {
	boolean isFull();
	boolean isEmpty();
	void enqueue(T element);
	T dequeue();
	
}
