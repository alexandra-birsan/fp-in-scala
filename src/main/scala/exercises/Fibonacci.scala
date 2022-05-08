package exercises

object Fibonacci extends App {

  private def findNthFibonacciNumber(number: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, prev: Int, current: Int): Int = n match {
      case 0 => prev
      case 1 => current
      case _ => loop(n - 1, current, prev + current)
    }

    loop(number, 0, 1)
  }

  private val value: Int = findNthFibonacciNumber(5)
  println(value)

}
