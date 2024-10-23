package android.view;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.util.MergedConfiguration;
import android.window.ClientWindowFrames;
import android.graphics.Rect;
import android.graphics.Point;

import com.android.internal.os.IResultReceiver;

/**
 * Created by fatter on 2024/10/17
 */
public interface IWindow extends IInterface {

    /**
     * Android 14
     */
    
    void executeCommand(String command, String parameters, ParcelFileDescriptor descriptor);
    void resized(ClientWindowFrames frames, boolean reportDraw,
                 MergedConfiguration newMergedConfiguration, InsetsState insetsState,
                 boolean forceLayout, boolean alwaysConsumeSystemBars, int displayId,
                 int syncSeqId, boolean dragResizing);
    void insetsControlChanged(InsetsState insetsState, InsetsSourceControl[] activeControls);
    void showInsets(int types, boolean fromIme);
    void hideInsets(int types, boolean fromIme);
    void moved(int newX, int newY);
    void dispatchAppVisibility(boolean visible);
    void dispatchGetNewSurface();
    void closeSystemDialogs(String reason);
    void dispatchWallpaperOffsets(float x, float y, float xStep, float yStep, float zoom, boolean sync);
    void dispatchWallpaperCommand(String action, int x, int y,
                                  int z, Bundle extras, boolean sync);
    void dispatchDragEvent(DragEvent event);
    void updatePointerIcon(float x, float y);
    void dispatchWindowShown();
    void requestAppKeyboardShortcuts(IResultReceiver receiver, int deviceId);
    void requestScrollCapture(IScrollCaptureResponseListener callbacks);

    /**
     * Android 13
     */
    void resized(ClientWindowFrames frames, boolean reportDraw,
                 MergedConfiguration newMergedConfiguration, InsetsState insetsState,
                 boolean forceLayout, boolean alwaysConsumeSystemBars, int displayId,
                 int syncSeqId, int resizeMode);

    /**
     * Android 12
     */
    void resized(ClientWindowFrames frames, boolean reportDraw,
                 MergedConfiguration newMergedConfiguration,
                 boolean forceLayout, boolean alwaysConsumeSystemBars, int displayId);

    void insetsChanged(InsetsState insetsState, boolean willMove, boolean willResize);

    void insetsControlChanged(InsetsState insetsState, InsetsSourceControl[] activeControls,
                              boolean willMove, boolean willResize);


    /**
     * Android 11
     */
    void resized(Rect frame, Rect contentInsets,
                 Rect visibleInsets, Rect stableInsets, boolean reportDraw,
                 MergedConfiguration newMergedConfiguration, Rect backDropFrame,
                 boolean forceLayout, boolean alwaysConsumeSystemBars, int displayId,
                 DisplayCutout.ParcelableWrapper displayCutout);
    void locationInParentDisplayChanged(Point offset);
    void insetsChanged(InsetsState insetsState);
    void windowFocusChanged(boolean hasFocus, boolean inTouchMode);
    void dispatchSystemUiVisibilityChanged(int seq, int globalVisibility,
                                           int localValue, int localChanges);
    void dispatchPointerCaptureChanged(boolean hasCapture);
    void requestScrollCapture(IScrollCaptureController controller);


    /**
     * Android 10
     */

    void resized(Rect frame, Rect overscanInsets, Rect contentInsets,
                 Rect visibleInsets, Rect stableInsets, Rect outsets, boolean reportDraw,
                 MergedConfiguration newMergedConfiguration, Rect backDropFrame,
                 boolean forceLayout, boolean alwaysConsumeSystemBars, int displayId,
                 DisplayCutout.ParcelableWrapper displayCutout);

    void dispatchWallpaperOffsets(float x, float y, float xStep, float yStep, boolean sync);


    /**
     * Android 9
     */



    public static abstract class Stub extends Binder implements IWindow {
        public static IWindow asInterface(IBinder obj) {
            return null;
        }

        @Override
        public IBinder asBinder() {
            return this;
        }
    }
}
