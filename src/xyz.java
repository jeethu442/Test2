public class xyz {
    public static void main(String[] args)
    {
        int[] arr = {4,6,3,9,7};
        int len= arr.length;
        int count=0;

        for(int i=0;i<len-1;i++)
        {
            for(int j=i+1;j<len;j++)
            {
               if(arr[j]>arr[i])
               {
                   count++;
               }
            }
            System.out.println(count);
            count=0;
        }
        System.out.println("0");

    }
}
