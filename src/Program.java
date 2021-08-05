public class Program {
    public static void main(String[] args)
    {
        int[] arr = {2,3,5,3,8};
        int len = arr.length;
        int temp=0;

        for(int i=0;i<len-1;i++)
        {
             for(int j=i+1;j<len;j++)
            {

                if(arr[i]==arr[j])
                {
                   continue ;
                }
                else
                {
                    temp =arr[i];
                }

            }
             System.out.println(temp);

        }
    }

}
