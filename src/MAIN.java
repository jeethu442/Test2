import java.util.Arrays;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args)
    {
        int[] arr ={86,8,34,27,46,44,68,60,73,54,94,69,5,18,47,65,82,74,22,56,59,20,28,43,79,4,84,3,38,88,13,97,85,66,89,57,2,83,52,15,19,26,75,72,45,11,92,90,14,87,51,6,55,50,80,76,24,29,99};
        int l=arr.length;
        int largest;
        int temp;
        int num=3;
        for(int j=0;j<num-1;j++) {
            for (int i = 0; i < l - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

            l--;
        }

        System.out.println("Largest: " + arr[l - 1]);
    }
}
