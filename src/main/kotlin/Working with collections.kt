
fun main (args: Array<String>) {

    //Maps also called dictionary
    val peopleAges = mutableMapOf<String, Int>("Fred" to 30, "Ann" to 23)
    //adding entry using the shorthand notation
    peopleAges["Joe"] = 51
    //using put() to add an entry
    peopleAges.put("Barbara", 42)
    //using an existing key updates the value instead of adding another entry
    peopleAges["Fred"] = 31

    //forEach
    peopleAges.forEach {
        print("${it.key} is ${it.value}, ")
    }

    println()

    //map() function
    println(peopleAges.map {
        "${it.key} is ${it.value}"
    }.joinToString(", "))

    //filter
    val filteredName = peopleAges.filter {
        it.key.length < 4
    }
    println(filteredName)

}