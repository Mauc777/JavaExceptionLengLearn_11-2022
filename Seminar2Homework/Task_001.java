import java.util.Scanner;

//*Задание 1 реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
//*и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
//*вместо этого, необходимо повторно запросить у пользователя ввод данных.
//*import java.io.IOException;

public class Task_001 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите дробное число через ' , ' : ");
            if (scan.hasNextFloat()) {
                float i = scan.nextInt();
                System.out.printf("введено: %.f", i);
            } else {
                // System.out.println("Вы ввели не дробное число");
                //scan.close();
            }
            scan.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
