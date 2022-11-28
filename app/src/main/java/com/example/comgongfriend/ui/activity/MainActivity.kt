package com.example.comgongfriend.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import com.example.comgongfriend.R
import com.example.comgongfriend.databinding.ActivityMainBinding
import com.example.comgongfriend.databinding.FragmentMainBinding
import com.example.comgongfriend.ui.fragment.MainFragment
import com.example.comgongfriend.ui.fragment.MyPageFragment
import com.example.comgongfriend.ui.fragment.SavedPageFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )

        setNavigationBar()
    }

    fun setNavigationBar() {
        binding.mainBottomNavigation.run {
            setOnItemSelectedListener { item ->
                when(item.itemId) {
                    R.id.home_page -> {
                        supportFragmentManager.beginTransaction().replace(binding.mainFragmentContainer.id, MainFragment()).commit()
                    }
                    R.id.saved_page -> {
                        supportFragmentManager.beginTransaction().replace(binding.mainFragmentContainer.id, SavedPageFragment()).commit()
                    }
                    R.id.my_page -> {
                        supportFragmentManager.beginTransaction().replace(binding.mainFragmentContainer.id, MyPageFragment()).commit()
                    }
                }
                true
            }
            selectedItemId = R.id.home_page
        }
    }
}