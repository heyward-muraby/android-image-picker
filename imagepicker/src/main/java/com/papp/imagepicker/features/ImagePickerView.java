package com.papp.imagepicker.features;

import com.papp.imagepicker.features.common.MvpView;
import com.papp.imagepicker.model.Folder;
import com.papp.imagepicker.model.Image;

import java.util.List;

public interface ImagePickerView extends MvpView {
    void showLoading(boolean isLoading);
    void showFetchCompleted(List<Image> images, List<Folder> folders);
    void showError(Throwable throwable);
    void showEmpty();
    void showCapturedImage();
    void finishPickImages(List<Image> images);
}
