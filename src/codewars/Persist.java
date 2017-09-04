class Persist {
    public static int persistence(long n) {
        // your code
        int count=0;
        while(n>=10){
            n=next(n);
            count++;
        }
        return count;
    }

    private static long next(long n){
        long total=1;
        while (n > 0) {
            total*=n%10;
            n/=10;
        }
        return total;
    }
}