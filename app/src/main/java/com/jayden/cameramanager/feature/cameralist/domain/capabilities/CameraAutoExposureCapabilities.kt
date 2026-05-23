package com.jayden.cameramanager.feature.cameralist.domain.capabilities

import android.os.Build
import android.util.Rational
import androidx.annotation.RequiresApi

enum class AutoExposureAntiBandingMode {
    OFF,
    HZ50,
    HZ60,
    AUTO
}

enum class AutoExposureMode {
    OFF,
    ON,
    ON_AUTO_FLASH,
    ON_ALWAYS_FLASH,
    ON_AUTO_FLASH_REDEYE,
    ON_EXTERNAL_FLASH,
    ON_LOW_LIGHT_BOOST_BRIGHTNESS_PRIORITY
}

enum class AutoExposurePriorityMode {
    OFF,
    SENSOR_SENSITIVITY_PRIORITY,
    SENSOR_EXPOSURE_TIME_PRIORITY
}

data class CameraAutoExposureCapabilities(
    val availableAntiBandingModes: List<AutoExposureAntiBandingMode>,
    val availableModes: List<AutoExposureMode>,
    @RequiresApi(api = Build.VERSION_CODES.BAKLAVA)
    val availablePriorityModes: List<AutoExposurePriorityMode>? = null,
    val availableTargetFpsRanges: List<IntRange>,
    val exposureCompensationRange: IntRange,
    val exposureCompensationStep: Rational,
    val isLockAvailable: Boolean,

)