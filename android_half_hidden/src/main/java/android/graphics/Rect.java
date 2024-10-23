package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fatter on 2024/10/21
 */
public final class Rect implements Parcelable {
    public Rect() {

    }

    protected Rect(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Rect> CREATOR = new Creator<Rect>() {
        @Override
        public Rect createFromParcel(Parcel in) {
            return new Rect(in);
        }

        @Override
        public Rect[] newArray(int size) {
            return new Rect[size];
        }
    };
}
