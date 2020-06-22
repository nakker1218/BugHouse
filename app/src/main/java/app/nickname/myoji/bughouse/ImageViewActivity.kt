package app.nickname.myoji.bughouse

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import coil.api.load
import kotlinx.android.synthetic.main.activity_image_view.*

class ImageViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_image_view)

        imageView.load("https://life-is-tech.com/materials/images/summer2019_desktop_3.jpg")

        getImageButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_CREATE_DOCUMENT)
            intent.type = "image/*"
            intent.putExtra(Intent.EXTRA_TITLE, "sample_image.jpg")
            startActivityForResult(intent, 100)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 1 && resultCode == Activity.RESULT_CANCELED) {
            imageView.load(data?.data)
        }
    }
}
