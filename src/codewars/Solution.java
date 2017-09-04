public class Solution {

    private final static String str1="<a href=\"/\">HOME</a>";
    private final static String str2="<span class=\"active\">%%2%%</span>";
    private final static String str3="<a href=\"%%3s%%\">%%3b%%</a>";

    private final static String ignore="the,of,in,from,by,with,and, or, for, to, at, a";

    public static String generate_bc(String url, String separator) {
        url=init(url);
        String strs[]=url.split("/");
        String ret=str1+separator;
        String temp="/";
        for(int i=1;i<strs.length-1;i++){
            temp=temp+strs[i]+"/";
            ret+=str3.replace("%%3s%%",temp).replace("%%3b%%",getNeed(strs[i]))+separator;
        }
        if(strs.length==1){
            ret=str2.replace("%%2%%","HOME");
        }else {
            ret += str2.replace("%%2%%", getNeed(strs[strs.length - 1]));
        }
        return ret;
    }

    private static String init(String url) {
        if(url.contains("?")){
            url=url.substring(0,url.indexOf("?"));
        }

        if(url.contains("#")){
            url=url.substring(0,url.indexOf("#"));
        }

        if(url.contains("index")){
            url=url.substring(0,url.indexOf("index")-1);
        }

        if(url.contains(".html")||url.contains(".asp")||url.contains(".htm")||url.contains(".php")){
            url=url.substring(0,url.lastIndexOf("."));
        }

        return url.replace("http://","")
                .replace("https://","");
    }

    private static String getNeed(String str) {
        StringBuilder ret= new StringBuilder();
        if(str.length()>30) {
            String[] seps = str.split("-");
            for (String sep : seps) {
                if (!ignore.contains(sep)) {
                    ret.append(("" + sep.charAt(0)).toUpperCase());
                }
            }
        }else {
            if(str.contains("-")){
                return str.replaceAll("-"," ").toUpperCase();
            }else {
                return str.toUpperCase();
            }
        }
        return ret.toString();
    }

}