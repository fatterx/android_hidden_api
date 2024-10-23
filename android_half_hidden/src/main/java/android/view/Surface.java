package android.view;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fatter on 2024/10/21
 */
public class Surface implements Parcelable {
    public Surface() {

    }

    public long getNextFrameNumber() {
        return 0L;
    }

    public boolean isValid() {
        return false;
    }

    public void release() {

    }

    protected Surface(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Surface> CREATOR = new Creator<Surface>() {
        @Override
        public Surface createFromParcel(Parcel in) {
            return new Surface(in);
        }

        @Override
        public Surface[] newArray(int size) {
            return new Surface[size];
        }
    };
}
