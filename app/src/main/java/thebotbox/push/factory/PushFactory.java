package thebotbox.push.factory;

import thebotbox.push.response.Push;
import thebotbox.push.ui.Type1Push;
import thebotbox.push.ui.Type2Push;
import thebotbox.push.ui.Type3Push;
import thebotbox.push.ui.Type4Push;

import static thebotbox.push.factory.PushType.PUSH_TYPE_1;
import static thebotbox.push.factory.PushType.PUSH_TYPE_2;
import static thebotbox.push.factory.PushType.PUSH_TYPE_3;
import static thebotbox.push.factory.PushType.PUSH_TYPE_4;

/**
 * Created by Barry Allen .
 * boxforbot@gmail.com
 */

public class PushFactory {

    public PushType getPushType(Push push) {
        if (push == null)
            return null;

        if (push.type.equalsIgnoreCase(PUSH_TYPE_1))
            return new Type1Push();
        if (push.type.equalsIgnoreCase(PUSH_TYPE_2))
            return new Type2Push();
        if (push.type.equalsIgnoreCase(PUSH_TYPE_3))
            return new Type3Push();
        if (push.type.equalsIgnoreCase(PUSH_TYPE_4))
            return new Type4Push();
        return null;
    }

}
