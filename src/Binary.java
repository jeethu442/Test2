public class Binary {
    public static void main(String[] args)
    {
        int[] arr = {1,1,0,1};
        int len = arr.length;
        int num =0;
        int j=0;
        for(int i=len-1;i>=0;i--)
        {
          num=num+arr[i]*2^j;
          j++;
        }
        System.out.println(num);
    }

}
