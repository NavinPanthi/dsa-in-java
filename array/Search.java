import java.util.Scanner;

public class Search{

    //linear search method
        public static int search(int[] arr, int number){
            for(int i=0; i<arr.length; i++){
                if(arr[i] == number){
                    return i;
                }
            }
            return -1;
        }
        //binary search method
    public static int binarySearch(int[] arr, int number1){
            int start = 0;
            int end = arr.length-1; //7
        int medium;
        while(start <= end){// 0 and 2
             medium = (start+end)/2 ;//3
            if(arr[medium] == number1){
                return medium;
            }
            else if(arr[medium] > number1){
                end = medium - 1;
            }
            else{
                start = medium + 1 ;
            }
        }
            return -1;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, 4, 5, 6, 9, 11, 13};
        // Linear Search
        System.out.print("Linear Search);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int index = search(arr, number);
        if(index == -1){
            System.out.println("Number doesnot exist.");
        }
        else{
            System.out.println("Number exists in index\t" + index);
        }
        // Binary Search
        System.out.print("Binary Search);
        System.out.print("Enter the number: ");
        int number1 = sc.nextInt();
        int index1 = binarySearch(arr, number1);
        if(index1 == -1){
            System.out.println("Number doesnot exist.");
        }
        else{
            System.out.println("Number exists in index\t" + index);
        }
    }
}