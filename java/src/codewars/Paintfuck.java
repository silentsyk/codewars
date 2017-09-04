public class Paintfuck {
    public static String interpreter(String code, int iterations, int width, int height) {
        // Implement your interpreter here
        int[][] a = new int[width][height];
        int[] b = init(code);

        if (iterations == 0) {
            return printArray(a, width, height);
        }
        int x = 0, y = 0, i = 0;
        while (iterations > 0 && i < code.length()) {
            iterations--;
            String command = "" + code.charAt(i);
            switch (command) {
                case "n": {
                    y = (y - 1 + height) % height;
                    i++;
                    break;
                }
                case "s": {
                    y = (y + 1) % height;
                    i++;
                    break;
                }
                case "e": {
                    x = (x + 1) % width;
                    i++;
                    break;
                }
                case "w": {
                    x = (x - 1 + width) % width;
                    i++;
                    break;
                }
                case "*": {
                    a[x][y] = (a[x][y] + 1) % 2;
                    i++;
                    break;
                }
                case "[": {
                    if (a[x][y] == 0) {
                        i=b[i];
                    }
                    i++;
                    break;
                }
                case "]": {
                    if (a[x][y] == 1) {
                        i=b[i];
                    }
                    i++;
                    break;
                }
                default: {
                    i++;
                    iterations++;
                }
            }
        }
        return printArray(a, width, height);
    }

    private static int[] init(String code) {
        int[] a = new int[code.length()];
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '[') {
                a[i] = -1;
            }
            if (code.charAt(i) == ']') {
                for (int j=i;j>-1;j--){
                    if(a[j]==-1){
                        a[j]=i;
                        a[i]=j;
                        break;
                    }
                }
            }
        }
        return a;
    }

    private static String printArray(int[][] a, int width, int height) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                sb.append(a[j][i]);
            }
            if (i < height - 1) {
                sb.append("\r\n");
            }
        }
        return sb.toString();
    }
}    