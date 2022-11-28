import java.io.File;
import java.util.Collections;
import java.util.List;
//Задание к Семинару_1 JAvaException
//Реализуйте 3 метода,чтобы в каждом из них получить разные исключения Посмотрите на код,
//и подумайте сколько разных типов исключений вы тут сможете получить?

public class ExceptionMethod {
    public static void main(String[] args) {
        // 1 ArithmeticException
        // Method1(10, 0);

        // 2 UnsupportedOperationException
        // Method2(2);
        // Method2("sdvsv");

        // #3 ClassCastException:
        // Method3(123);
    }

    // #1 ArithmeticException
    public static void Method1(int a, int b) {
        int result = 0;
        result = result + (a / b);
        System.out.println(result);
    }

    // #2 UnsupportedOperationException
    public static void Method2(Object o) {
        List<Object> emptyList = Collections.emptyList();
        emptyList.add(new Object());
    }

    // #3 ClassCastException
    public static int Method3(Object o) {
        o = new Object();
        Object object = new String("123");
        File file = (File) object;

        return 0;
    }

}
