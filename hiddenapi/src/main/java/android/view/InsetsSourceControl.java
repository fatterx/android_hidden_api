package android.view;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fatter on 2024/10/17
 */
public class InsetsSourceControl implements Parcelable{
    public static class Array implements Parcelable {
        public Array() {

        }

        protected Array(Parcel in) {
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public static final Creator<Array> CREATOR = new Creator<Array>() {
            @Override
            public Array createFromParcel(Parcel in) {
                return new Array(in);
            }

            @Override
            public Array[] newArray(int size) {
                return new Array[size];
            }
        };
    }

    protected InsetsSourceControl(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<InsetsSourceControl> CREATOR = new Creator<InsetsSourceControl>() {
        @Override
        public InsetsSourceControl createFromParcel(Parcel in) {
            return new InsetsSourceControl(in);
        }

        @Override
        public InsetsSourceControl[] newArray(int size) {
            return new InsetsSourceControl[size];
        }
    };
}
