package com.papp.imagepicker.features.camera;

import com.papp.imagepicker.model.Image;

import java.util.List;

public interface OnImageReadyListener {
    void onImageReady(List<Image> image);
}
