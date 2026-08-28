class MedianFinder {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
       maxHeap = new PriorityQueue<Integer>((a,b)-> b-a);
       minHeap = new PriorityQueue<Integer>((a,b)-> a-b);
    }
    
    public void addNum(int num) {
        // Step 1: Always push to maxHeap
        maxHeap.add(num);

        // Step 2: Move the largest of maxHeap to minHeap
        minHeap.add(maxHeap.poll());

        // Step 3: Balance sizes (maxHeap can have one extra)
        if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if(minHeap.size()==maxHeap.size())
            return (double) (minHeap.peek()+maxHeap.peek())/2.0;
        else
            return (double) maxHeap.peek();
    }
}
