package montenegro.mario.alkewallet.viewmodel

import androidx.lifecycle.ViewModel
import montenegro.mario.alkewallet.model.User
import montenegro.mario.alkewallet.model.UserRepository

class SignUpViewModel : ViewModel() {
    private val userRepository = UserRepository()

    fun signUp(user: User): Boolean {
        // Realizar validaciones de datos aquí
        if (!validateUserData(user)) {
            return false
        }

        // Realizar proceso de registro
        return userRepository.addUser(user)
    }

    private fun validateUserData(user: User): Boolean {
        // Realizar validaciones de los datos del usuario
        // Por ejemplo, verificar que los campos no estén vacíos, validar el formato del correo electrónico, etc.
        return true // Devolver true si los datos son válidos, false si no lo son
    }
}