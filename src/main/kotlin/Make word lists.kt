
fun main (args: Array<String>) {
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    val filteredWordsStartingWithB = words.filter {
        it.startsWith("b", ignoreCase = true)
    }.shuffled()
        .take(2) //takes only the first two items in the list
        .sorted() //sort the random list
    println(filteredWordsStartingWithB)
    //shuffling the list
    //use shuffled() above
}