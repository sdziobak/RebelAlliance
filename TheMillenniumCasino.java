   import java.util.Scanner;

    public class TheMillenniumCasino {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
    //prompting the user for first name, last name, age and money they want to spend 
                System.out.println("Enter your first name: ");
                String firstname = input.next();
                System.out.println("Enter your last name: ");
                String lastname = input .next();
                System.out.println("Enter your age: ");
                int age = input.nextInt();
                if (age < 21){
                    System.out.println("Sorry");
                    System.exit(0);
                }
                else {
                    System.out.println("Great, now we will connvert your money to chips!");
                }
                
                System.out.println("Enter the amount of money you are planning to spend($): ");
                int initialamount = input.nextInt();
                //converting the money to chips and displaying the equivalence in chips 
                int chip = 1;
                int userchips = initialamount * chip;
                System.out.print("You have " + userchips + " chips!");
                

    
        }
    }
    
    

