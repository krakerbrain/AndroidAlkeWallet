package montenegro.mario.alkewallet


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import montenegro.mario.alkewallet.databinding.ActivityLoginPageBinding
import montenegro.mario.alkewallet.databinding.ActivityLoginSignupBinding


class LoginPage : AppCompatActivity() {
    lateinit var binding: ActivityLoginPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.alke_blue)
        binding = ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener { // Crear un Intent para iniciar la segunda actividad
            val intent: Intent =
                Intent(this, HomePage::class.java)
            startActivity(intent)
        }
        binding.tieneCuenta.setOnClickListener { // Crear un Intent para iniciar la segunda actividad
            val intent: Intent =
                Intent(this, SignupPage::class.java)
            startActivity(intent)
        }
    }
}
