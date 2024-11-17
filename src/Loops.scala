object Loops {
  def whileLoops (start: Integer, limit: Integer): Unit = {
    var counter = start

    while (counter <= limit){
      println(s"counter is $counter")
      counter += 1
    }
  }

  def doWhileLoop(start: Integer, limit: Integer): Unit = {
    var current = start
    do {
      val remaining = limit - current
      print(s"The current value is $current - only $remaining to go\n")
      current += 1
    } while (current < limit)
  }

  def forLoops(start: Int, limit: Int): Unit = {
    for (i <- start until limit){
//      println(s"Doing for loop $i")
    }

    for (i <- 1 to 9; j <- 9.to(11)){
//      println(s"The value of \"i\" is $i and the value of \"j\" is $j")
    }
  }

  def iterateOverList(list: List[Int]): Unit = {
    for (i <- list; if i <= 20 || i > 30){
      println(s"Printing $i form list")
    }
    val result = for {i <- list; if i <= 20 || i > 30} yield {
      i * 10
    }
    println("result = "+ result)

  }
}