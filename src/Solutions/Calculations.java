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

            int q = RomanNumeral.romanToArabic(a);
            int w = RomanNumeral.romanToArabic(c);

            if (q >= 0 && q <= 10 && w >= 0 && w <= 10) {
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
                System.out.println("Неверный ввод. Попробуйте числа от 0 до 10 или другой математический операнд.");
            }
        }
    }
}
