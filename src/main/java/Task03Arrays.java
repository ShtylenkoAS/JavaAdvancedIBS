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

        int[] clone_array = array.clone();

        Arrays.sort(array);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(array));

        int min_negative = array[0];
        int min_positive = right;
        for (int j : array) {
            if (j >= 0) {
                min_positive = j;
                break;
            }
        }

        for (int i = 0; i < clone_array.length; i++) {
            if (clone_array[i] == min_negative) {
                clone_array[i] = min_positive;
            }else if (clone_array[i] == min_positive) {
                clone_array[i] = min_negative;
            }
        }

        System.out.println("Minimum positive value in the array: " + min_positive);
        System.out.println("Minimum negative value in the array: " + min_negative);

        System.out.println("The generated array, but the minimum negative value and the minimum positive value are changed: ");
        System.out.println(Arrays.toString(clone_array));
    }
}
