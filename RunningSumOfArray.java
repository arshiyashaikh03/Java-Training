public class RunningSumOfArray{
    public static void main (String[]args){
        int[]arr={2,4,6,8,10};
        int[] runningSum=new int[arr.length];
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
            System.out.println("Running sum at index " + i + ": " + sum);
        }
    }
}