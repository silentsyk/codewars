public class NthSeries {

    public static String seriesSum(int n) {
        // Happy Coding ^_^
        if(n==0){
            return "0.00";
        }
        double a=0.00;
        for(int i=0;i<n;i++){
            a+=1.0/(1+3*i);
        }

        return String.format("%.2f",a);
    }
}