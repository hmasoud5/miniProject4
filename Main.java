import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);



  }

  static int credits (int passed , int totalGrade)
  {
    if ( passed )
    {
     totalGrade = totalGrade + 3; 
    }
    return totalGrade; 
  }

  static boolean passClass(int grade) {
    if (grade > 70) {
      return true;
    } else {
      return false;
    }
  }
}
