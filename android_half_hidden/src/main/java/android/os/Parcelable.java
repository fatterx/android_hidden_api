package android.os;

/**
 * Created by fatter on 2024/10/17
 */
public interface Parcelable {
    public int describeContents();

    public void writeToParcel(Parcel dest, int flags);

    public interface Creator<T> {

        public T createFromParcel(Parcel source);


        public T[] newArray(int size);
    }

    public interface ClassLoaderCreator<T> extends Creator<T> {

        public T createFromParcel(Parcel source, ClassLoader loader);
    }
}
