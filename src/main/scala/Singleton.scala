package main.scala


class Singleton(name: String) {
  def hi(): Unit = {

    println(name)
  }

}

//This is singleton object. Can have one instance. When is along with a class, it is called companion object. Scala class cannot have static variables
// If singleton is named and available at same file as class then it is called companion objects
object Singleton {

  def helloWorld(): Unit = {

    println("Hi")
  }

}


object UseSingleton {

  def main(args: Array[String]): Unit = {
    val newSing=new Singleton("Hari")
    newSing.hi()
    Singleton.helloWorld()
//
//    Hari
//    Hi

  }



}



