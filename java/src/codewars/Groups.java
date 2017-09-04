public class Groups{

    public static boolean groupCheck(String s) {
        if ("".equals(s)) return true;

        String chars[] = s.split("");
        String ret="";
        for (String c :chars) {
            if("(".equals(c)||"[".equals(c)||"{".equals(c)) {
                ret+=c;
            }else {
                switch (c) {
                    case ")":{
                        if (ret.length()==0){
                            return false;
                        }
                        if((""+ret.charAt(ret.length()-1)).equals("(")){
                            ret=ret.substring(0,ret.length()-1);
                        }else {
                            return false;
                        }
                        break;
                    }
                    case "]":{
                        if (ret.length()==0){
                            return false;
                        }
                        if((""+ret.charAt(ret.length()-1)).equals("[")){
                            ret=ret.substring(0,ret.length()-1);
                        }else {
                            return false;
                        }
                        break;
                    }
                    case "}":{
                        if (ret.length()==0){
                            return false;
                        }
                        if((""+ret.charAt(ret.length()-1)).equals("{")){
                            ret=ret.substring(0,ret.length()-1);
                        }else {
                            return false;
                        }
                        break;
                    }
                }
            }

        }
        if(!"".equals(ret)){
            return false;
        }
        return true;
    }


}