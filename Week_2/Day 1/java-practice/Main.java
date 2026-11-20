import java.util.*;

public class Main {
    public static void main(String[] args) {

        String string = "Java is easy to learn";
        StringBuilder result = new StringBuilder();
        int stringend =string.length();
        for(int i = string.length()-1; i >=0; i--){

            char s = string.charAt(i);
            if(s== ' '){
               if (result.length()>0) {
                 result.append(' ');
               }
               result.append(string, i+1,stringend);

               stringend=i;
            }
        }

        if (result.length() > 0) result.append(' ');
        result.append(string, 0, stringend);
        System.out.println(result);

    }
}