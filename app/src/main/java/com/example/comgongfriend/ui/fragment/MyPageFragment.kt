package com.example.comgongfriend.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.comgongfriend.R
import com.example.comgongfriend.databinding.FragmentMyPageBinding

class MyPageFragment : Fragment() {

    private lateinit var bind:FragmentMyPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = DataBindingUtil.inflate(inflater, R.layout.fragment_my_page, container, false)
        return bind.root
    }
}