
import java.util.Scanner; // imports scanner for user input
import java.util.ArrayList; // imports arraylist to store input

public class IncreasingNumberArray {
    public static void main(String[] args) {
        // create scanner object for input and arraylist to store numbers
        Scanner input = new Scanner(System.in); 
        ArrayList<Integer> numberList = new ArrayList<>(); 
        
        // user input prompt
        System.out.println("Enter 5 numbers to be displayed in increasing order. ");
        // loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter mumber " + (i + 1) + ": ");
            int number = input.nextInt(); 
            numberList.add(number);
        }
        // sort and display numbers
        sort(numberList);
        System.out.println("Your list of numbers in increasing order: " + numberList);
        
        // closes scanenr
        input.close(); 
    }
    
    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int currentMinIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) > list.get(currentMinIndex)) {
                    currentMinIndex = j;                                      
                }
            }
            if (currentMinIndex !=i) {
                int temp = list.get(i);
                list.set(i, list.get(currentMinIndex));
                list.set(currentMinIndex, temp);
            }
        }
    }
}


