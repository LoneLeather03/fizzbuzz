
package fizzbuzz;

public class FizzBuzz {
  
  public static final int DEFAULT_UPPER_LIMIT = 100;

  public static final String USAGE =
      "Usage:%n" + "\tjava [options] fizzbuzz.FizzBuzz [limit]%n" + "%n" + "where%n"
          + "\toptions = VM otions%n" + "\tlimit = positive upper counting limit (default = 100)%n";

  public static void main(String[] args) {
    try {
      int upperLimit = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_UPPER_LIMIT;
      if (upperLimit < 0) {
        throw new IllegalArgumentException("Upper limit must be positive");
      }
      emitFizzBuzz(upperLimit);
    }
    catch (IllegalArgumentException ex) {
      emitUsage();
      ex.printStackTrace();
    }
  }
  
  private static void emitFizzBuzz(int limit) {
    for (int i = 1; i <= limit; i++) {
      String response = "";
      if (i % 3 == 0) {
        response += "Fizz";
      }
      if (i % 5 == 0) {
        response += "Buzz";
      }
      if (response.length() == 0) {
        response = String.format("%d", i);
      }
      System.out.println(response);
    }
  }

  private static void emitUsage() {
    System.out.printf(USAGE);  
  }
  
}
