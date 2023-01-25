package example

object Demo {

    def weeklyFunction(number: Int): String = number match {
      case 1 => "Poniedzialek"
      case 2 => "Wtorek"
      case 3 => "Sroda"
      case 4 => "Czwartek"
      case 5 => "Piatek"
      case 6 => "Shanbeh"
      case 7 => "Niedziela"
      case _ => "Wprowadzono niepoprawna wartosc, sprobuj ponownie"

    }
}
