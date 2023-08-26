package common

object OOBasics extends App{
  val person = new Person("John", 24)
  person.greet("Daniel")
}

class Person(name: String, val age: Int){
  def greet(name: String) : Unit = println(s"${this.name} says: Hi, $name")
  val author = new Writer("Djibril", "Diouf", 1992)
  val novel = new Novel("Great expectations", 1998, author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))
}

class Writer(firstname: String, surname: String, val year: Int){
  val fullname: String = firstname + " " + surname
}

class Novel(name: String, year: Int, author: Writer){
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}
