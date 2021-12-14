import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.*;

public class day3pt2 {
    public static void main(String[] args) {
        System.out.println("Test");
        int one = 0;
        int zero = 0;
        char myChar;
        char count = '1';
        String epsilon = "";
        String gamma = "";
        int finalInt = 0;
        int f = 0;
        int i = 0;
        int h = 0;
        int g = 0;
        ArrayList<String> str = new ArrayList<String>();

        try {
            //Creates arraylist
            File myObj = new File("day3/day3pt2.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                //System.out.println(data1.charAt(i));
                str.add(data);
            }
                while (f < str.size()){
                    h = 0;
                    while( h < 5){
                            myChar = str.get(f).charAt(h);
                            if(myChar == '1'){
                                one += 1;
                            } else if (myChar == '0'){
                                zero += 1;
                            }
                            h += 1;
                        }
                        if(one > zero){
                            gamma = gamma + "1";
                            epsilon = epsilon + "0";
                            one = 0;
                            zero = 0;
                            count = '1';
                        } else if (zero > one) {
                            gamma = gamma +  "0";
                            epsilon = epsilon +  "1";
                            one = 0;
                            zero = 0;
                            count = '0';
                        }
                    System.out.println("Count: " + count);
                    i = 0;
                    g = 0;
                    while(i < str.size() && g < 5){
                        if(str.get(i).charAt(g) != count){
                            System.out.println("Removed: " + str.get(i) + " i=" + i + " " + count);
                            str.remove(i);
                        }else{
                            System.out.println("Kept: " + str.get(i) + " i=" + i + " " + count);
                            i += 1;
                        } 
                        g += 1;
                    }
                    f += 1;
                }
                System.out.println("New Size: " + str.size());
                f = 0;
                
                myReader.close();
               
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          finalInt = (Integer.parseInt(epsilon, 2) * Integer.parseInt(gamma, 2));
          System.out.println("epsilon: " + epsilon + " " + Integer.parseInt(epsilon, 2) + ". gamma: " + gamma + " " + Integer.parseInt(gamma, 2));
          System.out.println("Answer: " + finalInt);
          System.out.println(str);
    }
}