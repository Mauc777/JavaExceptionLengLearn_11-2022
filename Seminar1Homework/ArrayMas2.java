
//*Реализуйте метод,принимающий в качестве аргументов два целочисленных массива,
//*и возвращающий новый массив,каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке
//*.Если длины массивов не равны,необходимо как-то оповестить пользователя.
//*Важно:При выполнении метода единственное 
//*исключение,которое пользователь может увидеть-RuntimeException,т.е.ваше. {

public class ArrayMas2 {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 2, 5, 6, 8, 9, 2, 4 };
        int[] arr2 = { 1, 2, 10, 3, 4, 0, 8, 8, 2, 4 };
        ArrMass(arr1, arr2);

    }

    public static void ArrMass(int[] arr1, int[] arr2) {
        try {
            if (arr1.length == arr2.length) {
                int[] arr3 = new int[arr1.length];
                int indexOffarr3 = 0;
                for (int i = 0; i < arr3.length; i++) {
                    arr3[indexOffarr3] = arr1[i] / arr2[i];
                    indexOffarr3 += 1;
                }
                System.out.print("Массив частных элементов массивов = {");
                for (int i : arr3) {
                    System.out.print(i);
                }
                System.out.println("}");
            } else {
                System.out.println("Длины массивов не равно, а значит это что- то значит");
            }
            
        } catch (RuntimeException e) {
            //System.out.println("была перехвачена ошибка  " + e.getClass().getSimpleName());
            System.out.println("была перехвачена ошибка RuntimeException " );
        }


      

    }

}
