package main.scala

object FoldReduceMap {

  def main(args: Array[String]): Unit = {

    val myList=List(1,2,3,4)
    println(myList.foldRight(0)(add(_,_)))
//    Just summing up all in list
    def add(i:Int,j:Int):Int={i+j}

//    Reverse the list with foldleft

    def reverse[A](list: List[A]):List[A]={

      list.foldLeft(List[A]()){(r,c)=>c::r}
    }

    println(reverse(myList))


  }

}
