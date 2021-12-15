package com.example.hfreremastered.rv_adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hfreremastered.MainActivity
import com.example.hfreremastered.adat.NoteDatas
import com.example.hfreremastered.adat.noteDB
import com.example.hfreremastered.databinding.NoteViewBinding

class Adapter(private val listener: MainActivity) :
    RecyclerView.Adapter<Adapter.NoteViewHolder>() {

    private val items = mutableListOf<NoteDatas>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = NoteViewHolder(
        NoteViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val noteDB = items[position]

       /* holder.binding.ivIcon.setImageResource(getImageResource(shoppingItem.category))
        holder.binding.cbIsBought.isChecked = shoppingItem.isBought
        holder.binding.tvName.text = shoppingItem.name
        holder.binding.tvDescription.text = shoppingItem.description
        holder.binding.tvCategory.text = shoppingItem.category.name
        holder.binding.tvPrice.text = "${shoppingItem.estimatedPrice} Ft"

        holder.binding.cbIsBought.setOnCheckedChangeListener { buttonView, isChecked ->
            shoppingItem.isBought = isChecked
            listener.onItemChanged(shoppingItem)
        }
*/
    }

    override fun getItemCount(): Int = items.size

    interface NoteClickListener {
        fun onItemChanged(item: noteDB)
    }

    fun addItem(item: noteDB) {
        items.add(item)
        notifyItemInserted(items.size - 1)
    }

    fun update(shoppingItems: List<NoteDatas>) {
        items.clear()
        items.addAll( )
        notifyDataSetChanged()
    }

    inner class NoteViewHolder(val binding: NoteViewBinding) : RecyclerView.ViewHolder(binding.root)
}

