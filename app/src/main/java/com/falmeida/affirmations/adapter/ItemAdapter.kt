package com.falmeida.affirmations.adapter

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.falmeida.affirmations.R
import com.falmeida.affirmations.model.Affirmation

class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }
}