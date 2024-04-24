package montenegro.mario.alkewallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat

class LoginSignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_signup)
        window.statusBarColor = ContextCompat.getColor(this, R.color.alke_blue)
        val creaCuentaBtn = findViewById<Button>(R.id.crea_cuenta)
        val tieneCuentaBtn = findViewById<Button>(R.id.tiene_cuenta)

        creaCuentaBtn.setOnClickListener { // Crear un Intent para iniciar la segunda actividad
            val intent: Intent =
                Intent(this, SignupPage::class.java)
            startActivity(intent)
        }
        tieneCuentaBtn.setOnClickListener { // Crear un Intent para iniciar la segunda actividad
            val intent: Intent =
                Intent(this, LoginPage::class.java)
            startActivity(intent)
        }
    }
}