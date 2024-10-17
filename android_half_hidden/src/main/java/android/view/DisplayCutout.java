package android.view;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fatter on 2024/10/17
 */
public final class DisplayCutout {
    @SuppressWarnings("ParcelCreator")
    public static final class ParcelableWrapper implements Parcelable {

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {

        }
    }
}
