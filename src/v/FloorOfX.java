package v;

/* Given a sorted array and a value x, the floor of x is the largest element in array smaller than or equal to x.
 Write efficient functions to find floor of x. Input :  arr= {1, 2, 8, 10, 10, 12, 19}, x = 5 Output : 2 */

public class FloorOfX {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 5;
        int floor = arr[0];

        for (int i = 0; i < arr.length; i++) {
                if (arr[i] > floor && arr[i]<= x) {
                  floor = arr[i];
                }
        }
        System.out.println(floor);
    }
}
