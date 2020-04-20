package chapters.I

object WorkingWithLists {

  /**
    * Create a List[String] containing the values "foo", "bar" and "baz".
    */
  lazy val simpleList: List[String] = ???

  /**
    * Create a List of Int from 1 to 10
    */
  lazy val listOfInts: List[Int] = ???

  /**
    * Given the `listOfInts`, produce a `List[String]` where each entry is the string representation of that Int.
    */
  lazy val listOfStringsFromInts: List[String] = ???

  /**
    * Combine `listOfInts` with `listOfStringsFromInts` so that the each entry contains a tuple of (Int, String)
    * matching each Int with its appropriate String
    */
  lazy val intStringPairs: List[(Int, String)] = ???

  /**
    * Given `listOfInts`, create a new List[Int] that contains even Ints only.
    */
  lazy val evenNumbers: List[Int] = ???

  /**
    * Implement Fizz Buzz
    *
    * FizzBuzz is a game designed to teach division.
    *
    * The algorithm is defined as follows:
    *
    * - If a number is divisible by 3, it should be changed to the string "Fizz".
    * - If a number is divisible by 5, it should be changed to the string "Buzz".
    * - If a number is divisible by both 3 and 5, it should be changed the string "FizzBuzz".
    * - If a number does not meet any of the above criteria, its value should be printed as a string i.e. 4 would be "4".
    */
  def fizzBuzz(input: List[Int]): List[String] = {
    ???
  }

}
