package all

class CalculatorApp {
    var command: String = ""

    fun start() {
        println("Welcome to Calculator!")

        while (command != "exit") {
            when(command) {
                "+" -> {
                    val result = addition()
                    println("The result is $result")
                }
                "-" -> {
                    val result = substraction()
                    println("The result is $result")
                }
                "*" -> {
                    val result = multiplication()
                    println("The result is $result")
                }
                "/" -> {
                    val result = division()
                    println(" The result is $result")
                }
                "" -> {

                }
                else -> {
                    "Use one of the Supported Commands!"
                }
            }
            println("-------------------------------")
            println("You can use the Commands: '+', '-', '*' and '/'.")
            println("(To exit the Program use the command 'exit')")
            command = readln()
        }
        println("Program Closed!")
        println("Thank you for using The Calculator!")
    }
    fun addition(): Double {
        print("Enter first Number: ")
        val num1 = readln().toDouble()

        print("Enter second Number: ")
        val num2 = readln().toDouble()

        return num1 + num2
    }
    fun substraction(): Double {
        print("Enter first Number: ")
        val num1 = readln().toDouble()

        print("Enter second Number: ")
        val num2 = readln().toDouble()

        return num1 - num2
    }
    fun multiplication(): Double {
        print("Enter first Number: ")
        val num1 = readln().toDouble()

        print("Enter second Number: ")
        val num2 = readln().toDouble()

        return num1 * num2
    }
    fun division(): Double {
        print("Enter first Number: ")
        val num1 = readln().toDouble()

        print("Enter second Number: ")
        val num2 = readln().toDouble()

        return num1 / num2
    }
}