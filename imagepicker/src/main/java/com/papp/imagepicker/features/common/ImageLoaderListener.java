package com.papp.imagepicker.features.common;

import com.papp.imagepicker.model.Folder;
import com.papp.imagepicker.model.Image;

import java.util.List;

public interface ImageLoaderListener {
    void onImageLoaded(List<Image> images, List<Folder> folders);
    void onFailed(Throwable throwable);
}
