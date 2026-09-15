import java.util.Arrays;
public class MergeSortedArray{

    public static void sort(int[] array){
            int l = array.length;

            for(int i = 0; i<l; i++){
                for(int j = i+1, x=0; j<l; j++){
                    if(array[i]>array[j]){
                        x = array[i];
                        array[i] = array[j];
                        array[j] = x;
                    }
                }
            }
    }

    public static void main(String[] args){
        int[] arr = {1,2,6,9};

        int arr2[] = {3,5,9,4};

        int mergedLength = arr.length + arr.length;

        int[] mergedArray = new int[8];

        for(int i = 0; i<4; i++){
            mergedArray[i] = arr[i];
        }
        for(int i=4, j=0; i<8; i++, j++){
            mergedArray[i] = arr2[j];
        }
        //Sort the array in ascending order. (bubble sort)
        sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
    }
} 