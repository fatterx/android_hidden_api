package android.view;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by fatter on 2024/10/21
 */
public final class SurfaceControl implements Parcelable {
    public SurfaceControl() {

    }

    public void release() {

    }

    protected SurfaceControl(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<SurfaceControl> CREATOR = new Creator<SurfaceControl>() {
        @Override
        public SurfaceControl createFromParcel(Parcel in) {
            return new SurfaceControl(in);
        }

        @Override
        public SurfaceControl[] newArray(int size) {
            return new SurfaceControl[size];
        }
    };

    public static class Transaction implements Closeable, Parcelable {
        public Transaction() {

        }

        protected Transaction(Parcel in) {
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public static final Creator<Transaction> CREATOR = new Creator<Transaction>() {
            @Override
            public Transaction createFromParcel(Parcel in) {
                return new Transaction(in);
            }

            @Override
            public Transaction[] newArray(int size) {
                return new Transaction[size];
            }
        };

        @Override
        public void close() throws IOException {

        }
    }
}
