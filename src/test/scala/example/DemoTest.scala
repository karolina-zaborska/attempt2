package example

import org.scalatest.{FlatSpec, Matchers}

class DemoTest extends FlatSpec with Matchers{
  "The Demo object" should "say Poniedzialek" in {
    Demo.weeklyFunction(1) shouldEqual "Poniedzialek"
  }

  "The Demo object" should "say Wtorek" in {
    Demo.weeklyFunction(2) shouldEqual "Wtorek"
  }

  "The Demo object" should "say Sroda" in {
    Demo.weeklyFunction(3) shouldEqual "Sroda"
  }

  "The Demo object" should "say Czwartek" in {
    Demo.weeklyFunction(4) shouldEqual "Czwartek"
  }

  "The Demo object" should "say Piatek" in {
    Demo.weeklyFunction(5) shouldEqual "Piatek"
  }
  "The Demo object" should "say Sobota" in {
    Demo.weeklyFunction(6) shouldEqual "Sobota"
  }

  "The Demo object" should "say Niedziela" in {
    Demo.weeklyFunction(7) shouldEqual "Niedziela"
  }

  "The Demo object" should "say OutOfBounds" in {
    Demo.weeklyFunction(8) shouldEqual "OutOfBounds"
  }

}
