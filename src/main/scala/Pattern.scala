/**
  * Created by ARUMUHX on 8/15/2018.
  */
object Pattern {

  def main(args: Array[String]): Unit = {

    var dayOfWeek = "Monday"
    val typeoffay = dayOfWeek match {
      case "Monday" => "1"
      case "Tuesday" => "7"
    }

    println(typeoffay)


    //    value binding

    val typeofday = dayOfWeek match {
      case "sunday" | "monday" => "Boring"
      case someday => {
        println(s"today is $someday")
        someday
      }
    }

    println(typeofday)
    dayOfWeek = "Friday"
    val typeofdayplaceholder = dayOfWeek match {
      case "sunday" | "monday" => "Boring"
      case _ => "some random day"
    }

    println(typeofdayplaceholder)


    //    patter match on list
    val radius: Any = 10
    val typeradius = radius match {

      case radius: Int => "integer"
      case radius: String => "string"
    }

    print(typeradius)

  }

}
