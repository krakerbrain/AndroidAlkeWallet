package montenegro.mario.alkewallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import montenegro.mario.alkewallet.databinding.ActivityHomePageBinding


class HomePage : AppCompatActivity() {
    lateinit var binding: ActivityHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.alke_blue)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Leer el parámetro enviado desde la actividad anterior
        val mostrarInclude = intent.getBooleanExtra("mostrarInclude", true)

        // Ocultar el include si mostrarInclude es false
        if (!mostrarInclude) {
            binding.transacciones.transaccionesContainer.visibility = View.INVISIBLE
        }

        binding.enviarDinero.setOnClickListener {
            val intent: Intent =
                Intent(this, EnviarTransferir::class.java)
            intent.putExtra("estadoTransaccion", "enviar")
            startActivity(intent)
        }

        binding.ingresarDinero.setOnClickListener {
            val intent: Intent =
                Intent(this, EnviarTransferir::class.java)
            intent.putExtra("estadoTransaccion", "ingresar")
            startActivity(intent)
        }

        binding.header.profileImg.setOnClickListener {
            val intent: Intent =
                Intent(this, ProfilePage::class.java)
            startActivity(intent)
        }

//        enviarDineroBtn.visibility = View.INVISIBLE
//        ingresarDineroBtn.isEnabled = false

    }
}