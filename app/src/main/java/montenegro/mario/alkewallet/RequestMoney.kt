package montenegro.mario.alkewallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RequestMoney : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request_money)

        val ingresarDineroBtn = findViewById<Button>(R.id.ingresar_dinero)

        ingresarDineroBtn.setOnClickListener {
            val intent: Intent =
                Intent(this, HomePage::class.java)
            startActivity(intent)
        }
    }
}