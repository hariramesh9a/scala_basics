/**
  * Created by ARUMUHX on 8/15/2018.
  */
object firstclass {

  def main(args: Array[String]): Unit = {
    //    first class function
    //    function can be stored in a val/var
    //    return value can be function
    //    input argument can be function
    //    higehr order fucntion: ret val/argumnet are functions
    def comapreDes(a: String, b: String): Int = {

      if (a == b) 0
      else if (a > b) -1
      else 1

    }

    def comapreAsc(a: String, b: String): Int = {

      if (a == b) 0
      else if (a > b) 1
      else -1

    }

    //    get comapratroi is a higher order function
    def getComparator(s1: String, s2: String, cmpFn: (String, String) => Int): Int = cmpFn(s1, s2)

    println(getComparator("abc", "xyz", comapreDes))

    def getComp(rev: Boolean): (String, String) => Int = {
      if (rev) comapreAsc
      else comapreDes
    }

    println("getcomp")
    val revCompobj = getComp(true)
    println(revCompobj("abc", "xyx"))


  }

}
