import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
        final int[] length = {binary.size()-1};
        final int[] result = {0};
        binary.forEach(x->{
            if(x==1) {
                result[0] += Math.pow(2, length[0]);
            }
            length[0]--;
        });
        return result[0];
    }
}