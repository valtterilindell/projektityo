import java.io.Console; 
/**
 * the Main class of the application
 */
public class Main {
/**
 * main method of the application
 */
    public static void main(String [] args) {
        Console c = System.console();

/**
 * Asking user to give a number (grade)
 * Saving the given number with int to grade
 */
        System.out.print("Syota arvosana:");
        int grade = Integer.parseInt(c.readLine());
/**
 * Using @param if and else we check is the number bigger or equal to one
 * If number is bigger or equal to one, the application prints "hyvää joulua Jussi"
 * If number is smaller than one, the application prints out "kokeile uudestaan"
 */
        if (grade >= 1) {
            System.out.println("Hyvaa joulua Jussi!");
        } else {
            System.out.println("Kokeile uudestaan");
        }
    }
}

        

