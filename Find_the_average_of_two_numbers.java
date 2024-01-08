import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float m = sc.nextFloat();
        float a = (n+m)/2;
        System.out.printf("%.4f",a);
    }
}
