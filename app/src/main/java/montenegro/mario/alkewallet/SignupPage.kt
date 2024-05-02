package montenegro.mario.alkewallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat
import montenegro.mario.alkewallet.databinding.ActivityLoginPageBinding
import montenegro.mario.alkewallet.databinding.ActivitySignupPageBinding

class SignupPage : AppCompatActivity() {
    lateinit var binding: ActivitySignupPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.alke_blue)
        binding = ActivitySignupPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.creaCuenta.setOnClickListener { // Crear un Intent para iniciar la segunda actividad
            val intent: Intent =
                Intent(this, HomePage::class.java)
            intent.putExtra("mostrarInclude", false)
            startActivity(intent)
        }
        binding.tieneCuenta.setOnClickListener { // Crear un Intent para iniciar la segunda actividad
            val intent: Intent =
                Intent(this, LoginPage::class.java)
            startActivity(intent)
        }
    }
}