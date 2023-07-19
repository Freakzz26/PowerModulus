import java.util.Scanner;
public class PowMod {
    static void result(int a,int b,int c)
    {
       int pow=1;
        for(int i=0;i<b;i++)
        {
            pow=pow*a;
        }
        int output=pow%c;
        System.out.println(output);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        result(a,b,c);
    }
}
