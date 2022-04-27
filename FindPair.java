import java.util.HashMap;

public class FindPair {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4, 4, 2 };
        int len = arr.length;
        // int pair = findPair(arr, len);
        // for (int i = 0; i < len; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println("No of Pairs :" + pair);
    }

    private static void findPair(int[] arr, int len) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else {
                map.put(arr[i], 1);
            }
        }
        // for (int i = 0; i < len; i++) {

        // }
        System.out.println(map);
    }
}
