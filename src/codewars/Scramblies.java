public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        char[] char1=str1.toCharArray();
        char[] char2=str2.toCharArray();

        int[] letters=new int[26];
        for(char c:char1){
            letters[c-'a']++;
        }
        for(char c:char2){
            letters[c-'a']--;
            if(letters[c-'a']<0){
                return false;
            }
        }
        return true;
    }

}