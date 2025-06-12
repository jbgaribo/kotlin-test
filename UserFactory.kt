class User(name: String) {
    val name: String
    companion object UserFactory{
        fun generateUser(name: String) : User{
            return User(name)
        }
    }
}