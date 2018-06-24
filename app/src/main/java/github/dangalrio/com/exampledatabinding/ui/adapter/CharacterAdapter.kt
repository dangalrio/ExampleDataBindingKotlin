package github.dangalrio.com.exampledatabinding.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import github.dangalrio.com.exampledatabinding.databinding.RowCharacterBinding
import github.dangalrio.com.exampledatabinding.model.WorldOfWarcraftModel

class CharacterAdapter (var items: List<WorldOfWarcraftModel>,
                        var listener: (character: WorldOfWarcraftModel) -> Unit) :
        RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding = RowCharacterBinding.inflate(layoutInflater, parent, false)
        return  CharacterViewHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val currentCharacter = items[position]
        holder.bind(currentCharacter)
        holder.itemView.setOnClickListener{
            listener.invoke(currentCharacter)
        }
    }

    class CharacterViewHolder (private var binding: RowCharacterBinding) :
            RecyclerView.ViewHolder(binding.root) {

        fun bind(worldOfWarcraftModel: WorldOfWarcraftModel) {
            binding.character = worldOfWarcraftModel
            binding.executePendingBindings()
        }

    }
}