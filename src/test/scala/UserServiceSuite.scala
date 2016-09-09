package CakePattern

import org.scalatest.FunSuite
import org.specs2.mock.Mockito

/**
  * Created by Johnny on 2016/9/9.
  */
class UserServiceSuite extends FunSuite
with Mockito
with UserServiceComponent
with UserRepositoryComponent {
  lazy val userRepository = mock[UserRepository]
  lazy val userService = mock[UserService]

  val user = new User("test", "test")
  userRepository.authenticate(any[User]) returns user

  test("testAuthenticate") {
    assert(userRepository.authenticate(user) == user)
  }
}
