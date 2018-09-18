package thebotbox.push.factory;

import android.content.Context;

import thebotbox.push.response.Push;

/**
 * Created by Barry Allen .
 * boxforbot@gmail.com
 */

public interface PushType {
    String PUSH_TYPE_1 = "_type_1";
    String PUSH_TYPE_2 = "_type_2";
    String PUSH_TYPE_3 = "_type_3";
    String PUSH_TYPE_4 = "_type_4";

    void generatePush(Context c, Push push);
}
