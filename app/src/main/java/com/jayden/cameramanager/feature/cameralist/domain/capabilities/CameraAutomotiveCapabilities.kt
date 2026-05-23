package com.jayden.cameramanager.feature.cameralist.domain.capabilities

enum class AutomotiveLensDirection {
    EXTERIOR_OTHER,
    EXTERIOR_FRONT,
    EXTERIOR_REAR,
    EXTERIOR_LEFT,
    EXTERIOR_RIGHT,
    INTERIOR_OTHER,
    INTERIOR_SEAT_ROW_1_LEFT,
    INTERIOR_SEAT_ROW_1_CENTER,
    INTERIOR_SEAT_ROW_1_RIGHT,
    INTERIOR_SEAT_ROW_2_LEFT,
    INTERIOR_SEAT_ROW_2_CENTER,
    INTERIOR_SEAT_ROW_2_RIGHT,
    INTERIOR_SEAT_ROW_3_LEFT,
    INTERIOR_SEAT_ROW_3_CENTER,
    INTERIOR_SEAT_ROW_3_RIGHT,
}

enum class AutomotiveLocation {
    INTERIOR,
    EXTERIOR_OTHER,
    EXTERIOR_FRONT,
    EXTERIOR_REAR,
    EXTERIOR_LEFT,
    EXTERIOR_RIGHT,
    EXTRA_OTHER,
    EXTRA_FRONT,
    EXTRA_REAR,
    EXTRA_LEFT,
    EXTRA_RIGHT,
}

data class CameraAutomotiveCapabilities(
    val automotiveLensDirection: AutomotiveLensDirection? = null,
    val automotiveLocation: AutomotiveLocation? = null,
)