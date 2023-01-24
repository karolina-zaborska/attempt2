package example

import org.scalatest.{FlatSpec, Matchers}

class DemoTest extends FlatSpec with Matchers{
  "The Demo object" should "say Monday" in {
    Demo.weeklyFunction(1) shouldEqual "Monday"
  }
}
