package com.smsrn.composepractice.ui.main

import androidx.lifecycle.ViewModel
import com.smsrn.composepractice.repository.PersonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    personRepository: PersonRepository
) : ViewModel() {
    val readAll = personRepository.readAll
}