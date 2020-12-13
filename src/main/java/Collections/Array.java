package Collections;

// ex 1
public class Array {
    // private int[] numbers = new int[10]; //utworzenie tablicy;

    private int[] array;

    public Exercise1() {
        array = new int[10];
    }

    public Exercise1(int size) {
        array = new int[size];
    }
    public int[] addToArray(){
        for (int i = 1; i <= array.length; i ++){
            array [i - 1] = i;
        }
        return array;
    }
    public void printArray(){
        for (int element: array){
            System.out.println(element + " "){
            }
        }
    }
}
