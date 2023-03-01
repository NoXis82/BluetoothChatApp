package ru.umarsh.bluetoothchatapp.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import ru.umarsh.bluetoothchatapp.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDevicesDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        macAddress = address
    )
}