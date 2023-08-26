package common

import scala.io.StdIn.readLine
object ValuesVariablesTypes extends App {
  var somme : Int = 0
  print("Donnez la valeur de x: ")
  val x = readLine().toInt
  print("Donnez la valeur de y: ")
  val y = readLine().toInt
  somme = x + y
  println("Somme x + y = ", somme)
  val aCondition = true
  val aConditionValue = if(aCondition) 4 else 2
  println(aConditionValue)
  var i = 0
  while(i < 10){
    println(i)
    i += 1
  }

  val codeBlock = {
    val x : Int = 12
    val y : Int = 23
    if (x + y > 24) "Hello" else "OK"
  }
  println(codeBlock)
}