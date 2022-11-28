package com.example.comgongfriend.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.comgongfriend.R
import com.example.comgongfriend.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var bind: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        return bind.root
    }
}