package chapters.I

import options._
import cats.implicits._

object WorkingWithOptions {

  /**
    * Create and Option[String] containing the word 'foo'.
    */
  lazy val optionFoo: Option[String] = ???

  /**
    * Combine it with `optionFoo` with `optionBar` to produce
    * an Option[String] containing the word "foobar".
    */
  lazy val optionSmooshed: Option[String] = ???

  /**
    * Convert the List[Option[String]], `input`, to an Option[List[String]]
    * HINT: You can use Cats for this if like. ;)
    */
  // lazy val optionOfList: Option[List[String]] = {
  def optionOfList(input: List[Option[String]]): Option[List[String]] = ???

  /**
    * Implement this method so that it returns the value contained within the argument
    * `option`, if it exists, otherwise return the word "oops!".
    *
    * @param option
    * @return
    */
  def valueFromOption(option: Option[String]): String = {

    ???
  }
}
