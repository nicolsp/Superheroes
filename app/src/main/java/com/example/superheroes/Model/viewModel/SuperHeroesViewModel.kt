package com.example.superheroes.Model.viewModel

import androidx.lifecycle.ViewModel
import com.example.superheroes.Model.pojos.SuperHeroesRepository

class SuperHeroesViewModel: ViewModel() {

    private val mRepository : SuperHeroesRepository

    init {
        mRepository = SuperHeroesRepository()
    }


}