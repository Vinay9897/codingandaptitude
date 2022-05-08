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
    public int pop()
    {
        if(realSize <1)
        {
            System.out.println("Sorry, we can't delete element anymore ");
            return Integer.MIN_VALUE;
        }
        else{
            int removeElement = arr[1];
            arr[1] = arr[realSize];
            realSize--;

            int index = 1;
            while(index <= realSize/2)
            {
                int left = index*2;
                int right = index*2 +1;
                if(arr[left] > arr[index] || arr[right] > arr[index])
                {
                    if(arr[left]> arr[right])
                    {
                        int temp = arr[left];
                        arr[left] = arr[index];
                        arr[index] = temp;
                        index = left;
                    }
                    else{
                        int temp = arr[right];
                        arr[right] = arr[index];
                        arr[index] = temp;
                        index = right;
                    }
                }
                else{
                    break;
            }
            }
            return removeElement;
        }
    }
    public void traverse(){
        for(int i = 1;i<=realSize;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public int peek()
    {
        return arr[1];
    }
    public int min()
    {
        return arr[heapSize];
    }

    public static void main(String[] args) {
        
        MaxHeap maxHeap = new MaxHeap(5);
        maxHeap.add(1);
        maxHeap.add(2);
        maxHeap.add(3);
        maxHeap.add(4);
        maxHeap.add(5);
        maxHeap.traverse();
        System.out.println();
        maxHeap.pop();
        maxHeap.pop();
        maxHeap.pop();
        maxHeap.traverse();
    }
}
