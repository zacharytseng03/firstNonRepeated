import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String c=firstNonRepeated("hello");
        System.out.println(c);
        c=firstNonRepeated("aabcc") ;
        System.out.println(c);
        c=firstNonRepeated("aabbcc") ;
        System.out.println(c);
        c=firstNonRepeated("aaAbBc") ;
        System.out.println(c);
        c=firstNonRepeated("Apple") ;
        System.out.println(c);
    }

    static String firstNonRepeated(String s){
        String hold=s.toLowerCase();
        Set<Character> set=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.toLowerCase().charAt(i);
            if(!set.contains(c)){
                set.add(c);
            }
            else{
                hold=hold.replaceAll(Character.toString(c),"");
            }
            //System.out.println(c);
        }
        if(hold.length()>1){
            hold=Character.toString(hold.charAt(0));
        }
        return hold;
    }
}

