import java.util.Scanner;

// WAP a program to toggle a bit n times and count the 1's and 
//print on the screen
public class ToggleBit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, bit;
        System.out.print("Enter the number you want to print :");
        n = sc.nextInt();
        System.out.print("Enter the binary number(0 or 1) :");
        bit = sc.nextInt();
        sc.close();
        int count = 0;
//         for (int i = 1; i <= n; i++) {
//         if (bit == 0) {
//         System.out.print(bit +" ");
//         bit = 1;
//         }
//         else{
//         System.out.print(bit+ " ");

//         // for counts 1
//         if(bit ==1){
//         count +=1;
//         }
//         bit = 0;
//         }

//         }
//     }
// }


        for (int i = 1; i <= n; i++) {
            System.out.println(bit);
            if (bit == 1) {
                count += 1;
            }
            bit = bit ^ 1;
            
            
        }
        System.out.println("Counts 1's" + count);
    }
}
