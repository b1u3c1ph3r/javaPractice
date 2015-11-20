/*
 * 	Ch1 Self-test # 9
 *
 * 	This program calculates your effective weight on the Moon
 *
 */
class EarthToMoonGrav {
  public static void main(String args[]) {
    double eWeight, mGrav;
    int counter; counter = 0;

    eWeight = 284;
    System.out.println("David's Earth Weight is " + eWeight + ".");
    mGrav = eWeight * 0.17;
      System.out.println("His Moon weight is " + mGrav + ".");
  }
}
