import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    // recieving user input from the user
    System.out.println("How many classes do you have?");
    //asking the amount of classes you have. 
    int classes = scan.nextInt();

    int totalCredits = 0;
    //starting at 0 and adding 3 from credits method if your crade is grater than 70
    for(int i = 0 ; i < classes ; i++)
    //depending on how many classes you have, the for loop will loop it as many times as user said.
    {
      System.out.println("What is your class name?");
      String subject = scan.next();
      // enter in your grade in order to find out if you recieve credits
      System.out.println(" Enter in your grade: ");
      int grade = scan.nextInt();
      //enter grade in order to know if you may get the credits

      if (passClass(grade)) {
      System.out.println(" Three credits will be added! ");
      totalCredits = credits(totalCredits);
      //if pass class three credits will be added for ever class passed
      System.out.println(" Your total credits now : " + totalCredits);
      } else {
        System.out.println(" Must retake class. ");

        System.out.println(" Total credits now : " + totalCredits);
        //if failed class your total credits will remain 0 
      } 
    }
  }

  // method calculates credits
  static int credits(int totalCredits) {

    totalCredits = totalCredits + 3;
    // if passed class then three credits will be added

    return totalCredits;
  }

  // method calculates passing class
  static boolean passClass(int grade) {
    if (grade >= 70) {
      return true;
      // return true if your grade is greater than 70 ; meaning you passed the class.
    } else {
      return false;
      // return false if your grade is less than 70 ; meaning you passed the class.
    }
  }
}
