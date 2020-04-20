package chapters.I

import org.scalatest._
import WorkingWithLists._

class WorkingWithListsTest extends FunSpec with Matchers {

  describe("WorkingWithListsTest") {

    it("simpleList should contain 'foo', 'bar' and 'baz'.") {
      simpleList shouldBe List("foo", "bar", "baz")
    }

    it("`listOfInts` should contain the Ints 1 - 10.") {
      listOfInts shouldBe (1 to 10).toList
    }

    it("`listOfStringsFromInts` should contain the string values of the integers contained in `listOfInts`.") {
      listOfStringsFromInts shouldBe (1 to 10).toList.map(_.toString)
    }

    it("Should pair the integers in `listOfInts` with the string representations in `listOfStringsFromInts`") {
      intStringPairs shouldBe listOfInts.zip(listOfStringsFromInts)
    }

    it("`evenNumbers` should contain all the even number between 1 and 10.") {
      evenNumbers shouldBe listOfInts.filter(_ % 2 == 0)
    }

    it("`fuzzBuzz` should meet the requirements set forth by the game of FizzBuzz.") {
      val input = (1 to 50).toList

      fizzBuzz(input) shouldBe WorkingWithLists.fizzBuzz(input)
    }

    it("Verify expectedFizzBuzz") {
      val input = (1 to 15).toList

      WorkingWithLists.fizzBuzz(input) shouldBe List(
        "1",
        "2",
        "Fizz",
        "4",
        "Buzz",
        "Fizz",
        "7",
        "8",
        "Fizz",
        "Buzz",
        "11",
        "Fizz",
        "13",
        "14",
        "FizzBuzz"
      )
    }
  }

}

object WorkingWithListsTest {

  def expectedFizzBuzz(input: List[Int]): List[String] =
    input map {
      case i if i % 3 + i % 5 == 0 => "FizzBuzz"
      case i if i % 3 == 0         => "Fizz"
      case i if i % 5 == 0         => "Buzz"
      case i                       => i.toString
    }
}
