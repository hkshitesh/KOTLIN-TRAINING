class Alien {
    var skills: String = "null"
    fun printMySkills() {
        println(skills)
    }
}

fun Alien.addMySkills(a: Alien): String {
    return "${this.skills} ${a.skills}"
}

fun main(args: Array<String>) {
    var a1 = Alien()
    a1.skills = "Kotlin"
    a1.printMySkills()
    var a2 = Alien()
    a2.skills = "Java"
    a2.printMySkills()
    var a3 = Alien()
    a3.skills = a1.addMySkills(a2)
    a3.printMySkills()
}