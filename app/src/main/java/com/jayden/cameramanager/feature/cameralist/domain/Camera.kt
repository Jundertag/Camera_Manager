package com.jayden.cameramanager.feature.cameralist.domain

import com.jayden.cameramanager.feature.cameralist.domain.capabilities.CameraAutomotiveCapabilities

data class Camera(
    val id: String,
    val capabilities: CameraAutomotiveCapabilities
)