package thebotbox.push.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Barry Allen .
 * boxforbot@gmail.com
 */

public class Push {
    @SerializedName("type")
    @Expose
    public String type;

    @SerializedName("src")
    @Expose
    public String src;

    @SerializedName("click")
    @Expose
    public String click;

}
