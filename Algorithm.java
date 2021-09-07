import java.util.Scanner;
public class Algorithm{
    public static void main(String[]args){
        System.out.println("请输入两个不同的整数");
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int rem,sma,big;
        sma=big=1;
        if(num1>num2){
            big=num1;
            sma=num2;
        }else if(num1<num2){
            sma=num1;
            big=num2;
        }
        rem=big%sma;
        while(rem==0){
            big=sma;
            sma=rem;
            rem=big%sma;
        }
        System.out.println("这两个数最大公因数是"+sma);
    }
}