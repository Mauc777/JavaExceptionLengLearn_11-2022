
// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности 
// элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, 
//необходимо как-то оповестить пользователя.

public class ArrayMas {

    // int[] a = { 1, 2, 3, 4, 5, 6, 8, 9, 2, 4 };
    // int[] b = { 1, 2, 3, 10, 5, 5, 8, 8, 2, 4 };
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 2, 5, 6, 8, 9, 2, 4 };
        int[] b = { 1, 2, 3, 3, 4, 6, 8, 8, 2, 4 };
        massivCreateNewC(a, b);
    }

    public static void massivCreateNewC(int[] a, int[] b) {
        // int[] c = {};
        if (a.length == b.length) {
            // объявление массива arr3 по размерности одного из массивов
            int[] arr3 = new int[a.length];
            int idexForArr3 = 0;
            for (int i = 0; i < arr3.length; i++) {
                arr3[idexForArr3] = a[i] - b[i];
                idexForArr3 += 1;
            }
            System.out.print("Массив arr3 = {");
            for (int i : arr3) {

                System.out.print(i);
            }
            System.out.print("}");
        } else {
            System.out.println("Длины массивов не равно, а значит это что- то значит");
        }
        // System.out.println("Второй вариант отображения");
        // for (int i = 0; i < arr3.length; i++) {
        // System.out.println(arr3[i] );

        // @Override
        // public String toString(){
        // return "arr3 = " + arr3;
        // }

    }

}
