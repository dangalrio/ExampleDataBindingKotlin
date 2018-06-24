package github.dangalrio.com.exampledatabinding.extension

import android.support.annotation.IdRes
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.ImageView
import com.squareup.picasso.Picasso
import github.dangalrio.com.exampledatabinding.R

fun <T : View> View.bindView(@IdRes res: Int): Lazy<T> {
    return lazy(LazyThreadSafetyMode.NONE){ findViewById<T>(res) }
}

fun <T : View> View.bindViews(@IdRes resources: Array<Int>): List<Lazy<T>> {
    return resources.map { bindView<T>(it) }.toList()
}

fun ImageView.loadImage(url: String) {
    Picasso.get().load(url).into(this)
}

fun View.transparentBackground(idCharacter : Int) {
    when (idCharacter) {
        1 -> background = ContextCompat.getDrawable(context, R.color.colorArthas)
        2 -> background = ContextCompat.getDrawable(context, R.color.colorIllidan)
        3 -> background = ContextCompat.getDrawable(context, R.color.colorVarian)
        4 -> background = ContextCompat.getDrawable(context, R.color.colorSylcanas)
        5 -> background = ContextCompat.getDrawable(context, R.color.colorGuldan)
        else -> ContextCompat.getDrawable(context, R.color.colorArthas)
    }
}