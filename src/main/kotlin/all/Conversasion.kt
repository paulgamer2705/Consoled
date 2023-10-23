package all

import Person

class Conversasion {
    var command: String = ""
    val people: MutableList<Person> = mutableListOf()

    fun startnow() {
        println("Welcome to our List!")

        while(command != "exit"){
            when(command) {
                "add" -> {
                    println("Adding people...")
                    val newPerson = createPersonFromUserInput()
                    people.add(newPerson)
                    println("Added User!")
                }
                "list" -> {
                    println("Listing people...")
                    println(people)
                }
                "delete" -> {
                    println("Deleting people...")
                    val newPerson = createPersonFromUserInput()
                    people.remove(newPerson)
                    println("User $newPerson has been deleted!")
                }
                "" -> {

                }
                else -> {
                    println("Unknown Command!")
                }
            }
            println("------------------------------")
            println("Supported commands: 'add', 'list' and 'delete'.")
            println("(To exit the Program use Command: 'exit'.")
            command = readln()
        }
        println("Program has been Closed!")
        println("Thank's for using the Conversation!")
    }
    fun createPersonFromUserInput(): Person {
        print("Person Id: ")
        val id = readln()

        print("Person name: ")
        val name = readln()

        print("Person age: ")
        val age = readln()

        return Person(
            id = id,
            name = name,
            age = age.toInt(),

            )
    }
}