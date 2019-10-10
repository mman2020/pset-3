/**
 * Problem Set 3.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();

        // comment out or uncomment as needed

        ps.sign();          // executes Exercise 1
        ps.parity();        // executes Exercise 2
        ps.ordered();       // executes Exercise 3
        ps.gpa();           // executes Exercise 4
        ps.grade();         // executes Exercise 5
        ps.cards();         // executes Exercise 6
        ps.leapYear();      // executes Exercise 7
        ps.state();         // executes Exercise 8
        ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */

    public void sign() {
      System.out.print("\nEnter an integer: ");
      int signInteger = in.nextInt();

      if(signInteger > 0) {
        System.out.println("\nPositive.");
      } else if(signInteger < 0) {
        System.out.println("\nNegative.");
      } else if(signInteger == 0) {
        System.out.println("\nZero.");
      }
    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter an integer. Is it even or odd?
     */

    public void parity() {
      System.out.print("\nEnter an integer: ");
      int parityInteger = in.nextInt();

      if((parityInteger % 2) == 0) {
        System.out.println("\nEven.");
      } else {
        System.out.println("\nOdd.");
      }
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter three integers. How are the integers ordered?
     */

    public void ordered() {
      System.out.println("\nEnter three integers.");
      System.out.print("\nEnter integer: ");
      int integer1 = in.nextInt();
      System.out.print("Enter integer: ");
      int integer2 = in.nextInt();
      System.out.print("Enter integer: ");
      int integer3 = in.nextInt();

      if(integer1 == integer2 && integer2 == integer3) {
        System.out.println("\nSame.");
      } else if(integer1 < integer2 && integer2 < integer3) {
          System.out.println("\nStrictly increasing.");
      } else if(integer1 <= integer2 && integer2 <= integer3) {
          System.out.println("\nIncreasing.");
      } else if(integer1 > integer2 && integer2 > integer3) {
        System.out.println("\nStrictly decreasing.");
      } else if(integer1 >= integer2 && integer2 >= integer3) {
        System.out.println("\nDecreasing.");
      } else {
        System.out.println("\nUnordered.");
      }
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */

    public void gpa() {
      final double GRADE_A = 4.00;
      final double GRADE_B = 3.00;
      final double GRADE_C = 2.00;
      final double GRADE_D = 1.00;
      final double GRADE_F = 0.00;
      final double DIFFERENCE_POINTS = 0.33;
      String plusMinus = "";
      double gpa = 0.00;

      System.out.print("\nEnter a letter grade: ");
      in.nextLine();
      String letterGrade1 = in.nextLine();
      letterGrade1 = letterGrade1.trim();
      letterGrade1 = letterGrade1.toUpperCase();
      String firstLetter = letterGrade1.substring(0, 1);
      if(letterGrade1.length() == 2) {
        plusMinus = letterGrade1.substring(1, 2);
      }
      if(letterGrade1.length() <= 2 && letterGrade1.length() > 0 && (firstLetter.equals("A") || firstLetter.equals("B") || firstLetter.equals("C") || firstLetter.equals("D") || firstLetter.equals("F")) && (plusMinus.equals("") || plusMinus.equals("+") || plusMinus.equals("-")) && !letterGrade1.equals("F+") && !letterGrade1.equals("F-")) {
        if(plusMinus.equals("+")) {
          gpa += DIFFERENCE_POINTS;
        } else if(plusMinus.equals("-")) {
          gpa -= DIFFERENCE_POINTS;
        }
        if(firstLetter.equals("A")) {
          gpa += GRADE_A;
          if(gpa > 0) {
            gpa -= DIFFERENCE_POINTS;
          }
        } else if(firstLetter.equals("B")) {
          gpa += GRADE_B;
        } else if(firstLetter.equals("C")) {
          gpa += GRADE_C;
        } else if(firstLetter.equals("D")) {
          gpa += GRADE_D;
        } else if(firstLetter.equals("F")) {
          gpa += GRADE_F;
          if(gpa < 0) {
            gpa += DIFFERENCE_POINTS;
          }
        }
        System.out.printf("\nYour GPA is %.2f.\n", gpa);
      } else {
        System.out.println("\nThat's not a valid letter grade.");
      }
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {
      System.out.print("\nEnter a grade: ");
      double qpa = in.nextDouble();
      char gradeLetter = 'X';
      String ana = "";
      final int A_PLUS = 100;
      final int A_MINUS = 90;
      final int B_PLUS = 89;
      final int B_MINUS = 80;
      final int C_PLUS = 79;
      final int C_MINUS = 70;
      final int D_PLUS = 69;
      final int D_MINUS = 60;
      final int F_PLUS = 59;
      final int zero = 0;

      if(qpa >= zero && qpa <= A_PLUS) {
        if(qpa >= A_MINUS && qpa <= A_PLUS) {
          gradeLetter = 'A';
          ana = "an";
        } else if(qpa >= B_MINUS && qpa <= B_PLUS) {
          gradeLetter = 'B';
          ana = "a";
        } else if(qpa >= C_MINUS && qpa <= C_PLUS) {
          gradeLetter = 'C';
          ana = "a";
        } else if(qpa >= D_MINUS && qpa <= D_PLUS) {
          gradeLetter = 'D';
          ana = "a";
        } else if(qpa >= zero && qpa <= F_PLUS) {
          gradeLetter = 'F';
          ana = "an";
        }
        System.out.printf("\nYou received " + ana + " " + gradeLetter +  ".\n");
      } else if(qpa < zero) {
        System.out.println("\nGrades below 0 are invalid.");
      } else if(qpa > 100) {
        System.out.println("\nGrades above 100 are invalid.");
      }
    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {
      System.out.print("\nEnter a card: ");
      in.nextLine();
      String card = in.nextLine();
      String rank = card.substring(0, 1).toUpperCase();
      String suit = card.substring(1, 2).toUpperCase();
      String wordRank = "";
      String wordSuit = "";

      if(card.length() == 2 && (rank.equals("2") || rank.equals("3") || rank.equals("4") || rank.equals("5") || rank.equals("6") || rank.equals("7") || rank.equals("8") || rank.equals("9") || rank.equals("T") || rank.equals("J") || rank.equals("Q") || rank.equals("K") || rank.equals("A")) && (suit.equals("C") || suit.equals("H") || suit.equals("D") || suit.equals("S"))) {
        if (rank.equals("2")) {
          wordRank = "Two";
        } else if (rank.equals("3")) {
          wordRank = "Three";
        } else if (rank.equals("4")) {
          wordRank = "Four";
        } else if (rank.equals("5")) {
          wordRank = "Five";
        } else if (rank.equals("6")) {
          wordRank = "Six";
        } else if (rank.equals("7")) {
          wordRank = "Seven";
        } else if (rank.equals("8")) {
          wordRank = "Eight";
        } else if (rank.equals("9")) {
          wordRank = "Nine";
        } else if (rank.equals("T")) {
          wordRank = "Ten";
        } else if (rank.equals("J")) {
          wordRank = "Jack";
        } else if (rank.equals("Q")) {
          wordRank = "Queen";
        } else if (rank.equals("K")) {
          wordRank = "King";
        } else if (rank.equals("A")) {
          wordRank = "Ace";
        }
        if (suit.equals("C")) {
          wordSuit = "Clubs";
        } else if (suit.equals("D")) {
          wordSuit = "Diamonds";
        } else if (suit.equals("H")) {
          wordSuit = "Hearts";
        } else if (suit.equals("S")) {
          wordSuit = "Spades";
        }
        System.out.println("\n" + wordRank + " of " + wordSuit + ".");
      } else if(card.length() != 2) {
        System.out.println("\nThat's not a valid card.");
      } else if(!(rank.equals("2") || rank.equals("3") || rank.equals("4") || rank.equals("5") || rank.equals("6") || rank.equals("7") || rank.equals("8") || rank.equals("9") || rank.equals("T") || rank.equals("J") || rank.equals("Q") || rank.equals("K") || rank.equals("A")) && !(suit.equals("C") || suit.equals("H") || suit.equals("D") || suit.equals("S"))) {
        System.out.println("\nThat's not a valid rank or a valid suit.");
      } else if(!(rank.equals("2") || rank.equals("3") || rank.equals("4") || rank.equals("5") || rank.equals("6") || rank.equals("7") || rank.equals("8") || rank.equals("9") || rank.equals("T") || rank.equals("J") || rank.equals("Q") || rank.equals("K") || rank.equals("A"))) {
        System.out.println("\nThat's not a valid rank.");
      } else if(!(suit.equals("C") || suit.equals("H") || suit.equals("D") || suit.equals("S"))) {
        System.out.println("\nThat's not a valid suit.");
      }
    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {
       System.out.print("\nEnter a year: ");
       int isLeapYear = in.nextInt();
       String trueFalse = "";

       if (isLeapYear % 4 == 0 && (isLeapYear % 100 != 0 | isLeapYear % 400 == 0)) {
         trueFalse = " is ";
       } else {
         trueFalse = " is not ";
       }
       System.out.println("\n" + isLeapYear + trueFalse + "a leap year.");
    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {
      System.out.print("\nEnter a temperature: ");
      double temperature = in.nextDouble();
      System.out.print("Enter a scale: ");
      in.nextLine();
      String scale = in.nextLine();
      scale = scale.toUpperCase();
      String matter = "";
      final int FREEZING_FAHRENHEIT = 32;
      final int BOILING_FAHRENHEIT = 212;
      final int FREEZING_CELSIUS = 0;
      final int BOILING_CELSIUS = 100;

      if (scale.equals("F") || scale.equals("C")) {
        if (scale.equals("F")) {
          if (temperature <= FREEZING_FAHRENHEIT) {
            matter = "Solid.";
          } else if (temperature > FREEZING_FAHRENHEIT && temperature < BOILING_FAHRENHEIT) {
            matter = "Liquid.";
          } else if (temperature >= BOILING_FAHRENHEIT) {
            matter = "Gas.";
          }
        } else if (scale.equals("C")) {
          if (temperature <= FREEZING_CELSIUS) {
            matter = "Solid.";
          } else if (temperature > FREEZING_CELSIUS && temperature < BOILING_CELSIUS) {
            matter = "Liquid.";
          } else if (temperature >= BOILING_CELSIUS) {
            matter = "Gas.";
          }
        }
        System.out.println("\n" + matter);
      } else {
        System.out.println("\nThat's not a valid scale.");
      }
    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {

    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {

    }
}
