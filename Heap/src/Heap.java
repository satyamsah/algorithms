import java.nio.channels.IllegalSelectorException;

public class Heap {
	int capacity = 10;
	private int size = 0;
	int[] items = new int[capacity];

	private int getLeftChildIndex(int parentIndex) {
		return 2 * parentIndex + 1;
	}

	private int getRightChildIndex(int parentIndex) {
		return 2 * parentIndex + 2;
	}

	private int getParentIndex(int childIndex) {
		return (childIndex - 1) / 2;
	}

	private boolean hasLeftChild(int index) {
		return getLeftChildIndex(index) < size;
	}

	private boolean hasRightChild(int index) {
		return getRightChildIndex(index) < size;
	}

	private boolean hasParent(int index) {
		return getParentIndex(index) >= 0;
	}

	private int leftChild(int index) {
		return items[getLeftChildIndex(index)];
	}

	private int rightChild(int index) {
		return items[getRightChildIndex(index)];
	}

	private int parent(int index) {
		return items[getParentIndex(index)];
	}

	private void swap(int indexOne, int indexTwo) {
		int temp = items[indexOne];
		items[indexOne] = items[indexTwo];
		items[indexTwo] = temp;
	}

	public int peek() {
		if (size == 0) {
			throw new IllegalSelectorException();
		}
		return items[0];
	}

	public int poll() {
		if (size == 0) {
			throw new IllegalSelectorException();
		}
		int item = items[0];
		items[0] = items[size - 1];
		size--;
		heapifyDown();
		return item;
	}

	public void add(int item) {
		// ensurecapacity();
		items[size - 1] = item;
		heapifyUp();

	}

	private void heapifyUp() {
		// TODO Auto-generated method stub
		int index = size - 1;
		if (hasParent(index)) {
			while (parent(index) > items[index]) {
				swap(getParentIndex(index), index);
				index = getParentIndex(index);
			}
		}

	}

	private void heapifyDown() {

		int index = 0;
		while (hasLeftChild(index)) {
			int smallChildIndex = getLeftChildIndex(index);
			if (hasRightChild(index) && rightChild(index) < items[smallChildIndex]) {
				smallChildIndex = getRightChildIndex(index);
			}
			if(items[index]<items[smallChildIndex]){
				break;
			}
			swap(index, smallChildIndex);
			index=smallChildIndex;
		}

	}

}
