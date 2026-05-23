package com.jayden.cameramanager.feature.cameralist.data

import android.content.Context
import android.hardware.camera2.CameraManager

class CameraDetailsObtainer(
    val context: Context
) {
    val manager = context.getSystemService(CameraManager::class.java)


}