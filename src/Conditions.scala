object Conditions {
  def main(): Unit = {
    someVal(20, 20)
  }
  def someVal(toCompare: Integer, benchmark: Integer): Unit = {
    var result: Option[String] = None
    if (toCompare == benchmark){
      result = Some("Equal")
    } else {
      result = Some("Not Equal")
    }
    println(result.getOrElse("Huh"))
  }

  def compareStrings(s1: String, s2: String): Unit = {
    val result = if (s1 != s2) "Is not equal" else "Not not equal"
    println(result);
  }
}