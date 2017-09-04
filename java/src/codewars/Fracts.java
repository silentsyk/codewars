public class Fracts {
    // your code
    public static String convertFrac(long[][] lst) {
        // your code
        //init
        if(lst.length<1){
            return "";
        }

        long[] a=new long[lst.length];
        for (int i = 0; i < lst.length; i++) {
            if(lst[i][0]!=1){
                long x=divstor(lst[i][0],lst[i][1]);
                a[i]=lst[i][1]/x;
            }else {
                a[i]=lst[i][1];
            }
        }

        //
        long y=multiple(a,0);

        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < lst.length; i++) {
            sb.append("("+lst[i][0]*y/lst[i][1]+","+y+")");
        }
        return sb.toString();
    }

    public static long divstor(long x,long y){
        long min = x < y ? x : y ;
        for(long divstorX = min ; divstorX > 0 ; divstorX--){
            if(x%divstorX==0&&y%divstorX==0){
                return divstorX;
            }
        }
        return 1;
    }

    public static long multiple(long a[],int count){

        if(a.length<=1){
            return a[0];
        }
        long divstorX=divstor(a[count],a[count+1]);

        long multipleX=a[count]/divstorX*a[count+1];

        a[count+1]=multipleX;

        count++;

        if(count<a.length-1){
            return multiple(a,count);
        }

        return multipleX;
    }
}