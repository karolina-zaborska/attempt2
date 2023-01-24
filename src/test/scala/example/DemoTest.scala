package example

import org.scalatest.{FlatSpec, Matchers}

class DemoTest extends FlatSpec with Matchers{
  "The Demo object" should "say Monday" in {
    Demo.weeklyFunction(1) shouldEqual "Monday"
  }

  "The Demo object" should "say Tuesday" in {
    Demo.weeklyFunction(2) shouldEqual "Tuesday"
  }
}
