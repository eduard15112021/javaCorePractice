package mane.week9.dz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class First {
    public static void main(String[] args) {
        String st="55пnastyah22@.com";
        Pattern p =Pattern.compile("\\d+[^ aeiu]nastya[^ aeiu]\\d+@\\.com$");
        Matcher m = p.matcher(st);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
