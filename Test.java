public class Test {
  public static void main(String[] args)
  {
    Parser parser = new Parser();
    String expr = "exp(3 * cos(x) +0.5*(1+x^2))";

    parser.setVariable("x", 3);
    System.out.println(parser.evaluate(expr));

    System.out.println("\n");

    // Validating an mathematical expression
    if (parser.validate("3 + sqrt(5"))
      System.out.println("The expression is valid!");
    else
      System.out.println("The expression is malformed!");

    System.out.println("\n\n");

    //Evaluate a function in a range
    parser = new Parser("x^2 + 2*sin(x)");
    System.out.println("x    \t     f(x)");
    for (double x = -5; x <= 5; x += 0.1) {
      parser.setVariable("x", x);
      System.out.printf("%.5f\t%.5f\n", x, parser.evaluate());
    }

  }
}

