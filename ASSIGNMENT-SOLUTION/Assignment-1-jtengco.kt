val operateOnNumbers: (Int, Int, (Int, Int) -> Int) -> Int = { a, b, op -> op(a, b) }

val sort: (List<String>) -> List<String> = {l -> l.sortedBy { it.length }}

fun main() {
    val multiply: (Int, Int) -> Int = {a, b -> a * b}
    println("Multiply of 2 and 6 is: ${operateOnNumbers(2, 6, multiply)}")

    val strList = listOf(
        "hello",
        "hello world",
        "test",
        "a",
        "heeeey",
    )

    println("Sort result:\n${sort(strList)}")
}
