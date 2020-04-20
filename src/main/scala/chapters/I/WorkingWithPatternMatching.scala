package chapters.I

object WorkingWithPatternMatching {

  /**
    * Given an Int, return as String that:
    *
    * - For the numbers up to 5, return that numbers name e.g. "one" for 1, "two" for 2, etc..
    * - For numbers > 5, return the "i is greater than 5." where `i` is the string representation of the Int.
    *
    */
  lazy val numberNamesUpToFive: Int => String = (num: Int) => {
    num match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case 4 => "four"
      case 5 => "five"
      case n => s"$n is greater than 5."
    }
  }

}
