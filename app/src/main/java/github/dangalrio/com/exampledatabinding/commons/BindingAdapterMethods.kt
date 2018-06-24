package github.dangalrio.com.exampledatabinding.commons

import android.databinding.BindingAdapter
import android.view.View
import android.widget.ImageView
import github.dangalrio.com.exampledatabinding.extension.loadImage
import github.dangalrio.com.exampledatabinding.extension.transparentBackground

@BindingAdapter("imageUrl")
fun loadImage(view: ImageView, url: String) = view.loadImage(url)

@BindingAdapter("transparentBackground")
fun transparentBackground(view: View, id: Int) = view.transparentBackground(id)