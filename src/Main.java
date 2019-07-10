import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
class somth{

}
public class Main {

    public static void main(String []args) {
      /* Converter<String, Integer> convert= (a)->Integer.parseInt(a);
        System.out.println(convert.convert("54"));*/
        StringBuilder str=new StringBuilder("Bla-Bla");
        str.append("-Blo");
        str.insert(0, "Blo-");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        StringBuffer str2 = new StringBuffer(str);
        System.out.println(str2.reverse());
        String str3 = new String(str2);
        System.out.println( str3.startsWith("Blo"));
    }
}
