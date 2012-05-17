package cc.clv

import org.specs2.mutable._
import InverseFizzBuzz._

object InverseFizzBuzzSpec extends Specification {
    "solve" should {
        "return answer" in {
            implicit var master = fizzbuzzSequence(1000)
            
            solve(List(Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz)) must_== List(9, 72)
            solve(List(Fizz)) must_== List(3, 3)
            solve(List(Fizz, Buzz, Fizz, Fizz, Buzz, Fizz)) must_== List(3, 12)
            solve(List(Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz)) must_== List(3, 45)
            solve(List(FizzBuzz, Buzz)) must_== None
            solve(List(Fizz, Fizz, Buzz)) must_== List(6, 10)
            solve(List(Buzz, Fizz)) must_== List(5, 6)
            solve(List(Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz)) must_== List(3, 96)
            solve(List(Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz)) must_== List(12, 102)
            solve(List(Fizz, Buzz, FizzBuzz)) must_== None
            solve(List(Buzz, FizzBuzz)) must_== None
            solve(List(Fizz, FizzBuzz)) must_== List(12, 15)
            solve(List(Buzz)) must_== List(5, 5)
            solve(List(Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz)) must_== List(3, 93)
            solve(List(FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz)) must_== List(15, 177)
            solve(List(Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz)) must_== List(3, 27)
            solve(List(Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz)) must_== List(5, 33)
            solve(List(Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz)) must_== List(9, 115)
            solve(List(Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz)) must_== List(9, 48)
            solve(List(Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz)) must_== List(9, 87)
            solve(List(FizzBuzz, Fizz)) must_== List(15, 18)
            solve(List(Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz)) must_== List(9, 30)
            solve(List(Buzz, Buzz, Fizz)) must_== None
            solve(List(Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz)) must_== List(9, 180)
            solve(List(Fizz, Fizz)) must_== List(6, 9)
            solve(List(FizzBuzz)) must_== List(15, 15)
            solve(List(Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz)) must_== List(9, 135)
            solve(List(Fizz, FizzBuzz, Fizz)) must_== List(12, 18)
            solve(List(Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz)) must_== List(12, 96)
            solve(List(Buzz, Fizz, FizzBuzz)) must_== List(10, 15)
            solve(List(Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz)) must_== List(3, 55)
            solve(List(FizzBuzz, Buzz, Fizz)) must_== None
            solve(List(Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz)) must_== List(10, 85)
            solve(List(Buzz, FizzBuzz, FizzBuzz)) must_== None
            solve(List(FizzBuzz, FizzBuzz, Buzz)) must_== None
            solve(List(FizzBuzz, Buzz, Buzz)) must_== None
            solve(List(Buzz, FizzBuzz, Fizz)) must_== None
            solve(List(Fizz, Fizz, FizzBuzz)) must_== None
            solve(List(Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz)) must_== List(3, 33)
            solve(List(Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz)) must_== List(9, 150)
            solve(List(FizzBuzz, FizzBuzz)) must_== None
            solve(List(Fizz, FizzBuzz, FizzBuzz)) must_== None
            solve(List(FizzBuzz, FizzBuzz, Fizz)) must_== None
            solve(List(Fizz, FizzBuzz, Buzz)) must_== None
            solve(List(Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz)) must_== List(9, 120)
            solve(List(Buzz, FizzBuzz, Buzz)) must_== None
            solve(List(FizzBuzz, FizzBuzz, FizzBuzz)) must_== None
            solve(List(Fizz, Fizz, Fizz)) must_== None
            solve(List(Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz)) must_== List(12, 42)
            solve(List(Fizz, Buzz, Fizz)) must_== List(3, 6)
            solve(List(Buzz, Buzz)) must_== None
            solve(List(Fizz, Buzz)) must_== List(9, 10)
            solve(List(Fizz, Buzz, Buzz)) must_== None
            solve(List(Buzz, Buzz, FizzBuzz)) must_== None
            solve(List(Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz)) must_== List(12, 72)
            solve(List(Buzz, Buzz, Buzz)) must_== None
            solve(List(FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz)) must_== List(15, 30)
            solve(List(Buzz, Fizz, Fizz)) must_== List(5, 9)
            solve(List(FizzBuzz, Fizz, Fizz)) must_== None
            solve(List(Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz)) must_== List(9, 55)
            solve(List(Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz)) must_== List(10, 65)
            solve(List(Fizz, Fizz, Buzz, Fizz)) must_== List(6, 12)
            solve(List(FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz)) must_== List(15, 66)
            solve(List(FizzBuzz, Fizz, FizzBuzz)) must_== None
            solve(List(FizzBuzz, Buzz, FizzBuzz)) must_== None
            solve(List(Buzz, Fizz, Buzz)) must_== None
            solve(List(FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz)) must_== List(15, 45)
            solve(List(Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz, Fizz, Buzz, Fizz, Fizz, Buzz, Fizz)) must_== List(12, 162)
            solve(List(FizzBuzz, Fizz, Buzz)) must_== List(15, 20)
        }
    }
}
