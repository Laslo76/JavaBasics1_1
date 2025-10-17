// ПРИШЛОСЬ знатно погуглить пока нашел рабочий метод вывода кирилицы в консоль
// Импортируем класс PrintStream
import java.io.PrintStream;

public class DopWork {
    public static  void main(String[] args) throws java.io.UnsupportedEncodingException {
        // добамли исключения при описании функции

        int income  = 56000;
        int spending = 50000;
        String title = "Итого (руб):";

        PrintStream ps = new PrintStream(System.out, true, "UTF-8");
        ps.println(title);
        ps.println(income - spending);

    }
}
