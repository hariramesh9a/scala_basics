/**
  * Created by ARUMUHX on 8/15/2018.
  */
object Curry {
  def main(args: Array[String]): Unit = {


    //    arity: number of arguments.

    def compareStr(s1: String, s2: String): Int = {
      if (s1 == s2) 0
      else if (s1 > s2) -1
      else 1
    }

    def smartComp(s1: String, s2: String, cmpFn: (String, String) => Int): Int = {
      cmpFn(s1, s2)
    }

    val defaultComp = smartComp(_: String, _: String, compareStr)

    println(defaultComp("abc", "xyz"))


    //    currying:
    def smartCompcurry(s1: String, s2: String, cmpFn: (String, String) => Int): Int = {
      cmpFn(s1, s2)
    }

    def curryCompare(cmpFn: (String, String) => Int)(s1: String, s2: String): Int = {
      cmpFn(s1, s2)
    }

    println("curry output")
    println(curryCompare(compareStr)("abc", "xyz"))

    val defcompare = curryCompare(compareStr)(_: String, _: String)
    println(defcompare("abc", "xyz"))

    //    curried function: partially applying entire parameter group to reduce arity

  }

}
