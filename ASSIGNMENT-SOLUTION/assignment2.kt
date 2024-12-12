val filterNumbers:(List<Int>, (Int) -> Boolean) -> List<Int> = {list, predicate -> list.filter { predicate(it) }}
val predicate: (Int) -> Boolean = {it > 0}
