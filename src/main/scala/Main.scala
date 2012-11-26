import scala.macros.CopyMacro

object Main {

  case class Test(s: String, id: Option[Int] = None)

  // has to be compiled by its own
  object Test extends App {

    assert(CopyMacro.withId(Test("scala rulz"), Some(1)) == Test("scala rulz", Some(1)))

  }
}
