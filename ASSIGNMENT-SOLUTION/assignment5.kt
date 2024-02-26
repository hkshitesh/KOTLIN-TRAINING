class InvalidVotingException(message: String) : Exception(message) {
    fun printMessage() {
        println(message)
    }
}
fun main(args: Array<String>) {
    println("Enter your age: ")
    val age: Int = Integer.valueOf(readLine())
    try {
        if (age < 18) {
            throw InvalidVotingException("You are not eligible to vote")
        } else {
            println("You are eligible to vote")
        }
    } catch (e: InvalidVotingException) {
        e.printMessage()
    }
}