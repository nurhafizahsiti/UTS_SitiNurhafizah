package id.ac.polbeng.sitinurhafizah.uts_sitinurhafizah


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.sitinurhafizah.uts_sitinurhafizah.databinding.ActivityMainBinding
import kotlin.math.PI

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMenghitungVolumeTabung.setOnClickListener {
            menghitungVolumeTabung()
        }

        binding.btnMenghitungLuasPermukaanTabung.setOnClickListener {
            menghitungLuasPermukaanTabung()
        }
    }

    private fun menghitungVolumeTabung() {
        val jarijari = binding.inputJarijari.text.toString().toDoubleOrNull()
        val tinggi = binding.inputTinggi.text.toString().toDoubleOrNull()

        if (jarijari == null || tinggi == null) {
            binding.txtHasil.text = "Inputan tidak valid (jari-jari atau tinggi)"
            return
        }

        val volume = PI * (jarijari * jarijari) * tinggi
        binding.txtHasil.text = "Volume Tabung: $volume"
    }

    private fun menghitungLuasPermukaanTabung() {
        val jarijari = binding.inputJarijari.text.toString().toDoubleOrNull()
        val tinggi = binding.inputTinggi.text.toString().toDoubleOrNull()

        if (jarijari == null || tinggi == null) {
            binding.txtHasil.text = "Inputan tidak valid (jari-jari atau tinggi)"
            return
        }

        val luasPermukaan = 2 * PI * jarijari * (jarijari + tinggi)
        binding.txtHasil.text = "Luas Permukaan Tabung: $luasPermukaan"
    }
}
