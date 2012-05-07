val Trial = 32
val Rule = 90
val InitialState = List.concat(List.fill(32)(0), List(1), List.fill(32)(0))

def neighbors(state: List[Int]) = List.concat(
    List(state.last+:state.take(2)),
    Range(0, state.size - 2).zip(Range(3, state.size + 1)).map(t => state.slice(t._1, t._2)),
    List(state.takeRight(2):+state.head)
)

def pattern(neighbor: List[Int]) = neighbor.zip(List(4, 2, 1)).map(t => t._1 * t._2).sum

def nextState(pattern: Int) = ((1 << pattern) & Rule) match {
    case 0 => 0
    case _ => 1
}

def tick(state: List[Int]) = neighbors(state).map(neighbor => nextState(pattern(neighbor)))

// main
for (cells <- List.iterate(InitialState, Trial)(state => tick(state))) {
    println(new String(cells.map{
        case 0 => ' '
        case 1 => '*'
    }.toArray))
}