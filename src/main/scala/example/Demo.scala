package example

object Demo {

    def weeklyFunction(number: Int): String = number match {
      case 1 => "Monday"
      case 2 => "Tuesday"
      case 3 => "Wednesday"
    }
}
