class Lcs {

    private static StringBuilder sb;

    static String lcs(String a, String b) {
        sb=new StringBuilder();
        int substringLength1 = a.length();
        int substringLength2 = b.length(); // 具体大小可自行设置

        // 构造二维数组记录子问题x[i]和y[i]的LCS的长度
        int[][] opt = new int[substringLength1 + 1][substringLength2 + 1];

        // 从后向前，动态规划计算所有子问题。也可从前到后。
        for (int i = substringLength1 - 1; i >= 0; i--) {
            for (int j = substringLength2 - 1; j >= 0; j--) {
                if (a.charAt(i) == b.charAt(j))
                    opt[i][j] = opt[i + 1][j + 1] + 1;// 状态转移方程
                else
                    opt[i][j] = Math.max(opt[i + 1][j], opt[i][j + 1]);// 状态转移方程
            }
        }

        int i = 0, j = 0;
        while (i < substringLength1 && j < substringLength2) {
            if (a.charAt(i) == b.charAt(j)) {
                sb.append(a.charAt(i));
                i++;
                j++;
            } else if (opt[i + 1][j] >= opt[i][j + 1])
                i++;
            else
                j++;
        }
        return sb.toString();
    }


}

