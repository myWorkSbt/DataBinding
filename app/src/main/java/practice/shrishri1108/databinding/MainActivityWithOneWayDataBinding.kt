package practice.shrishri1108.databinding

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import practice.shrishri1108.databinding.databinding.ActivityMainBinding
import practice.shrishri1108.databinding.viewModel.MainViewModel

class MainActivityWithOneWayDataBinding : AppCompatActivity() {
     lateinit var mainViewModel: MainViewModel
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)



        binding.lifecycleOwner = this

        binding.mainViewModel = mainViewModel


    }

    fun gotToViewTwoWayBindingEffects(view: View) {
        startActivity(Intent(this , HomeActivityWithTwoWayDataBinding ::class.java ))

    }


}