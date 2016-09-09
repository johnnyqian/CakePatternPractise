package CakePattern
/**
  * Created by Johnny on 2016/9/8.
  */
trait UserServiceComponent {
  this: UserRepositoryComponent =>

  val userService: UserService
  class UserService {
    def authenticate(username: String, password: String): User =
      userRepository.authenticate(new User(username, password))

    def create(username: String, password: String) =
      userRepository.create(new User(username, password))

    def delete(user: User) =
      userRepository.delete(user)
  }

}
