package app.nickname.myoji.bughouse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_count.*

class CountActivity : AppCompatActivity() {
    val number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
                                                                                                                                                                               setContentView(R.layout.activity_count)

        button.setOnClickListener {
            number　+=　1
            textView.text=number
        }


