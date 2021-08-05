public class abc {
    public static void main(String[] args)
    {
        String s="My name is jeethu";
        char[] c=s.toCharArray();
        int l= c.length;
        int first=0;
        System.out.println("*");
        for(int i=0;i<l;i++) {
            if(c[i]==' ')
            {
               for(int j=i-1;j>=first;j--)
               {
                  System.out.print(c[j]);
               }
               System.out.println(" ");
               first= i+1;

            }

        }

        System.out.println("*");

    }
    
}
