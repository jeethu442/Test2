public class Test {
    public static void main(String[] args) {
        int[] arr = {6, 1, 8, 2, 3};
        int n = arr.length;
        int pos = 0;
        int secLarge = 0;
        int large = 0;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i++; j < n - 1; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                } else {

                    continue;

                }


            }


        }
        //System.out.println(arr[n]);
        System.out.println(arr[n - 1]);
           /* for(int k=0;k<n;k++)
            {
                for(int x=k+1;x<n-1;x++)
                if(k==pos||x==pos)
                {
                  continue;
                }
                else
                {
                    if(arr[k]>arr[x])
                    {
                        secLarge=arr[k];
                    }
                    else
                    {
                        secLarge=arr[x];
                    }

                }
            }
        System.out.println(secLarge);
    }
    */

    }
}
