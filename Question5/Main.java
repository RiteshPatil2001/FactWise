public class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int result = solution.gascircuit(gas, cost);
        System.out.println(result);
    }
}