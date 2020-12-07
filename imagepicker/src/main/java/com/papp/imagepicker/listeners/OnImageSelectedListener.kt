package com.papp.imagepicker.listeners

import com.papp.imagepicker.model.Image

interface OnImageSelectedListener {
    fun onSelectionUpdate(selectedImage: List<Image?>?)
}