package montenegro.mario.alkewallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import montenegro.mario.alkewallet.databinding.ActivityEnviarTransferirBinding
import montenegro.mario.alkewallet.databinding.ActivitySignupPageBinding

class EnviarTransferir : AppCompatActivity() {
    lateinit var binding: ActivityEnviarTransferirBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.alke_blue)
        binding = ActivityEnviarTransferirBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ingresarEnviar = intent.getStringExtra("estadoTransaccion")
        if (ingresarEnviar == "enviar") {
            binding.ingresarEnviarDinero.text = "Enviar Dinero"
            binding.userContainer.avatarImageView.setImageResource(R.drawable.not_user)
            binding.userContainer.nameTextView.text = "Yara Khalil"
            binding.userContainer.mailTextView.text = "yara_khalil@gmail.com"
            binding.labelMonto.text = "Cantidad a transferir"
            binding.labelNotas.text = "Notas de transferencia"
            binding.hintInput.hint = "Agregar notas de transferencia (opcional)"
            binding.ingresarDinero.visibility = View.INVISIBLE
            binding.enviarDinero.visibility = View.VISIBLE
        }
    }
}