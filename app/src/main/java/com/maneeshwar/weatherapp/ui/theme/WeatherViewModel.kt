package com.maneeshwar.weatherapp.api

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.maneeshwar.weatherapp.api.RetrofitInstance.weatherApi
import kotlinx.coroutines.launch

class WeatherViewModel:ViewModel() {
     val _weatherResult= MutableLiveData<NetworkResponse<WeatherModel>>()
    val weatherResult : LiveData<NetworkResponse<WeatherModel>> = _weatherResult

    fun getData(city: String) {

        fun getData(city: String) {
            viewModelScope.launch {
                try{
                    val response = weatherApi.getWeather(Constant.apikey, city)
                    if (response.isSuccessful) {
                        response.body()?.let {
                            _weatherResult.value = NetworkResponse.Success(it)
                        }
                    } else {
                        _weatherResult.value = NetworkResponse.Error("Failed to load data")
                    }
                } catch (e : Exception){
                    _weatherResult.value = NetworkResponse.Error("Failed to load data")
                }



            }
        }
    }
}
