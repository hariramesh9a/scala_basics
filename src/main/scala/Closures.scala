object Closures {

  def main(args: Array[String]): Unit = {

    //    by name functions name=> regular dunction parameters has name:
    //    by name will calculate the reference paramters again.. especially in case of data streams

    def sayHello(name: String): String = {
      println(s"$name is my name")
      println(s"$name is my name again")
      name
    }

    def greet(name: String): String = {
      println(s"greet")
      s"Respected $name"
    }


    def sayHellobyName(name: => String): String = {
      println(s"$name is my name")
      println(s"$name is my name again")
      name
    }

    sayHello("Hari")
    sayHellobyName("Hari")


    //    closure:

    def getareaClousre = {

      val PI = 3.14

      def getArea = (radius: Double) => {
        PI * radius * radius
      }: Double

      getArea
    }

    val PI = 3
    val r = 10

    val areaCalc: Double => Double = getareaClousre
    println(areaCalc(r))

  }

}
