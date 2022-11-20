import java.util.Scanner;
class Bubble_selection {

        public static void main(String[] args) {
            int n;
            Scanner sc=new Scanner(System.in);

//creates an array in the memory of length 10
            int[] array = new int[10];
            System.out.println("absen: ");
            for(int i = 0; i < array.length; i++)
            {
//reading array elements from the user
                array[i]=sc.nextInt();
            }
            System.out.println("grouping ganjil genap: ");
// accessing array elements using the for loop
            for(int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
                for(int i = 0; i < lastUnsortedIndex; i++){
                    if(array[i] > array[i + 1]){
                        swap(array, i , i+ 1);
                    }
                }
            }


            System.out.print("Genap :" );
            for (int i = 0; i < array.length; i++)
            {
                if (array[i]%2==0){
                    System.out.print(array[i]+",");
                }
            }
            System.out.println("");
            System.out.print("Ganjil :");
            for (int i = 0; i < array.length; i++)
            {
                if (array[i]%2!=0){
                    System.out.print(array[i]+",");
                }
            }
            System.out.println("");

//            int[] arr = new int[10];
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = absent.nextInt(); // storing random integers in an array
//                System.out.println(arr[i]); // printing each array element
//                if (arr[i]%2==0){
//                    System.out.println("Bilangan "+arr[i]+" adalah bilangan genap");
//                }else {
//                    System.out.println("Bilangan "+arr[i]+" adalah bilangan ganjil");
//
//
//                }
//
        }

        public static void swap (int[] array, int i, int j){
        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
