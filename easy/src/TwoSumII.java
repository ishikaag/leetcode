import java.util.Arrays;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {

                if (target == numbers[i] + numbers[j]) {
                    index[0]=Math.min(i,j)+1;
                    index[1]=Math.max(i,j)+1;

                }
            }
        }
        return index;
    }


    public static void main(String[] args){

        int[] array={2,4,5,6};
        int target=9;
        System.out.println(Arrays.toString(twoSum(array,target)));

}
}
