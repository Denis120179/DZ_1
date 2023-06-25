/* 
//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class dz_1 {
 public static void main(String[] args) {
 String[] sArray = {"first str", null, "third str"};
 int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
 division(10, 0);
 printValueByIndex(array,12);
 printStringArray(sArray);
    }

 
 public static void division(double firstNum, double secondNum){
 if(secondNum == 0) throw new ArithmeticException("На ноль делить нельзя!!!");
 double result = firstNum/secondNum;
 System.out.printf("Результат деления %f на %f равен %f.\n", firstNum, secondNum, result);
    }
 
 public static void printValueByIndex(int[] array, int index){
 if(index > array.length-1) throw new ArrayIndexOutOfBoundsException("Элемента под таким индексом не существует");
 else System.out.printf("Элемент с индексом %d равен %d.\n",index, array[index]);
    }

 
 public static void printStringArray(String[] sArray){
 for (String item: sArray){
 if(item == null) throw new NullPointerException("Элемент отсутствует!!!");
 System.out.println(item);
        }
    }
}
*/

/*
//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.Random;

public class dz_1 {
 public static void main(String[] args) {
 int[] firstArray = getFilledArray(10);
 int[] secondArray = getFilledArray(9);

 int[] divArray = divArrays(firstArray, secondArray);
    }

 public static int[] divArrays(int[] firstArray, int[] secondArray) {
 if(firstArray.length != secondArray.length) throw new RuntimeException("Длины массивов не равны!!!");
 int[] resultArr = new int[firstArray.length];
 for (int i = 0; i < resultArr.length; i++) {
 resultArr[i] = firstArray[i] - secondArray[i];
        }
 return resultArr;
    }

 public static int[] getFilledArray(int length){
 int[] array = new int[length];
 Random rnd = new Random();
 for (int i = 0; i < length; i++) {
 array[i] = rnd.nextInt(20);
        }
 return array;
    }
}
*/

