package ru.umarsh.bluetoothchatapp.domain.chat

typealias BluetoothDeviceDomain = BluetoothDevice

data class BluetoothDevice(
    val name: String?,
    val macAddress: String
)
