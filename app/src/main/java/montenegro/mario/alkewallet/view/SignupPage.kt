package montenegro.mario.alkewallet.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import montenegro.mario.alkewallet.HomePage
import montenegro.mario.alkewallet.R
import montenegro.mario.alkewallet.databinding.ActivitySignupPageBinding
import montenegro.mario.alkewallet.model.User
import montenegro.mario.alkewallet.viewmodel.SignUpViewModel

class SignupPage : AppCompatActivity() {
    private lateinit var signUpViewModel: SignUpViewModel
    private lateinit var binding: ActivitySignupPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.alke_blue)
        binding = ActivitySignupPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        signUpViewModel = ViewModelProvider(this)[SignUpViewModel::class.java]


        binding.creaCuenta.setOnClickListener { // Crear un Intent para iniciar la segunda actividad
            val user = getUserFromInputFields()
            if (user != null) {
                if (signUpViewModel.signUp(user)) {
                    // Registro exitoso
                    Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show()
                } else {
                    // Error en el registro
                    Toast.makeText(this, "Error en el registro", Toast.LENGTH_SHORT).show()
                }
            } else {
                // Error en los datos ingresados por el usuario
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
            }

        }
        binding.tieneCuenta.setOnClickListener { // Crear un Intent para iniciar la segunda actividad
            val intent: Intent =
                Intent(this, LoginPage::class.java)
            startActivity(intent)
        }
    }

    private fun getUserFromInputFields(): User? {
        val nombre = binding.includeSignupForm.editNombreInput.text.toString()
        val apellido = binding.includeSignupForm.editApellidoInput.text.toString()
        val email = binding.includeSignupForm.editEmailInput.text.toString()
        val password = binding.includeSignupForm.editPassInput.text.toString()
        val confirmPassword = binding.includeSignupForm.editConfirmPassInput.text.toString()

        // Devolver un objeto User con los datos ingresados por el usuario si son válidos
        return if (nombre.isNotEmpty() && apellido.isNotEmpty() && email.isNotEmpty() &&
            password.isNotEmpty() && confirmPassword.isNotEmpty() && password == confirmPassword) {
            User(nombre, apellido, email, password,0,0)
        } else {
            null
        }

    }
}