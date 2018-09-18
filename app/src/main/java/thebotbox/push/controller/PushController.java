package thebotbox.push.controller;

import android.content.Context;

import thebotbox.push.factory.PushFactory;
import thebotbox.push.response.Push;

/**
 * Created by Barry Allen .
 * boxforbot@gmail.com
 */

public class PushController {

    public PushController(Context context,Push push){
        new PushFactory().getPushType(push).generatePush(context,push);
    }
}
