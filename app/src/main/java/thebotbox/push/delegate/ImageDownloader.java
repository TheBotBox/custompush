package thebotbox.push.delegate;

import android.graphics.Bitmap;

import java.util.Map;

/**
 * Created by Barry Allen .
 * boxforbot@gmail.com
 */


public interface ImageDownloader {

    void onImageDownload(Map<String, Bitmap> mMap);
}
