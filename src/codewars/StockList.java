public class StockList {

    // 1st parameter is the stocklist (L in example),
    // 2nd parameter is list of categories (M in example)
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        // your code here
        int list[]=new int[26];
        for (String art: lstOfArt){
            String strs[]=art.split(" ");
            list[strs[0].charAt(0)-'A']+=Integer.parseInt(strs[1]);
        }

        StringBuilder sb=new StringBuilder("");
        boolean flag=false;
        for (String letter :lstOf1stLetter){
            if(list[letter.charAt(0)-'A']!=0) {
                flag=true;
                break;
            }
        }
        if(!flag){
            return "";
        }else {
            for (String letter : lstOf1stLetter) {
                    sb.append("(" + letter + " : " + list[letter.charAt(0) - 'A'] + ") - ");
            }

        }
        String ret=sb.toString();
        return ret.length()==0?ret:ret.substring(0,ret.length()-3);
    }
}

