object HelloWorld {
  def main(person: Option[String] = None): Unit = {
    greeting(person.getOrElse("World"))
  }

  private def greeting(person: String): Unit = {
    println(s"Hello $person!\nYou good?")
  }
}