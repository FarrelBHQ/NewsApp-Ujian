package com.example.ujianapp.adapter.news

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ujianapp.data.model.Data
import com.example.ujianapp.data.model.PostsItem
import com.example.ujianapp.databinding.RowItemNewsBinding
import com.squareup.picasso.Picasso
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class NewsAdapter: RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {

    private val listNews =ArrayList<Data>()
    private val listPost = ArrayList<PostsItem>()

    fun setData(list: Data?) {
        listNews.clear()
        if (list != null) {
            listNews.addAll(listOf(list))
        }
        notifyItemRangeChanged(0, listNews.size)
    }

    class MyViewHolder (val binding: RowItemNewsBinding):
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(RowItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun getItemCount(): Int = listNews.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val dataNews = listNews[position]
        val dataPost = listPost[position]

        val dateTimeString = dataPost.pubDate
        val dateTimeFormat = SimpleDateFormat("yyy-mm-hh'T'HH:mm:ss'Z'", Locale.getDefault())
        val date = dateTimeFormat.parse(dateTimeString)
        val dateFormat = SimpleDateFormat("EEE, dd MMM | HH:mm", Locale.getDefault())

        val myDate = date?.let { dateFormat.format(it) }

        holder.binding.apply {
            tvTitle.text = dataNews.title
            tvDate.text = myDate

            Picasso.get()
                .load(dataNews.image)
                .fit()
                .centerInside()
                .into(imgNews)


        }
    }



}