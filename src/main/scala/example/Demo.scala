package example

object Demo {

    def weeklyFunction(number: Int): String = number match {
      case 1 => "lundi"
      case 2 => "mardi"
      case 3 => "mercredi"
      case 4 => "jeudi"
      case 5 => "vendredi"
      case 6 => "Shanbeh"
      case 7 => "dimanche"
      case _ => "Entrée hors limites"

    }
}
