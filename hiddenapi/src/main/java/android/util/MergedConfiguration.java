package android.util;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fatter on 2024/10/17
 */
public class MergedConfiguration implements Parcelable {
    protected MergedConfiguration(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<MergedConfiguration> CREATOR = new Creator<MergedConfiguration>() {
        @Override
        public MergedConfiguration createFromParcel(Parcel in) {
            return new MergedConfiguration(in);
        }

        @Override
        public MergedConfiguration[] newArray(int size) {
            return new MergedConfiguration[size];
        }
    };
}
