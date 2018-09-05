/**
  * Created by ARUMUHX on 8/10/2018.
  */
object ImmutableMap {

  def main(args: Array[String]): Unit = {

    val weekDays = List("Mon", "Tue", "Wed")
    println(weekDays.map(_ == "Mon"))

    def printAnyVal(z: AnyVal): Unit = {
      print(z)
    }

    def printAnyRef(z: AnyRef): Unit = {
      print(z)
    }

    val z = 100
    val p = List(1, 2, 3)
    printAnyVal(z)
    //
    //    will throw error

    //    for loop
    //    statements or expression - statement to expression with yield

    for (day <- weekDays) {
      day match {
        case "Mon" => println("Monday")
        case otherDay => println(otherDay)
      }

    }

    print(s"using yield")
    val x = for (day <- weekDays) yield {
      day match {
        case "Mon" => "Monday"
        case otherDay => otherDay
      }

    }

    println(x)


  }


}


// scala var/ref all are instance of classes- unified type system . java val and reference type must exit.
//unified type system . Any, AnyVal, AnyRef (ref types)
// None is a value not type
// Nothing is type - cannot be instantiated - inherited form Any - absence of value
// Null ~ java null
// Nil is list of nothing. End with Nothing