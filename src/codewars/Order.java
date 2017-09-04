public class Order {

    public static String order(String words) {
        // ...
        int order[]={0,0,0,0,0,0,0,0,0};
        if("".equals(words.trim())){
            return words;
        }

        String[] strs=words.split(" ");
        init(strs,order);

        String result="";
        for (int i = 0; i < strs.length; i++) {
            result+=strs[order[i]-1]+" ";
        }
        return result.trim();
    }

    private static void init(String[] strs,int[] order){
        for(int i=0;i<strs.length;i++){
            for (int j = 1; j <= 9; j++) {
                if(strs[i].contains(""+j)){
                    order[j-1]=i+1;
                    break;
                }
            }
        }
    }
}