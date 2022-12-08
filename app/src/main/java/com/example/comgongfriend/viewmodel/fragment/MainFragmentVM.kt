package com.example.comgongfriend.viewmodel.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.comgongfriend.data.model.BannerItem

class MainFragmentVM: ViewModel() {
    private val data = arrayListOf<BannerItem>()
    val bannerLiveData = MutableLiveData<List<BannerItem>>()

    fun addBanner(bannerItem: BannerItem) {
        data.add(bannerItem)
        bannerLiveData.value = data
    }
}