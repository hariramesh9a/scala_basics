/**
  * Created by ARUMUHX on 9/5/2018.
  */
object FirstOrderFn {

  def main(args: Array[String]): Unit = {

    val weeks = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")

    val isManicMonday = (x: String) => (x == "Monday"): Boolean

    println(weeks.map(isManicMonday))
    println(weeks.filter(isManicMonday))
    println(weeks.partition(isManicMonday))

    val intList = List(10, 20, 30, 40, 50, 60)
    println(intList.scanRight(0)(_ - _))
  }

}
