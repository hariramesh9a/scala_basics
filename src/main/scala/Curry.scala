
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


//    Another example to curry.

 def curriedFn[A](operator: (A,A)=>A) :A=>(A=>A)={

   def curries(a:A)={(b:A)=>operator(a,b)}
   curries
 }

    def addFn(a:Int,b:Int):Int={a+b}
    def mulFn(a:Int,b:Int):Int=(a*b)

    val pp=curriedFn(addFn)
    val mm=curriedFn(mulFn)
    println(pp(1)(2))
    println(mm(1)(2))


//Real world example

    //    RealWorld scenario
    //    In this case a premium is calculated as total on each card divided by total number of cards based on the amount.

    case class CreditCard(name:String,total:Double)
    val cc1=new CreditCard("Hari",100)
    val cc2=new CreditCard("Madhu",1000)

    object CreditCard{
      def getPremium(totalCards:Int)(credit:CreditCard):Double={
        if (credit.total>100)           (credit.total*.1)/totalCards
        else credit.total*1/totalCards
      }


    }

    val allcards:List[CreditCard]=List(cc1,cc2)
    val premium=CreditCard.getPremium(allcards.length)_
//    With the _ we mentioned it is a curried function
    val total=allcards.map(premium).sum

    println(total)



  }

}








