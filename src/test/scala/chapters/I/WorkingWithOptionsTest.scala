package chapters.I

import org.scalatest._
import WorkingWithOptions._
import options._
import cats.implicits._

class WorkingWithOptionsTest extends FunSpec with Matchers with OptionValues {

  it("`optionFoo` should contain the String 'foo'.") {
    optionFoo shouldBe Some("foo")
  }

  it("`optionSmooshed` should contain the value 'foobar'") {
    optionSmooshed.value shouldBe "foobar"
  }

  it("`optionOfList` should contain the same values `listOfOptions") {

    optionOfList(listOfOptions) shouldBe listOfOptions.sequence

    optionOfList(List.empty) shouldBe None
  }

  it("`fromOption` should return the expected string value.") {

    valueFromOption(None) shouldBe "oops!"

    valueFromOption(optionFoo) shouldBe "foo"
  }

}
