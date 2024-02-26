
val sortedBy:(List<String>) -> List<String> = {list -> list.sortedBy { a -> a.length }}

fun main(){
    println(sortedBy(listOf("Kotlin", "Java", "C++", "Python")))
}