package android.window;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fatter on 2024/10/17
 */
public class ClientWindowFrames implements Parcelable {
    public ClientWindowFrames() {
    }

    protected ClientWindowFrames(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ClientWindowFrames> CREATOR = new Creator<ClientWindowFrames>() {
        @Override
        public ClientWindowFrames createFromParcel(Parcel in) {
            return new ClientWindowFrames(in);
        }

        @Override
        public ClientWindowFrames[] newArray(int size) {
            return new ClientWindowFrames[size];
        }
    };
}
