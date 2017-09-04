import java.util.Arrays;

public class Kata {

    public static long nextSmaller(long n) {
        String str=""+n;
        for (int i = 0; i <str.length(); i++) {
            String x=""+process(Long.parseLong(str.substring(str.length()-i-1)),i==str.length()-1);
            if(!"-1".equals(x)){
                if(x.length()!=str.substring(str.length()-i-1).length()){
                    x="0"+x;
                }
                return Long.parseLong(str.substring(0,str.length()-i-1)+x);
            }
        }
        return -1;
    }

    private static long process(long n,boolean flag){
        String str=""+n;

        long max=-1;
        int[] arr=init(str);
        int x=arr[0],y=-1;
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            if (arr[i]<x){
                y=i;
                break;
            }
        }


        if(y==-1){
            return max;
        }else {
            if(flag&&arr[y]==0) {
                return max;
            }
            String sub=toString(arr,y);
            int[] subArr=init(sub);
            Arrays.sort(subArr);
            long ret=Long.parseLong(""+arr[y]+toStringDesc(subArr));
            if(ret<n) {
                return ret;
            }
        }

        return max;
    }

    private static String toStringDesc(int[] a) {
        StringBuilder sb=new StringBuilder();
        for (int i = a.length-1; i>=0; i--) {
            sb.append(a[i]);
        }
        return sb.toString();
    }


    private static int[] init(String n) {
        int[] a=new int[n.length()];
        for (int i=0;i<a.length;i++){
            a[i]=n.charAt(i)-'0';
        }
        return a;
    }

    private static String toString(int[] a){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
        }
        return sb.toString();
    }

    private static String toString(int[] a,int remove){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if(i!=remove) {
                sb.append(a[i]);
            }
        }
        return sb.toString();
    }
}