/*
import java.lang.Math;// Java library for Math functions
import java.util.Scanner;// Java library lets us get user input through the scanner function
import java.io.*;// Java library lets us get user input and outputs data
public class snakeeye
{
    public static void main(String[] args) throws IOException // Declares that an error (exception) may occur
    {

            int dice1,dice2,diceroll=0,result,sum=0,intro;





              System.out.println("\tRolling 2 dices");

              dice1= (int)(Math.random() * (6 - 1 + 1) + 1);

              dice2= (int)(Math.random() * (6 - 1 + 1) + 1);

              sum=dice1+dice2;
              result=sum;
              System.out.println("\tRolling 1st dice: "+dice1);
              System.out.println("\tRolling 2nd dice: "+dice2);
              System.out.println("\tSum of two dices is: " +sum);

              //error traping in case user goes out of bounds
              if (diceroll==0)
              {
                if (sum==7 || sum==11)
              {
                System.out.println("\nYou won!");
                break;
              }
                else if (sum==2 || sum==3 || sum==12)
              {
                System.out.println("\nYou lose!");
                break;
              }
                System.out.println("Please press enter a number else than 0 to continue:"  );

                  intro=input.nextInt();
              }

              else
              {

                  System.out.println("Your result is: "+result);

                  System.out.println("Please press enter a number else than 0 to continue:"  );

                  intro=input.nextInt();
              }

              if (diceroll!=0)
              {
                if (sum==7)
              {
                System.out.println("\nYou lost!");
                System.out.println("\nYou rolled a 7!!!");
                System.out.println("1st dice rolled: "+dice1);
                System.out.println("2nd dice rolled: "+dice2);
                break;
              }
              }
              if (diceroll!=0)
              {
                if (sum==result)
              {
                System.out.println("\nYou won!");
                System.out.println("1st dice rolled: "+dice1);
              System.out.println("2nd dice rolled: "+dice2);
                System.out.println("\nThe sum is: "+sum+" which matches the current result!");
                break;
              }
              }
              diceroll++;
           }          //Display Data found

    }
*/