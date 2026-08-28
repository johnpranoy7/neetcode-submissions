class MedianFinder {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
       maxHeap = new PriorityQueue<Integer>((a,b)-> b-a);
       minHeap = new PriorityQueue<Integer>((a,b)-> a-b);
    }
    
    public void addNum(int num) {
        maxHeap.add(num);

        minHeap.add(maxHeap.poll());

        //balancing btw both heaps
        if(minHeap.size()>maxHeap.size())
            maxHeap.add(minHeap.poll());
    }
    
    public double findMedian() {
        if(minHeap.size()==maxHeap.size())
            return (double) (minHeap.peek()+maxHeap.peek())/2.0;
        else
            return (double) maxHeap.peek();
    }
}
