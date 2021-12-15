package com.example.hfreremastered.fragment

import android.app.Dialog
import android.content.Context
import android.content.*
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.example.hfreremastered.R
import com.example.hfreremastered.adat.noteDB
import com.example.hfreremastered.databinding.SavingNoteBinding



class SavingDialogFragment : DialogFragment() {
    interface SavingNoteDialogListener {
        fun onShoppingItemCreated(newItem: noteDB)
    }

    private lateinit var listener: SavingNoteDialogListener

    private lateinit var binding: SavingNoteBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as? SavingNoteDialogListener
            ?: throw RuntimeException("Valami nem jo: dialogfragment, onAttach")
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = SavingNoteBinding.inflate(LayoutInflater.from(context))
        binding.spCategory.adapter = ArrayAdapter(
            requireContext(),
            R.layout.support_simple_spinner_dropdown_item,
            resources.getStringArray(R.array.category_items)
        )

        return AlertDialog.Builder(requireContext())
            .setTitle(R.string.new_shopping_item)
            .setView(binding.root)
            .setPositiveButton(R.string.button_ok) { dialogInterface, i ->
                // TODO implement item creation
            }
            .setNegativeButton(R.string.button_cancel, null)
            .create()
    }

    companion object {
        const val TAG = "Jegyzet mentése"
    }
}