import java.util.Scanner;
public class HandShakes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        n = n*(n-1)/2;
        System.out.println(n);
    }
}