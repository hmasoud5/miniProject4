import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    // recieving user input from the user

    System.out.println(" Enter in your grade: ");
    // enter in your grade in order to find out if you recieve credits
    int grade = scan.nextInt();

    int totalGrade = 0;
    if (passClass(grade)) {
      System.out.println(" Three credits will be added! ");
      grade = credits(totalGrade);
      System.out.println(" Your total credits now : " + grade);
    } else {
      System.out.println(" Must retake class. ");
      
      System.out.println(" Total credits now : ");
    }

  }

  // method calculates credits
  static int credits(int totalGrade) {

    totalGrade = totalGrade + 3;
    // if passed class then three credits will be added

    return totalGrade;
  }

  // method calculates passing class
  static boolean passClass(int grade) {
    if (grade > 70) {
      return true;
      // return true if your grade is greater than 70 ; meaning you passed the class.
    } else {
      return false;
      // return false if your grade is less than 70 ; meaning you passed the class.
    }
  }
}
