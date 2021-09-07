
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
            int f1=1,f2=1,f3=1;
            int result;
            System.out.println("要求第几项斐波那契数列？");
            Scanner scanner=new Scanner(System.in);
            result=scanner.nextInt();
            while(result<0){
                System.out.println("这不是一个有效数字");
                break;
            }
            while(result>0&&result<=2){
                System.out.println("第"+result+"项斐波那契数列是"+f3);
                break;
            }
            while(result>2){
                f3=f1+f2;
                f1=f2;
                f2=f3;
                result--;
                while(result==2){
                    System.out.println("这项斐波那契数列是"+f3);
                    break;
                }
            }

        }
    }

