import java.util.ArrayList;
import java.util.List;

class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        // your code
        List<Long> list=new ArrayList<>();

        for(long i=a;i<=b;i++){
            if(i==getNum(i)){
                list.add(i);
            }

        }

        return list;
    }

    private static long getNum(long x){
        int a[]=new int[32];
        int i=0;
        while(x>0){
            a[i]=(int)(x%10);
            x=x/10;
            i++;
        }
        long result=0;
        for(int j=0;j<i;j++){
            result+=Math.pow(a[j],i-j);
        }
        return result;
    }
}