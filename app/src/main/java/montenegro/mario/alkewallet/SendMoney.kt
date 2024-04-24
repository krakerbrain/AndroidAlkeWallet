package montenegro.mario.alkewallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SendMoney : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_money)
        val enviarDineroBtn = findViewById<Button>(R.id.enviar_dinero)

        enviarDineroBtn.setOnClickListener {
            val intent: Intent =
                Intent(this, HomePage::class.java)
            startActivity(intent)
        }
    }
}