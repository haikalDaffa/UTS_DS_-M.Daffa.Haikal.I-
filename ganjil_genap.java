import java.util.Random;

class Main {

    public static void main(String[] args) {
        Random rd = new Random(); // creating Random object

        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100); // storing random integers in an array
            System.out.println(arr[i]); // printing each array element
            if (arr[i]%2==0){
                System.out.println("Bilangan "+arr[i]+" adalah bilangan genap");
            }else {
                System.out.println("Bilangan "+arr[i]+" adalah bilangan ganjil");
            }
        }
    }
}
