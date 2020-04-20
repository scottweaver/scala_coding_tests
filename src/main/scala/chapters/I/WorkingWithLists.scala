package chapters.I

object WorkingWithLists {

  /**
    * Create a List[String] containing the values "foo", "bar" and "baz".
    */
  lazy val simpleList: List[String] = List("foo", "bar", "baz")

  /**
    * Create a List of Int from 1 to 10
    */
  lazy val listOfInts: List[Int] = 1.to(10).toList

  /**
    * Given the `listOfInts`, produce a `List[String]` where each entry is the string representation of that Int.
    */
  lazy val listOfStringsFromInts: List[String] = listOfInts.map(_.toString)

  /**
    * Combine `listOfInts` with `listOfStringsFromInts` so that the each entry contains a tuple of (Int, String)
    * matching each Int with its appropriate String
    */
  lazy val intStringPairs: List[(Int, String)] = listOfInts.zip(listOfStringsFromInts)

  /**
    * Given `listOfInts`, create a new List[Int] that contains even Ints only.
    */
  lazy val evenNumbers: List[Int] = listOfInts.filter(_ % 2 == 0)

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
    input.map { num =>
      num match {
        case num if (num % 3 == 0) && (num % 5 == 0) => "FizzBuzz"
        case num if num % 3 == 0 => "Fizz"
        case num if num % 5 == 0 => "Buzz"
        case num => num.toString
      }
    }
  }

}
