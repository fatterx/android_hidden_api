package android.view;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fatter on 2024/10/17
 */
public class InsetsVisibilities implements Parcelable {
    public InsetsVisibilities() {

    }

    protected InsetsVisibilities(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<InsetsVisibilities> CREATOR = new Creator<InsetsVisibilities>() {
        @Override
        public InsetsVisibilities createFromParcel(Parcel in) {
            return new InsetsVisibilities(in);
        }

        @Override
        public InsetsVisibilities[] newArray(int size) {
            return new InsetsVisibilities[size];
        }
    };
}
