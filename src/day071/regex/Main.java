package day071.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String regex = "^N";  // e m , u b
        String str = "Bu bir deneme mesajıdır.\nNasılsınız?";

        Pattern pattern = Pattern.compile(regex,Pattern.MULTILINE|Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()){
            System.out.println("'"+regex+"'"+" bulundu.");
        }else{
            System.out.println("Aranan kelime bulunamadı.");
        }

        // regex101.com

    }
}
