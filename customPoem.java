import java.util.*;
import java.util.Scanner;

public class customPoem {
  public static void main(String[] args){

    //define object scanner
    Scanner scanner = new Scanner(System.in);

    System.out.println("Poem provided by Shakespeare: \n");

    String poem_one = "Over hill, over dale,|\nThorough bush, thorough brier,|\nOver park, over pale,|\nThorough flood, thorough fire!|\nI do wander everywhere,|\nSwifter than the moon's sphere;|\nAnd I serve the Fairy Queen,|\nTo dew her orbs upon the green;|\nThe cowslips tall her pensioners be;|\nIn their gold coats spots you see;|\nThose be rubies, fairy favours;|\nIn those freckles live their savours;|\nI must go seek some dewdrops here,|\nAnd hang a pearl in every cowslip's ear.";
    
    System.out.println(poem_one);

    //split each line by a special character
    String[] lines = poem_one.split("\\|");

    String finalPoem = "";
    
    for(int i = 0; i < 3; i++){
        System.out.println("\nWhat first line do you wanna pick? 1-14:  ");

        int choice = scanner.nextInt();

        //since most programming languages use 0, 1, 2, ... and not 1, 2, ..., 
        //we subtract one
        //users may not pick line 0, but they most likely pick line 1, which is the most common
        int index = choice - 1;

        System.out.println("You picked the line: ");

        //the current line that the user selected based on its index position
        String current_line = lines[index];

        //print out the index number of the poem that is already seperated by special character
        System.out.println(current_line + "\n");

        //add the line to the finalPoem variable to combine all of the lines
        finalPoem += current_line + " ";  
    }
    System.out.println("--------------------------------------------------");
    System.out.println("Your final poem: \n");
    System.out.println(finalPoem);
  }
}
