package fizzbuzz;

/**
 * Hello world!
 *
 */
public class FizzBuzz {
    public static void main( String[] args ) {
        System.out.println(new FizzBuzz().fizzbuzz(args[0]));
    }
    
    public String fizzbuzz(String number) {
        Integer num = Integer.valueOf(number);
        if (((num % 5) == 0) && ((num % 3) == 0)) {
            return "FizzBuzz";
        } else if ((num % 5) == 0) {
            return "Buzz";
        } else if ((num % 3) == 0) {
            return "Fizz";
        } else {
            return number;
        }
    }
}
