public class ArrangeEvenNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        int len = arr.length;
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]%2==0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i]  = temp;
                i=i+1;
            }
            
        
        }
        for(int k =0 ;k < len;k++){
            
            System.out.print(arr[k]+ " ");
        }
    }
}
// Approach 2    TC : O(n^2)  , SC = O(n)
        //     int count =0;
        // for(int i =0;i<arr.length;i++){
        //     for(int j =i;j<arr.length;j++){
        //         if(arr[j]%2==0){
        //             int temp = arr[j];
        //             arr[j] = arr[i];
        //             arr[i] = temp;
        //             count+=1;
        //             break;
        //         }
                
        //     }
        //     System.out.print(arr[i] +" ");
//         }
        
//     }
    
// }
