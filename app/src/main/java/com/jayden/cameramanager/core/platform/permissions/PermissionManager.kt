package com.jayden.cameramanager.core.platform.permissions

import android.content.Context
import android.content.pm.PackageManager

class PermissionManager(val context: Context) {
    fun checkPermissionGrantState(permission: String): PermissionGrantState {
        return if (context.checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED) {
            PermissionGrantState.GRANTED
        } else PermissionGrantState.DENIED
    }
}

enum class PermissionGrantState {
    GRANTED,
    DENIED
}