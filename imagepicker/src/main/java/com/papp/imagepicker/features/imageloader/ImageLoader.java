package com.papp.imagepicker.features.imageloader;

import android.widget.ImageView;

import com.papp.imagepicker.model.Image;

public interface ImageLoader {
    void loadImage(Image image, ImageView imageView, ImageType imageType);
}
