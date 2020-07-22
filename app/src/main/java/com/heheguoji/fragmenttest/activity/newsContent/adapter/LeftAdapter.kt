package com.heheguoji.fragmenttest.activity.newsContent.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.heheguoji.fragmenttest.R
import com.heheguoji.fragmenttest.activity.newsContent.bean.News

class LeftAdapter(private val list: List<News>) : RecyclerView.Adapter<LeftAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle: TextView = view.findViewById(R.id.tv_left_title)
        val viewLine: View = view.findViewById(R.id.view_left_line)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.left_item, parent, false)
        val viewHolder = ViewHolder(view)
        return viewHolder
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val news = list[position]
        holder.tvTitle.text=news.title

    }
}