package android.view;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fatter on 2024/10/17
 */
public class InsetsState implements Parcelable {
    public InsetsState() {

    }

    protected InsetsState(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<InsetsState> CREATOR = new Creator<InsetsState>() {
        @Override
        public InsetsState createFromParcel(Parcel in) {
            return new InsetsState(in);
        }

        @Override
        public InsetsState[] newArray(int size) {
            return new InsetsState[size];
        }
    };
}
