package montenegro.mario.alkewallet


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
        window.statusBarColor = ContextCompat.getColor(this, R.color.alke_blue)

        val loginBtn = findViewById<Button>(R.id.login_btn)
        val tieneCuentaBtn = findViewById<Button>(R.id.tiene_cuenta)

        loginBtn.setOnClickListener { // Crear un Intent para iniciar la segunda actividad
            val intent: Intent =
                Intent(this, HomePage::class.java)
            startActivity(intent)
        }
        tieneCuentaBtn.setOnClickListener { // Crear un Intent para iniciar la segunda actividad
            val intent: Intent =
                Intent(this, SignupPage::class.java)
            startActivity(intent)
        }

    }
}
