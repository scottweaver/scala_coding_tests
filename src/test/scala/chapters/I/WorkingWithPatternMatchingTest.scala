package chapters.I

import org.scalatest._
import WorkingWithPatternMatching._
import WorkingWithLists._

class WorkingWithPatternMatchingTest extends FunSpec with Matchers with OptionValues {

  describe("WorkingWithPatternMatching") {

    it("`numberNamesUpToFive` should contain the expected values") {

      def message(i: Int) = s"$i is greater than 5."

      listOfInts.map(numberNamesUpToFive) shouldBe List(
        "one",
        "two",
        "three",
        "four",
        "five",
        message(6),
        message(7),
        message(8),
        message(9),
        message(10)
      )

    }
  }

}
