import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class day3 {
    public static void main(String[] args) {
        System.out.println("Test");
        int one = 0;
        int zero = 0;
        char myChar;
        int count = 0;
        String epsilon = "";
        String gamma = "";
        //Get length
        try {
            File myObj = new File("C:/Users/Brandy Minx/OneDrive - PCS Software/Documents/Advent of Code/2021/advent_of_code21/day3/day3pt1.txt");
            Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                count += 1;
                }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          System.out.println(count);
          //Finish count
        try {
            File myObj1 = new File("C:/Users/Brandy Minx/OneDrive - PCS Software/Documents/Advent of Code/2021/advent_of_code21/day3/day3pt1.txt");
            Scanner myReader1 = new Scanner(myObj1);
            for(int i = 0; i < count; i++){
                while (myReader1.hasNextLine()) {
                String data1 = myReader1.nextLine();
                System.out.println(data1.charAt(i));
                myChar = data1.charAt(i);
                if(myChar == '1'){
                    one += 1;
                } else if (myChar == '0'){
                    zero += 1;
                }
                }
                if(one > zero){
                    gamma = gamma + one;
                    epsilon = epsilon + zero;
                } else if (zero > one) {
                    gamma = gamma + zero;
                    epsilon = epsilon + one;
                }
            }
            myReader1.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        System.out.println("epsilon: " + epsilon + ". gamma: " + gamma);
    }
}
