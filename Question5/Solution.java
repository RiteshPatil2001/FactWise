class Solution{
    public int gascircuit(int[] gas, int[] cost){
        int totalGas = 0, totalCost = 0;
        for(int i=0;i<gas.length;i++){
            totalGas = totalGas + gas[i];
            totalCost = totalCost + cost[i];
        }

        if(totalGas < totalCost) return -1;

        int remainGas = 0, start = 0;

        for(int i=0;i<gas.length;i++){
            remainGas += (gas[i] - cost[i]);

            if(remainGas < 0){
                start = i+1;
                remainGas = 0;
            }
        }
        return start;
    }
}