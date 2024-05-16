package montenegro.mario.alkewallet.view


import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import montenegro.mario.alkewallet.HomePage
import montenegro.mario.alkewallet.R
import montenegro.mario.alkewallet.databinding.ActivityLoginPageBinding
import montenegro.mario.alkewallet.viewmodel.LoginViewModel


class LoginPage : AppCompatActivity() {
    private lateinit var loginViewModel: LoginViewModel
    private lateinit var binding: ActivityLoginPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.alke_blue)


        binding = ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loginViewModel = ViewModelProvider(this)[LoginViewModel::class.java]



        binding.loginBtn.setOnClickListener {
            val userEmail = binding.editTextEmail.text.toString()
            val userPassword = binding.editTextPassword.text.toString()

            if (loginViewModel.login(userEmail, userPassword)) {
                // Si el inicio de sesión es exitoso, navegar a la siguiente actividad
                startActivity(Intent(this, HomePage::class.java))
            } else {
                // Mostrar un mensaje de error en caso contrario
                Toast.makeText(this, "Inicio de sesión fallido", Toast.LENGTH_SHORT).show()
            }


        }
        binding.tieneCuenta.setOnClickListener { // Crear un Intent para iniciar la segunda actividad
            val intent: Intent =
                Intent(this, SignupPage::class.java)
            startActivity(intent)
        }
    }
}
