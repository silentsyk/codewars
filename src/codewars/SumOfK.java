import java.util.ArrayList;
import java.util.List;

public class SumOfK {

    private static List<Integer> list=new ArrayList<>();

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        list.clear();
        // your code
        if (ls.size() < k) {
            return null;
        }

        int[] arr = getArray(ls);

        calDistance(arr, arr.length,k);

        list.sort(Integer::compareTo);

        for (int i = list.size()-1; i >=0 ; i--) {
            if(list.get(i)<=t){
                return list.get(i);
            }
        }
        return null;

    }

    private static int[] getArray(List<Integer> ls) {
        int a[] = new int[ls.size()];
        for (int i = 0; i < ls.size(); i++) {
            a[i] = ls.get(i);
        }
        return a;
    }

    public static void sum(int a[], int b[], int n) {
        int ret = 0;
        for (int i = 0; i < n; i++) {
            ret += a[b[i]];
        }
        list.add(ret);
    }


    public static void combine(int a[], int n, int m, int b[], int bn) {
        for (int i = n; i >= m; i--) {
            b[m - 1] = i - 1;
            if (m > 1) {
                combine(a, i - 1, m - 1, b, bn);
            } else {
                sum(a, b, bn);
            }

        }
    }

    public static void calDistance(int a[], int n, int m) {
        int b[] = new int[m];
        combine(a, n, m, b, m);
    }


}

