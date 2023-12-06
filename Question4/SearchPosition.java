package Question4;
import java.util.Scanner;

public class SearchPosition {
    public static int searchInsert(int nums[], int target){
        int left = 0;
        int right = nums.length-1;
        
        while(left<=right){
            int mid = left+(right-left)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the element of the sorted array: ");
        for(int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        int result = searchInsert(nums, target);
        System.out.println(result);
    }
}
