package com.jayden.cameramanager.feature.cameralist.domain.capabilities

import android.os.Build
import androidx.annotation.RequiresApi

enum class AberrationMode {
    OFF,
    FAST,
    HIGH_QUALITY
}

@RequiresApi(api = Build.VERSION_CODES.BAKLAVA)
enum class ColorCorrectionMode {
    TRANSFORM_MATRIX,
    FAST,
    HIGH_QUALITY,
}

data class CameraColorCorrectionCapabilities(
    val availableAberrationModes: List<AberrationMode>,
    @RequiresApi(api = Build.VERSION_CODES.BAKLAVA)
    val availableColorCorrectionModes: List<ColorCorrectionMode>? = null,
    @RequiresApi(api = Build.VERSION_CODES.BAKLAVA)
    val supportedColorTemperatureRange: IntRange? = null,
)