public class TheArray {
    public static void main(String[]args) {
        int[]a={213,3412,234,654,8678,34,6,1};
        int mean=(a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7])/8;
        for(int n=0;n<8;n++){
            if(a[n]>mean)System.out.println(a[n]);
        }
    }
}