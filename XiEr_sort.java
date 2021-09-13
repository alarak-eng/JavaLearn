public class MaoPao_sort {
        public static void main(String[]agrs){
            int mid;
            int[] array=new int[] {123,35,34,65,756,234,45};
            for(int i=array.length/2;i>0;i--){
                for(int j=i;j<array.length;j++){
                    if(array[i]<array[j]){
                        mid=array[i];
                        array[i]=array[j];
                        array[j]=mid;
                    }
                }
            }
            for(int k=0;k<array.length;k++){
                System.out.println(array[k]);
            }
        }
    }
    

