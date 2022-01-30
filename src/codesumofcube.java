import java.util.*;
class Solution {
    public static void printsumofcube(int n)
    {
        int count = 0;
            int int_count = 0;
            for (int j = 1; j <= Math.pow(n, 1.0/3);j++) {
                for (int k = j+1; k <= Math.pow(n, 1.0 / 3); k++) {
                    if (j * j * j + k * k * k == n)
                        int_count++;
                }
            }
            if (int_count == 2)
            {
                System.out.println(n);
            }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++) {
            printsumofcube(i);
        }
    }
}
