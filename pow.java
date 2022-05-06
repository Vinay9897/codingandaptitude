import java.util.Scanner;

// package codingandaptitude;
 public class pow {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Number:");
         double n = sc.nextDouble();
         System.out.println("Enter the power :");
         int p = sc.nextInt();
         sc.close();
        System.out.println(pow(n,p));
    }
    private static double pow(double n1 , int p){
        System.out.println("Original number"+ n1);
        double ans = 1;
        int p1 = p;
        if(p<0){
            p*=-1;
        }
        int h = (int)p/2;
        System.out.println("half pow :"+ h);
System.out.println("=======================");
        while(h != 0){
            ans*=n1;
            System.out.println("ans :" + ans);
            h--;
        }
        ans *=ans;
        System.out.println(" ans :" + ans);
        if(p % 2 != 0){
            ans*=n1;
        }
        if(p1<0){
            ans = 1/ans;
            ans*=-1;
        }
            return ans;
    }
}
