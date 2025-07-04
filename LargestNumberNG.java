import java.util.*;
public class LargestNumberNG {
    public static String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strNums, (a, b) -> {
            String o1 = a + b;
            String o2 = b + a;
            return o2.compareTo(o1);
        });
        if (strNums[0].equals("0")) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        for (String str : strNums) {
            result.append(str);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        String result = largestNumber(nums);
        System.out.println("The largest number formed is: " + result);
    }
}