package GFGDSA.Recursion;


public class Basic {

    //Palindrom of string
    public static Boolean PlaindromItrative(String s){
        String b="";
        for(int i = s.length()-1; i>=0;i--){
           // System.out.println(s.charAt(i));
            b = b+s.charAt(i);
        }
        if(s.equals(b))return true;
        return false;

       // System.out.println("The string to be"+b);
    }
    public static String FindPlaindromUseingRecursion(String s,int len,String rev){
        
        if(len<=0){
            //System.out.println(""+srv);
            return rev;
        }
        rev = rev+s.charAt(len-1);
        
        return FindPlaindromUseingRecursion(s, len-1,rev);
    }
    public static void main(String[] args) {
        // ArrayList<String> s = new ArrayList<>(Arrays.asList("A", "B"));
        String str = "ABA";
        String rev = "";
        //System.out.println("Is String Plaindrom----->"+PlaindromItrative(str));
        System.out.println(FindPlaindromUseingRecursion(str,str.length(),rev));
    }
}
