package android.os;

/**
 * Created by fatter on 2024/10/17
 */
@SuppressWarnings("ParcelCreator")
public final class UserHandle implements Parcelable {
    public static int myUserId() {
        return 0;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
