// Selection sort
// {5,2,6,4,3,9}
// 1st iteration.
// (Find and put highest number in the last index i.e. arr.length - 1 - i..
// First of all, find the highest number in the array.
// 9 is highest. 9 goes to 5th index.(arr.length - 1 - i)
//Array become {5,2,6,4,3,9}
//2nd ieration.
// Find the highest number between 1st index and arr.length - 1 - i. (0 to 4th index).
//6 is highest. So 6 will go to 4th index.(arr.lenght - 1 - i).
//Array become {5,2,3,4,6,9}
// 3rd iteration.
//Find the highest number between 1st index and arr.length - 1 - i.  (0 to 3rd index).
//5 is highest. 5 will go to 3rd index. (arr.length - 1 - i).


public class SelectionSort{
    public static void main(String[] args) {
        int[] array = {5,11,6,4,3,7};
        int minIndex = -1;
        int temp;
        System.out.println("Before sorting");
        for(int a: array){
            System.out.print(a + " ");
        }
        System.out.println();
        for(int i = 0; i< array.length; i++){
            minIndex = i;
            for(int j=i+1; j<=array.length-1; j++){
                if(array[minIndex]>array[j]){
                    minIndex = j;
                }
            }
            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        System.out.println("After sorting");
            for(int a: array){
                System.out.print(a + " ");
            }
//0
    }
}