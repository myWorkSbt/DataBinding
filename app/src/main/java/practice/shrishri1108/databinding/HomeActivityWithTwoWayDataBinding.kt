package practice.shrishri1108.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import practice.shrishri1108.databinding.databinding.ActivityHomeWithTwoWayDataBindingBinding
import practice.shrishri1108.databinding.viewModel.HomeViewModel

class HomeActivityWithTwoWayDataBinding : AppCompatActivity() {
    private lateinit var binding : ActivityHomeWithTwoWayDataBindingBinding
    lateinit var homeViewModel : HomeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = DataBindingUtil.setContentView(this , R.layout.activity_home_with_two_way_data_binding )
        homeViewModel = ViewModelProvider(this).get(HomeViewModel :: class.java)

        binding.lifecycleOwner = this
        binding.homeViewModel = homeViewModel
    }
}