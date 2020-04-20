package chapters.I

import WorkingWithLists._

object WorkingWithFunctions {

  /**
    * Implement a function that adds two Ints together.
    */
  lazy val addTwoNumbers: (Int, Int) => Int = (x: Int, y: Int) => x + y

  /**
    * Use `addTwoNumbers` defined above sum the values contained in `listOfInts`
    *
    */
  lazy val sumOflistOfInts: Int = listOfInts.reduce(addTwoNumbers)

}
