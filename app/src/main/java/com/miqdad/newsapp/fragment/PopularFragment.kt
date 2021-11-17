package com.miqdad.newsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.miqdad.newsapp.adapter.NewsAdapter
import com.miqdad.newsapp.bindNewsHeadline
import com.miqdad.newsapp.data.DataNews
import com.miqdad.newsapp.databinding.FragmentPopular3Binding

class PopularFragment : Fragment() {

    lateinit var binding: FragmentPopular3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentPopular3Binding.inflate(inflater, container, false)

        binding.rvPopularNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataPopularNews)
        }

//        binding.newsHeadline.apply {
//            imgHeadline.setImageResource(DataNews.photoHeadline[1])
//            tvTitleHeadline.text = DataNews.titleHeadline[1]
//            tvDescHeadline.text = DataNews.contentHeadline[1]
//            tvDateHeadline.text = DataNews.dateHeadline[1]
//            tvAuthorHeadline.text = DataNews.authorHeadline[1]
//        }

        bindNewsHeadline(binding.newsHeadline, 1)

        return binding.root
    }

}