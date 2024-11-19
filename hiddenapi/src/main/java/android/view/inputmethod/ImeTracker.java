package android.view.inputmethod;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by weining.liu on 2024/11/19
 */
public interface ImeTracker {

    final class Token implements Parcelable {

        public Token(IBinder binder, String tag) {
        }

        private Token(Parcel in) {
        }

        public static final Creator<Token> CREATOR = new Creator<Token>() {
            @Override
            public Token createFromParcel(Parcel in) {
                return new Token(in);
            }

            @Override
            public Token[] newArray(int size) {
                return new Token[size];
            }
        };

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
        }
    }
}
