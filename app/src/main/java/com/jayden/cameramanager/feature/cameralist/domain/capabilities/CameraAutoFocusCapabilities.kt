package com.jayden.cameramanager.feature.cameralist.domain.capabilities

enum class AutoFocusMode {
    OFF,
    AUTO,
    MACRO,
    CONTINUOUS_VIDEO,
    CONTINUOUS_PICTURE,
    EXTENDED_DEPTH_OF_FIELD,
}

data class CameraAutoFocusCapabilities(
    val availableModes: List<AutoFocusMode>
)