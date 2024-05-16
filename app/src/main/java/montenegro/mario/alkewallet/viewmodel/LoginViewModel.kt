package montenegro.mario.alkewallet.viewmodel

import androidx.lifecycle.ViewModel
import montenegro.mario.alkewallet.model.User
import montenegro.mario.alkewallet.model.UserRepository

class LoginViewModel : ViewModel() {
    private val userRepository = UserRepository()

    fun login(email: String, password: String): Boolean {
        val user = User("", "", email, password, 0, 0)
        return userRepository.login(user)
    }
}