package br.edu.ifsp.scl.prdm.sc3029531.navigationintent

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel(val savedStateHandle: SavedStateHandle): ViewModel() {

    //depende do Compose pq a função mutableStateOf é do COmpose
//    var parameter by mutableStateOf("")
//    private set

    private companion object {
        const val PARAMETER_KEY = "parameter_key"
    }

    private val _parameterState = MutableStateFlow(savedStateHandle[PARAMETER_KEY] ?: "")
    val parameterState: StateFlow<String> = _parameterState.asStateFlow()

    //para alterar valor do parameter
    fun updateParameter(value: String) {
        _parameterState.value = value
        savedStateHandle[PARAMETER_KEY] = value
//        parameter = value
    }

}