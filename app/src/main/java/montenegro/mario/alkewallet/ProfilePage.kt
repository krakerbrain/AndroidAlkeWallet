package montenegro.mario.alkewallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat

class ProfilePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)
        window.statusBarColor = ContextCompat.getColor(this, R.color.alke_blue)
//        val homePageBtn = findViewById<Button>(R.id.home_page)

//        homePageBtn.setOnClickListener {
//            val intent: Intent =
//                Intent(this, HomePage::class.java)
//            startActivity(intent)
//        }
    }
}