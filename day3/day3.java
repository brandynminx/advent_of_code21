import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class day3 {
    public static void main(String[] args) {
        System.out.println("Test");
        int one = 0;
        int zero = 0;
        char myChar;
        String epsilon = "";
        String gamma = "";
        int finalInt = 0;
        try {
        
            for(int i = 0; i < 12; i++){
                File myObj1 = new File("day3/day3pt1.txt");
                Scanner myReader1 = new Scanner(myObj1);
                while (myReader1.hasNextLine()) {
                    String data1 = myReader1.nextLine();
                    //System.out.println(data1.charAt(i));
                    myChar = data1.charAt(i);
                    if(myChar == '1'){
                        one += 1;
                    } else if (myChar == '0'){
                        zero += 1;
                    }
                }
                if(one > zero){
                    gamma = gamma + "1";
                    epsilon = epsilon + "0";
                    one = 0;
                    zero = 0;
                } else if (zero > one) {
                    gamma = gamma +  "0";
                    epsilon = epsilon +  "1";
                    one = 0;
                    zero = 0;
                }
                myReader1.close();
            }
                
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          finalInt = (Integer.parseInt(epsilon, 2) * Integer.parseInt(gamma, 2));
          System.out.println("epsilon: " + epsilon + " " + Integer.parseInt(epsilon, 2) + ". gamma: " + gamma + " " + Integer.parseInt(gamma, 2));
          System.out.println("Answer: " + finalInt);
    }
}
