public class FizzBuzz {
    public void fizzBuzz(int i) {

            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(String.valueOf(i));

                // fizzbuzz logic here
            }
        }
    }
