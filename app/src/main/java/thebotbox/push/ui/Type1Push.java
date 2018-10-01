package thebotbox.push.ui;

import android.content.Context;
import android.graphics.Bitmap;

import thebotbox.push.delegate.FetchImage;
import thebotbox.push.factory.PushType;
import thebotbox.push.response.Push;

/**
 * Created by Barry Allen .
 * boxforbot@gmail.com
 */

public class Type1Push implements PushType {
    private Push push;
    private Context context;

    @Override
    public void generatePush(Context c, Push push) {
        if (push == null)
            return;

        if (!push.src.equalsIgnoreCase("NA")) {
            new FetchImage(c, push.src, mMap -> createNotification(mMap.get(this.push.src), this.push)).startDownload();
        }
    }

    private void createNotification(Bitmap bitmap, Push push) {

    }
}
