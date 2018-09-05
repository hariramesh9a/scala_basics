/**
  * Created by ARUMUHX on 8/17/2018.
  */
object Collections {
  def main(args: Array[String]): Unit = {
    //    Tuples
    val genderPair = ("hari", "Male")
    def printGender(name: String, gender: String) = println(s"name: $name Gender: $gender")
    (printGender _).tupled(genderPair)
    println(genderPair.productArity)
    //    Lists
    val weekdays = "Monday" :: "Tuesday" :: Nil
    val weeks = List("Wed", "Thu", "Fri")
    val days = weekdays ::: weeks
    println(days.head)
    println(days startsWith weeks)
    //    Maps
    val states = Map("California" -> "CA", "New York" -> "NY", ("Vermont", "VT"))
    println(states)
    println(states.contains("Georgia"))
    states.foreach((f:(String,String))=> println(f._1 + "=" + f._2) )

    val st=List("California","Ohio","Illinois")
    val cd=List("CA","OH","IL")
    val statecode2=(st zip(cd)).toMap
    println(statecode2)

    val statess=statecode2.keySet.toList
    println(statess)
  }

}
