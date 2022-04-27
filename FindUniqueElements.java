import java.util.Scanner;

public class FindUniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int a[] = { 1, 2, 3, 3, 3, 2, 5, 6, 7, 7, 4, 5, 8 };
        int len = a.length;

        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = i + 1; j < len; j++) {
                if (a[i] == a[j]) {
                    count += 1;
                }
            }
            if (count == 1) {
                System.out.println(a[i] + " is duplicate ");
            }
        }
    }
    // public static void main(String args[]){
    // int a[] = {1,2,3,3,3,2,5,6,7,7,4,5,8};
    // int n = a.length;
    // int f[9] = {0};
    // for(int i=0;i<n;i++){
    // f[a[i]]++;
    // }
    // for(int i=0;i<n;i++){
    // if(f[a[i]]==1){
    // System.out.println(a[i]);
    // }
    // }
    // }
}
