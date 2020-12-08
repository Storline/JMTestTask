package Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculations {
    public void calc() throws IOException {
        Pattern pattern = Pattern.compile("\\s?([0-9]*||[a-z]*||[A-Z]*)\\s?([-+*/])\\s?([0-9]*||[a-z]*||[A-Z]*)\\s?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a, b, c;
        Matcher matcher = pattern.matcher(reader.readLine());

        if (matcher.matches()) {
            a = matcher.group(1);
            b = matcher.group(2);
            c = matcher.group(3);


            if (a.matches("\\s*[0-9]*\\s?") && c.matches("\\s*[0-9]*\\s?")) {

                int q = Integer.parseInt(a);
                int w = Integer.parseInt(c);

                if (q>=0 && q<=10 && w>=0 && w<=10) {
                    switch (b) {
                        case "+":
                            System.out.println(q + w);
                            break;
                        case "-":
                            System.out.println(q - w);
                            break;
                        case "*":
                            System.out.println(q * w);
                            break;
                        case "/":
                            if (w != 0) {
                                System.out.println(q / w);
                            } else {
                                System.out.println("Деление на ноль - запрещено");
                            }
                            break;
                    }
                } else {
                    System.out.println("Введено некорректное число или операнд. Попробуйте числа от 0 до 10 или дргуой математический операнд.");
                }
            } else if(a.matches("\\s?[a-z]*||[A-Z]*\\s?") && c.matches("\\s?[a-z]*||[A-Z]*\\s?")){

                int p = RomanNumeral.romanToArabic(a);
                int l = RomanNumeral.romanToArabic(c);
                int result;

                switch (b) {
                    case "+":
                        result = p + l;
                        System.out.println(RomanNumeral.arabicToRoman(result));
                        break;
                    case "-":
                        result = p - l;
                        System.out.println(RomanNumeral.arabicToRoman(result));
                        break;
                    case "*":
                        result = p * l;
                        System.out.println(RomanNumeral.arabicToRoman(result));
                        break;
                    case "/":
                        if (l != 0) {
                            result = p / l;
                            System.out.println(RomanNumeral.arabicToRoman(result));
                        } else {
                            System.out.println("Деление на ноль - запрещено");
                        }
                        break;
                }
            }
        }
    }
}
