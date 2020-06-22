package app.nickname.myoji.bughouse.launcher

import android.content.Context
import android.content.res.Resources
import android.os.Build
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import app.nickname.myoji.bughouse.R

class LauncherCellView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(context, attrs, defStyleAttr) {
    private val view: View = LayoutInflater.from(context).inflate(R.layout.view_launcher_cell, this, true)
    private val titleText: TextView = view.findViewById(R.id.title)
    private val descriptionText: TextView = view.findViewById(R.id.description)

    private val Int.dp
        get() = this * Resources.getSystem().displayMetrics.density.toInt()

    init {
        context.obtainStyledAttributes(attrs, R.styleable.LauncherCellView, defStyleAttr, 0).apply {
            titleText.text = getString(R.styleable.LauncherCellView_title)
            descriptionText.text = getString(R.styleable.LauncherCellView_description)
            recycle()
        }
        setBackgroundColor(ContextCompat.getColor(context, android.R.color.white))
        val outValue = TypedValue()
        context.theme.resolveAttribute(android.R.attr.selectableItemBackground, outValue, true)

        val selectableItemBackground = ContextCompat.getDrawable(context, outValue.resourceId)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            foreground = selectableItemBackground
        } else {
            background = selectableItemBackground
        }
        minHeight = 72.dp
    }
}
