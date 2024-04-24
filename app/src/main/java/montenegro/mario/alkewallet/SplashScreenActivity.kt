package montenegro.mario.alkewallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        window.statusBarColor = ContextCompat.getColor(this, R.color.alke_blue)

        val splashScreenDuration = resources.getInteger(R.integer.splash_screen_duration).toLong()

        // Posterga la transición a la siguiente actividad después de splashScreenDuration milisegundos
        findViewById<View>(android.R.id.content).postDelayed({
            val intent = Intent(this, LoginSignupActivity::class.java)
            startActivity(intent)
            finish()
        }, splashScreenDuration)
    }
}