class Dinglemouse {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";

    public static String[] flapDisplay(final String[] lines, final int[][] rotors) {
        // Your code here
        int[][] rout = rotors;
        for (int j = 0; j < rotors.length; j++) {
            for (int i = 1; i < rotors[j].length; i++) {
                rout[j][i] += rout[j][i - 1];
            }
        }
        String[] newStrs = new String[lines.length];
        for (int j = 0; j < rout.length; j++) {
            newStrs[j]="";
            for (int i = 0; i < rout[j].length; i++) {
                newStrs[j] += ALPHABET.charAt((ALPHABET.indexOf(lines[j].charAt(i)) + rout[j][i]) % ALPHABET.length());
            }
        }
        return newStrs;
    }

    public static void main(String args[]){
        String[] result=flapDisplay(new String[]{"HELLO ","CAT"},new int[][]{{15,49,50,48,43,13},{1,13,27}});
    }

}


