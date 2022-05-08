package heapimplementation;

public class MaxHeap {

    int[] arr;
    int heapSize;
    int realSize = 0;
    public MaxHeap(int heapSize)
    {
        this.heapSize = heapSize;
        arr = new int[heapSize +1];
        arr[0] = 0;
    }

    public void add(int element){
         realSize++;
        if(heapSize < realSize)
        {
            realSize--;
            System.out.println("Sorry , we can't add more element");
            return;
        }

        arr[realSize] = element;
        int index = realSize;
        int parent = index/2;
        while((arr[parent] < arr[index]) && index > 1)
        {
            int temp = arr[index];
            arr[index] = arr[parent];
            arr[parent] = temp;
            index = parent;
            parent = index/2;
        }
    }
    public void traverse(){
        for(int i = 1;i<=realSize;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        
        MaxHeap maxHeap = new MaxHeap(5);
        maxHeap.add(1);
        maxHeap.add(2);
        maxHeap.add(3);
        maxHeap.add(4);
        maxHeap.add(5);
        maxHeap.traverse();
    }
}
