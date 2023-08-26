package common

object Functions extends App {
  def aFunction(a: String, b: Int) : String = {
    a + " " + b
  }
  println(aFunction("Hello", 3))

  def anOtherFunction() : Int = 3
  println(anOtherFunction())

  def aRepeatFunction(aString : String, a : Int) : String = {
    if (a == 1) aString
    else aString + aRepeatFunction(aString, a-1)
  }
  println(aRepeatFunction("Hello", 1))

  def aBigFunction(n : Int) : Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b
    aSmallFunction(n, n-1)
  }
  println(aBigFunction(3))
}
