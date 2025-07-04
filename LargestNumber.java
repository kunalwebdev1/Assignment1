import java.util.*;
public class LargestNumber {
    public static String MaxCombo(String a, String b) {
        String ab = a + b;
        String ba = b + a;
        return ab.compareTo(ba) > 0 ? ab : ba;
    }
    public static String largestNumber(int[] nums){
        List<String> strList = new ArrayList<>();
        for (int num : nums){
            strList.add(String.valueOf(num));
        }
        String result = "";
        for (String s : strList){
            result = MaxCombo(result, s);
        }
        if(result.startsWith("0")){
            return "0";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the integers: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        String result = largestNumber(nums);
        System.out.println("The Largest number is: " + result );
    }
}
