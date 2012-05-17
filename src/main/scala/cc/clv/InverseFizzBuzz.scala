package cc.clv

object InverseFizzBuzz extends App {
    case object FizzBuzz
    case object Fizz
    case object Buzz
    
    def fizzbuzzSequence(limit: Int) = Range(1, limit).collect {
        case x if x % 15 == 0 => (x, FizzBuzz)
        case x if x % 3 == 0 => (x, Fizz)
        case x if x % 5 == 0 => (x, Buzz)
    }
    
    def matchedSequences(master: Seq[(Int, Any)], sequences: List[Seq[(Int, Any)]])(implicit pattern: List[Any]):List[Seq[(Int, Any)]] = {
        master.map(e=>e._2).indexOfSlice(pattern) match {
            case -1 => sequences
            case x => matchedSequences(master.drop(x + 1), sequences :+ master.drop(x).take(pattern.size))
        }
    }
    
    def solve(pattern: List[Any])(implicit master: Seq[(Int, Any)]) = {
        implicit var p = pattern
        matchedSequences(master, List()).sortBy(e => e.last._1 - e.head._1) match {
            case x if x.size == 0 => None
            case x => {
                val ans = x.head
                List(ans.head._1, ans.last._1)
            }
        }
    }
    
    implicit var master = fizzbuzzSequence(1000)
    
    println(solve(List(Fizz))) // (3, 3)
    println(solve(List(Buzz))) // (5, 5)
    println(solve(List(Fizz, Fizz, Buzz))) // (6, 10)
    println(solve(List(Fizz,Buzz))) // (9, 10)
    println(solve(List(Buzz,Fizz))) // (5, 6)
    println(solve(List(Fizz,Buzz,Fizz))) // (3, 6)
    println(solve(List(Fizz,Fizz))) // (6, 9)
}