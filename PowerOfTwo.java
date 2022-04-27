import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();
        // int count = 0;
        // int r = 0;
        
        // while(n>0){
        //     n = n / 2;
        //     r = n %2;
        //     System.out.println("n="+n +" r= "+ r);
        //     if( r == 1){
        //         count = count + 1;
        //         System.out.println("count:"+ count);
        //     }
        // }
        // if(count== 1){
        //     System.out.println("Number is 2's power");
    
        // }
        // else{
        //     System.out.println("Number is not 2's power");
        // }
        if((n & (n-1))==0){
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not Power of 2");
        }
    }
}
