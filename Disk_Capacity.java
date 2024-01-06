import java.util.Scanner;
public class Disk
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int tracks = sc.nextInt();
        int sectors = sc.nextInt();
        int blocks = sc.nextInt();
        int maxCapacity;
        maxCapacity=tracks*sectors*blocks*512*2;
        System.out.println(maxCapacity);
        
    }
}