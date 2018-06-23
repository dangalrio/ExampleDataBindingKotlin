package github.dangalrio.com.exampledatabinding.commons

import android.databinding.BindingAdapter
import android.widget.ImageView
import github.dangalrio.com.exampledatabinding.extension.loadImage

@BindingAdapter("imageUrl")
fun loadImage(view: ImageView, url: String) = view.loadImage(url)