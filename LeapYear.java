
import java.util.Scanner;
public class LeapYear{
    public static void  main(String []args) {
        int num=0;
        int born;
        System.out.println("请输入他的出生年份");
	    Scanner scanner=new Scanner(System.in);
        for(born=scanner.nextInt();born<2101;born++){
            if(born%400==0){
                num=num+1;
            }else if(born%4==0)
            num=num+1;
            else num=num;
        }System.out.println("他能度过的闰年数是"+num);
    }
}