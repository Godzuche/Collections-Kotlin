fun main(args: Array<String>) {
    //list of numbers
    val  numbers = listOf(0,3,8,4,0,5,5,8,9,2)
    println("list: $numbers")
    println("sorted: ${numbers.sorted()}")

    //convert the number to set
    val setOfNumbers = numbers.toSet()
    println("set: $setOfNumbers")

    //Equality of set
    val set1 = setOf(1,2,3)
    val set2 = mutableSetOf(3,2,1)
    println("$set1 == $set2: ${set1 == set2}")

    //Checking if a set contains an item
    println("contains 7: ${setOfNumbers.contains(7)}")

    // Sets can also use intersect() and union()


    //Maps also called dictionary
    val peopleAges = mutableMapOf<String, Int>("Fred" to 30, "Ann" to 23)
    //adding entry using the shorthand notation
    peopleAges["Joe"] = 51
    //using put() to add an entry
    peopleAges.put("Barbara", 42)
    //using an existing key updates the value instead of adding another entry
    peopleAges["Fred"] = 31
    println(peopleAges)
}