import java.util.Collections;

public class abcde {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,7,8,9,10};
        int len = arr.length;
        int start= 1;
        for(int i=0;i<len;i++)
        {
           if(arr[i]==start)
           {
               start++;
           }
           else
           {
              System.out.println(start);
              start++;
              i--;

           }
        }

    }
}
