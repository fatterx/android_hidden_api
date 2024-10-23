package com.android.internal.os;

import android.os.Bundle;
import android.os.IInterface;

/**
 * Created by fatter on 2024/10/22
 */
public interface IResultReceiver extends IInterface {
    void send(int resultCode, Bundle resultData);
}
