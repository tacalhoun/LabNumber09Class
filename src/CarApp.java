import java.util.Scanner;

/**
 * Created by TACasey-Calhoun on 7/20/2017.
 */
public class CarApp {
        //this class runs at the console
        // so it gets a main
        public static void main(String[] args) {
            //instantiate a couple instances of Student
            //this calls the no-argument version of the constructor
            Scanner scan = new Scanner(System.in);

            int userInput;

            System.out.println("Welcome to the Grand Circus Motors admin console!");

            System.out.println("How many cars are you entering:  ");
            scan.nextLine();

            for (int i; i <= userInput; i++) {

            }

            Car car1 = new Car();
            car1.setMake("Allie");
            car1.setModel("Born");
            car1.setYear(1977);
            car1.setPrice(0.00);
            //I can't directly change private instance variables
            //if there's no setter, I can't change it
            //student1.id = 333;
            //student1.setGrade(1.0);

            //Student student2 = new Student("Abby", "Death",
            //        "TechHire", 666, 1.0);


            //use the getters to retrieve the info
            System.out.println("Enter Car #1 Make:  " + car1.getMake());
            System.out.println("Enter Car #1 Model:  " + car1.getModel());
            System.out.println("Enter Car #1 Year:  " + car1.getYear());
            System.out.println("Enter Car #1 Price:  " + car1.getPrice());
        /*            + student1.getLastName()
                    + student1.getBootcamp() + "("
                    + student1.getID() + ")"
                    + student1.getGrade() );
            System.out.println(student2.getFirstName() + " "
                    + student2.getLastName() + "-"
                    + student2.getBootcamp() + "("
                    + student2.getID() + ")"
                    + student2.getGrade() ); */
        }
}
