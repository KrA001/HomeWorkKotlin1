import java.util.Scanner

fun main(args: Array<String>) {
    val userInfo = User(username = "gari", email = "salam@gmail.com", age = 14, password = 2003)

    val scanner = Scanner(System.`in`)
    println("|-----------<Log in>------------|")
    print("Input username: ")
    val userName = scanner.nextLine()
    print("Input email: ")
    val email = scanner.nextLine()
    print("Input age: ")
    val age = scanner.nextInt()
    print("Input password: ")
    val password = scanner.nextInt()

    val inputUserModel = User(username = userName, email = email, age = age, password = password)

    userInfo.verifiable(inputUserModel)
}