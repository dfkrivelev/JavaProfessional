package homework18;

/**
 * Java Prof. Homework #18
 *
 * @author Dzmitry Kryvialeu
 * @version 16.01 - 18.01
 */

import java.util.Arrays;

public class Homework18 {
    public static void main(String[] args) {
        String[][] array = new String[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * 10)) + "";
            }
        }

        System.out.println(Arrays.deepToString(array));
        try {
            System.out.println(matrix(array));
        } catch (MyArraySizeException e) {
            System.out.println("Метод принимает только массив размером 4*4");
        } catch (MyArrayDataException m) {
            System.out.println("Некорректный массив");
        }
    }

    public static int matrix(String[][] str) {
        if (str.length != 4) {
            throw new MyArraySizeException();
        }
        for(String[] strings : str){
            if(strings.length != 4){
                throw new MyArraySizeException();
            }
        }

        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                try {
                    int x = Integer.parseInt(str[i][j]);
                    sum += x;
                } catch (NumberFormatException e) {
                    System.out.printf("Ячейка [%d][%d] = %s. Невозможно преобразовать в int\n", i, j, str[i][j]);
                    throw new MyArrayDataException();
                }
            }
        }
        return sum;
    }
}
