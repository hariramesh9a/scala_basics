/**
  * Created by ARUMUHX on 8/15/2018.
  */
object methodsAndFunctions {

  def main(args: Array[String]): Unit = {

    //    Functions
    val getArea = (radius: Double) => {
      val pi = 3.14
      pi * radius * radius
    }: Double

    println(getArea(5))


    //    Method

    def getArea1(radius: Double): Double = {
      val pi = 3.14
      pi * radius * radius
    }

    println(getArea1(5))


    //    Functions and Methods:
    //    Function is a first class citizen in scala methods are not
    //    Functions are objects with behavior, methods are not objects - function can be stored val
    //    Methods not r-val - methods are trait descend from anyRef

    //    convert method to function:

    val pi = 3.14
    val r = 10

    def getCircleArea(r: Double): Double = pi * r * r
    val circarea:Double=>Double=getCircleArea
    println(circarea(r))
//    short hand
    val circAreaPh=getCircleArea _
    println(circAreaPh(r))

  }

}
