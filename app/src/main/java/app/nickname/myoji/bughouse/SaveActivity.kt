package app.nickname.myoji.bughouse

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_save.*

class SaveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save)

        val sharedPreferences = getSharedPreferences("SharedPreferences", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        saveButton.setOnClickListener {
            val text = input.text
            editor.putString("SAVE", text.toString())
            editor.apply()
        }
    }
}
