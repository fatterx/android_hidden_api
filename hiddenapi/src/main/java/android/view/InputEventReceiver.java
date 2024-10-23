package android.view;

import android.os.IBinder;
import android.os.Looper;

/**
 * Created by fatter on 2024/10/22
 */
public abstract class InputEventReceiver {
    public InputEventReceiver(InputChannel inputChannel, Looper looper) {

    }

    public void dispose() {
    }

    public void onInputEvent(InputEvent event) {
    }


    public void onFocusEvent(boolean hasFocus) {
    }

    public void onPointerCaptureEvent(boolean pointerCaptureEnabled) {
    }
    public void onDragEvent(boolean isExiting, float x, float y) {
    }

    public void onTouchModeChanged(boolean inTouchMode) {
    }

    public void onBatchedInputEventPending(int source) {
    }

    public final void reportTimeline(int inputEventId, long gpuCompletedTime, long presentTime) {
    }

    public final void finishInputEvent(InputEvent event, boolean handled) {

    }

    public final boolean consumeBatchedInputEvents(long frameTimeNanos) {
        return false;
    }

    public IBinder getToken() {

        return null;
    }

    public interface Factory {
        InputEventReceiver createInputEventReceiver(InputChannel inputChannel, Looper looper);
    }
}
