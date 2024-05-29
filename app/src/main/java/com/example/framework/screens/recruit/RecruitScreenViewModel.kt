package com.example.framework.screens.recruit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.framework.data.CharacterDataSource
import com.example.framework.data.CharacterModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class RecruitViewModel : ViewModel() {
    private val _characterList = MutableStateFlow<List<CharacterModel>>(emptyList())
    val characterList: StateFlow<List<CharacterModel>> get() = _characterList

    init {
        loadCharacters()
    }

    private fun loadCharacters() {
        viewModelScope.launch {
            val characters = CharacterDataSource().loadCharacters()
            _characterList.value = characters
        }
    }
}

class RecruitViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RecruitViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return RecruitViewModel() as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }
}
