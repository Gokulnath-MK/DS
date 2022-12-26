public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,6,7,-3,-6,88};
        int target = -3;
        System.out.println(linearSearch(arr,target));
    }

    private static int linearSearch(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
