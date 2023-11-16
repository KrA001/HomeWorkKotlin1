data class User(
    val username: String = "Kara",
    val email: String = "geekss@gmail.com",
    val age: Int = 19,
    val password: Int = 2004
): Verifiable {
    override fun verifiable(classUser: User) {
        if (classUser == User()) {
            println("Вход выполнен успешно!")
        } else {
            throw IllegalArgumentException("Неверные данные для входа")
        }
    }
}