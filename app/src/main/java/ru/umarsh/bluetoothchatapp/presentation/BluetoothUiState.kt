package ru.umarsh.bluetoothchatapp.presentation

import ru.umarsh.bluetoothchatapp.domain.chat.BluetoothDevice

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
)
