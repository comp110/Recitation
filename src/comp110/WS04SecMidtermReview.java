package comp110;

import java.util.ArrayList;

public class WS04SecMidtermReview {
  /*
   * GUIDED SECTION
   * 
   * We will work through these problems together in recitation.
   */

  /**
   * Problem 1
   * 
   * Let's implement the code to traverse through the given ArrayList of
   * Rectangles and return the sum of the area of all the Rectangles (which is a
   * local variable of this class called _rects). Use a for loop. Then redo with
   * a for-each loop! Go ahead and comment out the original for-loop
   * implementation.
   * 
   * 
   */
  ArrayList<Rectangle> _rects = WS04ShapeMaker.randomSquares(); // this the is
                                                                // the List we
                                                                // want you to
                                                                // use!

  public int p01AreaSum() {

    return 0;
  }

  /**
   * Problem 2
   * 
   * Implement the factorial method for the given parameter n. Remember that 4!
   * = 4*3*2*1. Use a for loop.
   * 
   */

  public int p02Factorial(int n) {
    return 0;
  }

  /**
   * Problem 3
   * 
   * Given an ArrayList of Strings (local variable in this class called
   * _toReverseP03), finish the method that creates a new ArrayList of Strings
   * that is reversed from the original. Use a for loop.
   * 
   */

  // this is the list we want you to use!
  ArrayList<String> _toReverseP03 = WS04StringMaker.randomNames();

  ArrayList<String> p03Reverse() {

    return null;
  }

  /*
   * TEAMWORK SECTION
   * 
   * Work on the following problems with your partner or small group. Note that
   * everyone must submit their own worksheet.
   */

  /**
   * Problem 4
   * 
   * We are going to reverse the given ArrayList (a local variable of this class
   * called _toReverseP04) using a different strategy. This is a multiple step
   * question!
   * 
   * First create a swap method. This method should be private and called
   * p04swap and should take two int inputs and an ArrayList. The method should
   * swap the elements at indexes i and j in the ArrayList passed into it. This
   * method should be void.
   * 
   * Secondly, finish the p04Reverse method. This method should use our p04swap
   * method to reverse the elements in the given ArrayList. Use a for loop. Note
   * the helper method. The p04IndexHelper method returns the index of the
   * element that we want to swap it with given that we are reversing the
   * element. So if we give the method i = 2 and an array of size 6, it will
   * return 3. Make sure this makes sense- it helps to draw it out!
   * 
   */

  // reverse this list!
  ArrayList<String> _toReverseP04 = WS04StringMaker.randomNames();

  private int p04IndexHelper(int i, ArrayList<String> array) {
    return array.size() - 1 - i;
  }

  ArrayList<String> p04Reverse() {

    return null;
  }

  /**
   * Problem 5
   * 
   * In method p05EvenFactorial we are computing the factorial using only the
   * evens. So if we inputed 7 we would expect 6*4*2 = 48. Fix the update
   * condition in the for loop so that this method functions as expected!
   * 
   */

  int p05EvenFactorial(int n) {
    if (n % 2 == 1) {
      n--;
    }
    int fact = 1;
    for (int i = n; i > 0;) {// TODO do the update!
      fact = fact * i;
    }
    return fact;
  }

  /**
   * Problem 6
   * 
   * It is quite sad that our basketball team is comprised of mostly seniors.
   * Given the String parameter year which represents the year of the player in
   * question, return the String "We will miss you!" if they are a senior,
   * "You rock!" if they are a junior or sophomore, "You got this!" if they are
   * a freshman, and otherwise return "Who you?".
   * 
   * NOTE: year will be one of these values, "Freshman" "Sophomore" "Junior"
   * "Senior", or something that is not one of these!
   * 
   * we use the String method equals() to compare Strings.
   * 
   * Remember the conditional OR operator: ||
   * 
   */

  String p06BBallYear(String year) {

    return "Complete this method!";
  }

}
