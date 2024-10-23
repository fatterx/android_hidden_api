package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fatter on 2024/10/21
 */
public final class Insets implements Parcelable {
    public static final Insets NONE = new Insets(0, 0, 0, 0);

    private Insets(int left, int top, int right, int bottom) {

    }

    protected Insets(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Insets> CREATOR = new Creator<Insets>() {
        @Override
        public Insets createFromParcel(Parcel in) {
            return new Insets(in);
        }

        @Override
        public Insets[] newArray(int size) {
            return new Insets[size];
        }
    };
}
