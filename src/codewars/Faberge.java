import java.math.BigInteger;

public class Faberge {
    public static BigInteger height(BigInteger n, BigInteger m) {
        BigInteger ret=BigInteger.ZERO;
        if(n.compareTo(BigInteger.ZERO)==0||m.compareTo(BigInteger.ZERO)==0){
            return ret;
        }


        return process(n,m);
    }

    private static BigInteger process(BigInteger n, BigInteger m) {
        if(n.compareTo(BigInteger.ONE)==0){
            return m;
        }

        if(m.compareTo(BigInteger.ONE)==0){
            return BigInteger.ONE;
        }

        BigInteger x=process(n.subtract(BigInteger.ONE),m);
        BigInteger y=process(n,m.subtract(BigInteger.ONE));
        return x.compareTo(y)>0?x:y;
    }
}

