import java.util.Arrays;

/**
 * @author by Anton Shtylenko
 */
public class Task03Arrays {
    public static void main(String[] args) {
        int[] array = new int[20];

        //Setting the boundaries of number generation
        int left = -10;
        int right = 10;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (right - left + 1)) + left;
        }

        System.out.println("Generated array: ");
        System.out.println(Arrays.toString(array));


//        Делал сортировку и клонированный массив т.к. работать с отсортированным массивом удобнее и более наглядно
//        Учитывая следюущее задание по поиску элементов было бы весьма удобно пользоваться именно отсортированным clone_array, т.к. можно было бы взять индекс справа и слева от 0
//        int[] clone_array = array.clone();
//
//        Arrays.sort(array);
//        System.out.println("Sorted array: ");
//        System.out.println(Arrays.toString(array));

        int max_negative = -11;
        int min_positive = 11;
        for (int k : array) {
            if (k < 0 && k > max_negative) {
                max_negative = k;
            } else if (k > 0 && k < min_positive) {
                min_positive = k;
            }
        }

        System.out.println("Minimum positive value in the array: " + min_positive);
        System.out.println("Maximum negative value in the array: " + max_negative);

        System.out.println("The generated array, but the minimum negative value and the minimum positive value are changed: ");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max_negative) {
                array[i] = min_positive;
            } else if (array[i] == min_positive) {
                array[i] = max_negative;
            }
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.print("]");
    }
}