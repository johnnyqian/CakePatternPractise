package CakePattern
/**
  * Created by Johnny on 2016/9/8.
  */
trait UserRepositoryComponent {
  val userRepository: UserRepository

  class UserRepository {
    def authenticate(user: User): User = {
      println("authenticating user: " + user)
      user
    }

    def create(user: User) = println("creating user: " + user)

    def delete(user: User) = println("deleting user: " + user)
  }

}