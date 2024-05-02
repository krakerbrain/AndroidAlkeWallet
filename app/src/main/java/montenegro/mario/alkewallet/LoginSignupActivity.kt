package montenegro.mario.alkewallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat
import montenegro.mario.alkewallet.databinding.ActivityHomePageBinding
import montenegro.mario.alkewallet.databinding.ActivityLoginSignupBinding

class LoginSignupActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginSignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.alke_blue)
        binding = ActivityLoginSignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.creaCuenta.setOnClickListener {
            val intent: Intent =
                Intent(this, SignupPage::class.java)
            startActivity(intent)
        }
        binding.tieneCuenta.setOnClickListener {
            val intent: Intent =
                Intent(this, LoginPage::class.java)
            startActivity(intent)
        }
    }
}