package com.jayden.cameramanager.feature.cameralist.di

import com.jayden.cameramanager.feature.cameralist.ui.CameraListViewModel
import org.koin.dsl.module
import org.koin.plugin.module.dsl.viewModel

object CameraListModule {
    val cameraListModule = module {
        viewModel<CameraListViewModel>()
    }
}