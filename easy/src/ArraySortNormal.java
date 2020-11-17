import java.util.Arrays;
//SORTING ARRAY WITH INDEX RANGES
public class ArraySortNormal {
    static void sortArray(int[] arr, int s, int l) {
        int a = Math.min(s, l);
        int b = Math.max(s, l);
        int j = 0;

        int[] temp = new int[b - a + 1];

        for (int i = a; i <= b; i++) {
            temp[j] = arr[i];
            j++;
        }
        Arrays.sort(temp);


        j = 0;
        for (int i = a; i <= b; i++) {
            arr[i] = temp[j];
            j++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int i = 0;
        int j = 2;
        int[] array = {7, 8, 4, 9, 2};
        sortArray(array, i, j);
    }
}
