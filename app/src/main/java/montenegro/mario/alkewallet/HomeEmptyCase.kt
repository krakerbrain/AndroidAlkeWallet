package montenegro.mario.alkewallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeEmptyCase : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_empty_case)
        val enviarDineroBtn = findViewById<Button>(R.id.enviar_dinero)
        val ingresarDineroBtn = findViewById<Button>(R.id.ingresar_dinero)
        val homeBtn = findViewById<Button>(R.id.empty_case)

        enviarDineroBtn.setOnClickListener {
            val intent: Intent =
                Intent(this, SendMoney::class.java)
            startActivity(intent)
        }
        ingresarDineroBtn.setOnClickListener {
            val intent: Intent =
                Intent(this, RequestMoney::class.java)
            startActivity(intent)
        }

        homeBtn.setOnClickListener {
            val intent: Intent =
                Intent(this, HomePage::class.java)
            startActivity(intent)
        }
    }
}