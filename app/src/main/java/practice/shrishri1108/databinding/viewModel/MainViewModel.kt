package practice.shrishri1108.databinding.viewModel

import android.content.Intent
import androidx.core.content.ContextCompat
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import practice.shrishri1108.databinding.HomeActivityWithTwoWayDataBinding
import practice.shrishri1108.databinding.model.MainActDataModels
import kotlin.coroutines.coroutineContext

class MainViewModel : ViewModel() {
    private var  mainMutLiveData = MutableLiveData<MainActDataModels>(MainActDataModels( "\" This is Mutable live data " ))
    var mainViewLiveData = mainMutLiveData


    fun updateMutLiveData() {
        mainMutLiveData.value = MainActDataModels( "This  is updated Mutable Live Data " )
    }

}

class HomeViewModel :ViewModel() {
    private var homeLiveDatas = MutableLiveData<String> ( " This is Home Mutable Live Dta  ")
   var homeViewLiveData  = homeLiveDatas

    fun  updateHomeMutLiveData () {
        homeViewLiveData.value = " This is updated Home View Live Data.     "
    }
}