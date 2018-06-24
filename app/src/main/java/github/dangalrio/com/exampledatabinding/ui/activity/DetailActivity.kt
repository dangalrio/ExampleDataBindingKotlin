package github.dangalrio.com.exampledatabinding.ui.activity

import android.app.Activity
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import github.dangalrio.com.exampledatabinding.R
import github.dangalrio.com.exampledatabinding.databinding.ActivityDetailBinding
import github.dangalrio.com.exampledatabinding.model.WorldOfWarcraftModel

class DetailActivity : AppCompatActivity() {

    private var character: WorldOfWarcraftModel? = null

    companion object {
        const val EXTRA_DETAIL_CHARACTER = "EXTRA_DETAIL_CHARACTER"

        fun newInstance(context: Activity, character: WorldOfWarcraftModel) {
            val starter = Intent(context, DetailActivity::class.java)
            starter.putExtra(EXTRA_DETAIL_CHARACTER, character)
            context.startActivity(starter)
        }
    }

    private fun loadFromArguments() {
        character = intent?.getSerializableExtra(EXTRA_DETAIL_CHARACTER) as? WorldOfWarcraftModel
    }

    private fun initBinding(){
        val binding = DataBindingUtil.setContentView<ActivityDetailBinding>(this, R.layout.activity_detail)
        binding.character = character
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadFromArguments()
        initBinding()
    }
}