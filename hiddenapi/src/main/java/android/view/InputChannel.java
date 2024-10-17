package android.view;

import android.os.Parcel;
import android.os.Parcelable;


/**
 * Created by fatter on 2024/10/17
 */
public final class InputChannel implements Parcelable {

    public InputChannel() {

    }

    protected InputChannel(Parcel in) {
    }

    public static final Creator<InputChannel> CREATOR = new Creator<InputChannel>() {
        @Override
        public InputChannel createFromParcel(Parcel in) {
            return new InputChannel(in);
        }

        @Override
        public InputChannel[] newArray(int size) {
            return new InputChannel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
