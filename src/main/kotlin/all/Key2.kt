import all.Key
import all.Conversasion
import all.CalculatorApp

class Key2 {
    var command: String = ""
    fun starttr() {

        while (command != "exit") {
            when (command) {
                "1234" -> {
                    val myApp = Key()
                    myApp.start2()
                }

                "" -> {

                }

                else -> {
                    println("Wrong Keyword!")
                }
            }
            println("-----------------------")
            println("Enter Keyword to Start the Program.")
            println("(Enter 'exit' to close the Program.)")
            command = readln()
        }
        println("App has been Closed!")
        println("Thank you fro using the App!")
    }
}