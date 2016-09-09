package CakePattern

object App {
  def main(args: Array[String]) {
    val userService = ComponentRegistry.userService
  }
}

object ComponentRegistry extends
  UserServiceComponent with
  UserRepositoryComponent {
  val userRepository = new UserRepository
  val userService = new UserService
}
