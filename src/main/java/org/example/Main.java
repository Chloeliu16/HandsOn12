package org.example;
/**
 * The main entry class for the application.
 * <p>
 * This class contains the entry point of the application. It is a utility class that cannot be instantiated.
 * </p>
 */
public final class Main {

  /**
   * Private constructor to prevent instantiation.
   */
  private Main() {
    // Not called
  }

  /**
   * The entry point of the application.
   * <p>
   * This method prints "Hello world!" to the standard output.
   * </p>
   *
   * @param args Command line arguments, not used
   */
  public static void main(final String[] args) {

    System.out.print("Hello world!");
  }
}
