package org.example.koala.di

import org.example.koala.service.ApiService
import org.example.koala.service.ApiServiceImpl
import org.example.koala.service.createHttpClient
import org.example.koala.viewModels.HomePageViewModel
import org.koin.compose.viewmodel.dsl.viewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val ktorModule = module {
    single { createHttpClient() }
    single<ApiService> { ApiServiceImpl(get()) }
    viewModelOf(::HomePageViewModel)

}