public class SumOfArray{
    public static void main (String[]args){
        int[] arr={5,6,7,1,3,4};
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}