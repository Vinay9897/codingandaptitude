package heapimplementation;

public class MinHeap {
    int[] arr ;
    int heapSize;
    int realSize = 0;

    public MinHeap(int heapSize)
    {
        this.heapSize = heapSize;
        //
        arr = new int[heapSize + 1];
        //
        arr[0] = 0;
    }

    // add element in heap
    public void add(int element)
    {
        realSize++;
        if(realSize>heapSize)
        {
            System.out.println("Sorry, you can't add more element");
            realSize--;
            return;
        }
        arr[realSize] = element;

        int index  = realSize;
        int parent = index/2;
        while(arr[parent]> arr[index] && index >1)
        {
            int temp = arr[index];
            arr[index] = arr[parent];
            arr[parent] = temp;
            index = parent;
            parent = index/2;
        }
    }

    // pop() return the deleted element
    public int pop()
    {
       
        if(realSize<0)
        {
            System.out.println("Sorry, you can't delete more elements");
            
            return  Integer.MAX_VALUE;
        }
        else{

        int removeElement = arr[1];
        arr[1] = arr[realSize];
        realSize--;
        int index =1;
        while(index <= realSize/2){
            int left = index*2;
            int right = index*2 +1;

            if(arr[index] > arr[left] || arr[index] > arr[right])
            {
                if(arr[left] < arr[right])
                {
                    int temp = arr[left];
                    arr[left] = arr[index];
                    arr[index] = temp;
                    index = left;
                }
                else
                {
                    int temp = arr[index];
                    arr[index] = arr[right];
                    arr[right] = temp;
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
    public int min(){
        return arr[1];
    }
    public int max(){
        return arr[realSize];
    }
    public void traverse()
    {
        for(int i = 1;i<=realSize;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(5);
        minHeap.add(5);
        minHeap.add(4);
        minHeap.add(3);
        minHeap.add(2);
        minHeap.add(1);
        minHeap.add(6); 
        minHeap.traverse();
        minHeap.pop();
        System.out.println();
        // System.out.println(minHeap.min());
        // System.out.println(minHeap.max());
        minHeap.traverse();
    }
    
}
