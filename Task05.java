import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// 2 a && b && c
public class Task05 {

    public static void main (String[]args ){
        String [] text = { "white", "red", "dad", "yellow", "12321"};
        System.out.println("the amount words with 5 letters is = "+ countOf(text, (s)->s.length()==5));
        //a
        Predicate<String>p = (s)->{
            for(int i=0; i< s.length()/2;i++){
                if(s.charAt(i) !=s.charAt(s.length()-1-i))
                    return false;
            }
            return true;
        };
//b
        for(int i=0; i<text.length; i++){
            System.out.println(text[i]+ " = "+ p.test(text[i]));
        }
        System.out.println("-------------------");
        System.out.println("the ammount of polindrob ="+ countOf(text, p));

//c
        Predicate<String> startWithW = (s)->s.startsWith("w");
        List<String> WithW = new ArrayList<>();
        for (String line :text){
            String []words= line.split("\\s+");
            for (String word:words){
                if (startWithW.test(word)){
                    WithW.add(word);
                }
            }
        }
        System.out.println("Words start with 'w' :");
        for (String word :WithW){
            System.out.println(word);
        }

    }
    public static int countOf(String[] text, Predicate<String>p){
        int k=0;
        for (String s:text) {
            if (p.test(s)) k++;
        }
        return k;
    }
}