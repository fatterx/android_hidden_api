package android.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;


/**
 * Created by fatter on 2024/10/17
 */
public final class DisplayCutout {
    private static final Rect ZERO_RECT = new Rect();
    public static final DisplayCutout NO_CUTOUT = new DisplayCutout(
            ZERO_RECT, Insets.NONE, ZERO_RECT, ZERO_RECT, ZERO_RECT, ZERO_RECT,
            false /* copyArguments */);

    private DisplayCutout(Rect safeInsets, Insets waterfallInsets, Rect boundLeft, Rect boundTop,
                          Rect boundRight, Rect boundBottom,
                          boolean copyArguments){

    }

    @SuppressWarnings("ParcelCreator")
    public static final class ParcelableWrapper implements Parcelable {
        public ParcelableWrapper() {
            this(NO_CUTOUT);
        }

        public ParcelableWrapper(DisplayCutout cutout) {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {

        }
    }
}
