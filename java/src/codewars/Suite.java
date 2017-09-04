public class Suite {

    public static double going(int n) {
        // your code
        if(n==1){
            return 1;
        }

        double ret=1.0;
        double temp=1.0;
        for (int i=n;i>1;i--){
            temp*=1.0/i;
            ret+=temp;
        }
        String result = String.valueOf(ret);
        if(result.length()>8){
            result=result.substring(0,8);
        }
        while (result.charAt(result.length()-1)=='0'){
            result=result.substring(0,result.length()-1);
        }

        return Double.parseDouble(result);
    }
}