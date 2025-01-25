//Chanchakorn Jullapech
//672115007
import java.util.Scanner;

public class queueMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        queue studentQueue = new queue(5);
        
        System.out.print("Please enter student name, enter ‘quit’ to exit the program: ");
        while (true) {
            String Name = scanner.nextLine();
            
            if (Name.equalsIgnoreCase("quit")) {
                break;
            }
            studentQueue.enqueue(Name);
            studentQueue.print();


    }
        studentQueue.dequeue();;
    studentQueue.print();
}
}
