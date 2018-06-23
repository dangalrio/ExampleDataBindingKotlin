package github.dangalrio.com.exampledatabinding.ui.activity

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import github.dangalrio.com.exampledatabinding.R
import github.dangalrio.com.exampledatabinding.databinding.ActivityMainBinding
import github.dangalrio.com.exampledatabinding.extension.bindView
import github.dangalrio.com.exampledatabinding.ui.adapter.CharacterAdapter
import github.dangalrio.com.exampledatabinding.util.ModelUtil

class MainActivity : AppCompatActivity() {

    private val mCharacterList: Lazy<RecyclerView> = bindView(R.id.mainListCharacters)
    private var mDataList = ModelUtil.dummyCharacters()

    private fun initBinding() {
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,
                R.layout.activity_main)
        binding.dataList = mDataList
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBinding()
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val adapter = CharacterAdapter(mDataList)
        mCharacterList.value.adapter = adapter
    }


}
