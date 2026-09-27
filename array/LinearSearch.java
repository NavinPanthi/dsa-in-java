import java.util.Scanner;

public class LinearSearch{

        public static int search(int[] arr, int number){
            for(int i=0; i<arr.length; i++){
                if(arr[i] == number){
                    return i;
                }
            }
            return -1;
        }

    public static void main(String []args){
        int[] arr = {2, 3, 4, 5, 6};

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int index = search(arr, number);
        if(index == -1){
            System.out.println("Number doesnot exist.");
        }
        else{
            System.out.println("Number exists in index\t" + index);
        }
    }
}