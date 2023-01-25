package example

import org.scalatest.{FlatSpec, Matchers}

class DemoTest extends FlatSpec with Matchers{
  "The Demo object" should "say lundi" in {
    Demo.weeklyFunction(1) shouldEqual "lundi"
  }

  "The Demo object" should "say mardi" in {
    Demo.weeklyFunction(2) shouldEqual "mardi"
  }

  "The Demo object" should "say mercredi" in {
    Demo.weeklyFunction(3) shouldEqual "mercredi"
  }

  "The Demo object" should "say jeudi" in {
    Demo.weeklyFunction(4) shouldEqual "jeudi"
  }

  "The Demo object" should "say vendredi" in {
    Demo.weeklyFunction(5) shouldEqual "vendredi"
  }
  "The Demo object" should "say samedi" in {
    Demo.weeklyFunction(6) shouldEqual "samedi"
  }

  "The Demo object" should "say dimanche" in {
    Demo.weeklyFunction(7) shouldEqual "dimanche"
  }

  "The Demo object" should "say Entrée hors limites" in {
    Demo.weeklyFunction(8) shouldEqual "Entrée hors limites"
  }

}
