package chapters.I

import org.scalatest._
import WorkingWithFunctions._
import WorkingWithLists._

class WorkingWithFunctionsTest extends FunSpec with Matchers with OptionValues {

  it("`addTwoNumber` should add two numbers together.`") {

    addTwoNumbers(1, 3) shouldBe 4
  }

  it("`addTwoNumber` can be used to sum the contents of `listOfInts`") {

    sumOflistOfInts shouldBe listOfInts.sum
  }

}
