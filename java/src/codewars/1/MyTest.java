/**
 * Created by sky on 2017/8/30.
 */
public class MyTest {
    public static void main(String args[]){

        order(new int[]{1,2,3,4,5},new int[5],0,new int[5]);
    }

    private static void order(int[] arr,int[] flag,int n,int[] ret){
        if(n==arr.length){
            for (int i = 0; i < ret.length; i++) {
                System.out.print(ret[i]);
            }
            System.out.println();
        }else {
            for(int i=0;i<arr.length;i++){
                if(flag[i]==0){
                    flag[i]=1;
                    ret[n]=arr[i];
                    order(arr,flag,++n,ret);
                    flag[i]=0;
                    n--;
                }
            }
        }

    }
}
