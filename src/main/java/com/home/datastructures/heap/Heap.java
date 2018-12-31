package com.home.datastructures.heap;

public class Heap {

	private Node[] nodes;
	private int maxSize;
	private int currentSize;

	public Heap(int size) {
		this.nodes = new Node[size];
		this.maxSize = size;
		this.currentSize = 0;
	}

	public int getCurrentSize() {
		return currentSize;
	}

	private boolean isEmpty() {
		return (currentSize == 0);
	}

	public boolean insert(int key) {
		if (currentSize == maxSize) {
			return false;
		}

		Node node = new Node(key);
		nodes[currentSize] = node;

		trickleUp(currentSize);

		currentSize++;

		return true;
	}

	private void trickleUp(int idx) {
		int parentIdx = (idx - 1) / 2;
		Node nodeToInsert = nodes[idx];

		while (idx > 0 && nodes[parentIdx].getKey() < nodeToInsert.getKey()) {
			nodes[idx] = nodes[parentIdx];
			idx = parentIdx;
			parentIdx = (parentIdx - 1) / 2;
		}

		nodes[idx] = nodeToInsert;
	}

	public Node delete() {
		Node root = nodes[0];
		nodes[0] = nodes[--currentSize];

		trickleDown(0);

		return root;
	}

	private void trickleDown(int idx) {
		int largerChildIdx;

		Node top = nodes[idx];

		while (idx < currentSize/2){
			int leftChildIdx = 2 * idx + 1;
			int rightChildIdx = leftChildIdx + 1;

			if(rightChildIdx < currentSize && nodes[leftChildIdx].getKey() < nodes[rightChildIdx].getKey()){
				largerChildIdx = rightChildIdx;
			} else {
				largerChildIdx = leftChildIdx;
			}
			if(top.getKey() >= nodes[largerChildIdx].getKey()){
				break;
			}

			nodes[idx] = nodes[largerChildIdx];
			idx = largerChildIdx;
		}

		nodes[idx] = top;
	}

	public void displayHeap() {
	}
}
