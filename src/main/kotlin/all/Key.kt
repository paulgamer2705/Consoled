package all

import all.CalculatorApp

class Key {
    var command: String = ""
    fun start2() {
        println("Hello and thank you for using my App!")

        while(command != "exit") {
            when(command) {
                "Calculator" -> {
                    val myApp = CalculatorApp()
                    myApp.start()
                }
                "Conversation" -> {
                    val myApp = Conversasion()
                    myApp.startnow()
                }
                "" -> {

                }
                else -> {
                    println("Unknown Command!")
                }
            }
            println("--------------------------------")
            println("Supported Commands: 'Calculator' and ' Conversation'.")
            println("(To exit the Program use the Command: 'exit'.)")
            command = readln()
        }
        println("Program has been closed!")
        println("Thank you for using my App!")
    }
}