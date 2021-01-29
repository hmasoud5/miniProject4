import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    System.out.println(" Enter in your grade : ");
    int grade = scan.next();
    
    if (passClass(grade))
    {
     System.out.println(" Three credits will be added! ");
     (credits(totalGrade)); 
    }else{
      System.out.println(" Must retake class. ");
    }


  }

  // method calculates credits
  static int credits(int totalGrade) {
    if (passed) {
      totalGrade = totalGrade + 3;
      // if passed class then three credits will be added
    }
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
