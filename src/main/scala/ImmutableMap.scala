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
    //    print
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



//    Example of map and flatmap
//    Think flat map as map flat same as map.flatten

    val stringList=Seq("1","2","3","NotaNumber")

//    Method to convert string to Int
    def toInt(s:String):Option[Int]={try{Some(Integer.parseInt(s.trim()))} catch {case exception: Exception=> None}}

//    Map
    println(stringList.map(toInt))
//    List(Some(1), Some(2), Some(3), None)

//    flatMap

    println(stringList.flatMap(toInt))
//    List(1, 2, 3)

//    Map. Flatten

    println(stringList.map(toInt).flatten)
//    List(1, 2, 3)

//map.flatten same as flat map List(1, 2, 3)

//    another example where u can apply a function and flat map
    val list1=List(1,2,3)
    val list2=List(1,2,3)
    println(list1.flatMap{a=> list2 map {b=>b*a}})

//List(1, 2, 3, 2, 4, 6, 3, 6, 9)

  }


}


// scala var/ref all are instance of classes- unified type system . java val and reference type must exist.
//unified type system . Any, AnyVal, AnyRef (ref types)
// None is a value not type
// Nothing is type - cannot be instantiated - inherited from Any - absence of value
// Null ~ java null
// Nil is list of nothing. End with Nothing