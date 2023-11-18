data class User(
    val username: String,
    val email: String,
    val age: Int,
    val password: Int
) : Verifiable {
    override fun verifiable(classUser: User) {
        if (classUser.username == username &&
            classUser.email == email &&
            classUser.age == age &&
            classUser.password == password) {
            println("Вход выполнен успешно!")
        } else {
            throw IllegalArgumentException("Неверные данные для входа")
        }
    }
}