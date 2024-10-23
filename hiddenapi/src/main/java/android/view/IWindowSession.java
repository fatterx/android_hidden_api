package android.view;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.MergedConfiguration;
import android.window.ClientWindowFrames;

/**
 * Created by fatter on 2024/10/17
 */
public interface IWindowSession extends IInterface {

    /**
     * Android 14
     */
    int addToDisplay(IWindow window, WindowManager.LayoutParams attrs,
                     int viewVisibility, int layerStackId, int requestedVisibleTypes,
                     InputChannel outInputChannel, InsetsState insetsState,
                     InsetsSourceControl.Array activeControls, Rect attachedFrame,
                     float[] sizeCompatScale);
    int addToDisplayAsUser(IWindow window, WindowManager.LayoutParams attrs,
                           int viewVisibility, int layerStackId, int userId, int requestedVisibleTypes,
                           InputChannel outInputChannel, InsetsState insetsState,
                           InsetsSourceControl.Array activeControls, Rect attachedFrame,
                           float[] sizeCompatScale);
    int relayout(IWindow window, WindowManager.LayoutParams attrs,
                 int requestedWidth, int requestedHeight, int viewVisibility,
                 int flags, int seq, int lastSyncSeqId, ClientWindowFrames outFrames,
                 MergedConfiguration outMergedConfiguration, SurfaceControl outSurfaceControl,
                 InsetsState insetsState, InsetsSourceControl.Array activeControls,
                 Bundle bundle);

    void relayoutAsync(IWindow window, WindowManager.LayoutParams attrs,
                       int requestedWidth, int requestedHeight, int viewVisibility, int flags, int seq,
                       int lastSyncSeqId);

    void finishDrawing(IWindow window, SurfaceControl.Transaction postDrawTransaction,
                       int seqId);

    void remove(IBinder clientToken);

    /**
     * Android 13
     */
    int addToDisplay(IWindow window, WindowManager.LayoutParams attrs,
                     int viewVisibility, int layerStackId, InsetsVisibilities requestedVisibilities,
                     InputChannel outInputChannel, InsetsState insetsState,
                     InsetsSourceControl[] activeControls, Rect attachedFrame,
                     float[] sizeCompatScale);
    int addToDisplayAsUser(IWindow window, WindowManager.LayoutParams attrs,
                           int viewVisibility, int layerStackId, int userId,
                           InsetsVisibilities requestedVisibilities, InputChannel outInputChannel,
                           InsetsState insetsState, InsetsSourceControl[] activeControls,
                           Rect attachedFrame, float[] sizeCompatScale);
    int addToDisplayAsUser(IWindow window, WindowManager.LayoutParams attrs,
                           int viewVisibility, int layerStackId, int userId,
                           InsetsVisibilities requestedVisibilities, InputChannel outInputChannel,
                           InsetsState insetsState, InsetsSourceControl[] activeControls);

    int relayout(IWindow window, WindowManager.LayoutParams attrs,
                 int requestedWidth, int requestedHeight, int viewVisibility,
                 int flags, int seq, int lastSyncSeqId, ClientWindowFrames outFrames,
                 MergedConfiguration outMergedConfiguration, SurfaceControl outSurfaceControl,
                 InsetsState insetsState, InsetsSourceControl[] activeControls,
                 Bundle bundle);
    int relayout(IWindow window, WindowManager.LayoutParams attrs,
                 int requestedWidth, int requestedHeight, int viewVisibility,
                 int flags, ClientWindowFrames outFrames,
                 MergedConfiguration outMergedConfiguration, SurfaceControl outSurfaceControl,
                 InsetsState insetsState, InsetsSourceControl[] activeControls,
                 Bundle bundle);

//    void finishDrawing(IWindow window, SurfaceControl.Transaction postDrawTransaction,
//                       int seqId);

    void remove(IWindow window);

    /**
     *  Android 12
     */
    int addToDisplay(IWindow window, WindowManager.LayoutParams attrs,
                     int viewVisibility, int layerStackId, InsetsState requestedVisibility,
                     InputChannel outInputChannel, InsetsState insetsState,
                     InsetsSourceControl[] activeControls);
    int addToDisplayAsUser(IWindow window, WindowManager.LayoutParams attrs,
                           int viewVisibility, int layerStackId, int userId,
                           InsetsState requestedVisibility, InputChannel outInputChannel,
                           InsetsState insetsState, InsetsSourceControl[] activeControls);

    int relayout(IWindow window, WindowManager.LayoutParams attrs,
                 int requestedWidth, int requestedHeight, int viewVisibility,
                 int flags, long frameNumber, ClientWindowFrames outFrames,
                 MergedConfiguration outMergedConfiguration, SurfaceControl outSurfaceControl,
                 InsetsState insetsState, InsetsSourceControl[] activeControls,
                 Point outSurfaceSize);

    void finishDrawing(IWindow window, SurfaceControl.Transaction postDrawTransaction);

//    void remove(IWindow window);

    /**
     * Android 11 R48
     */
    int addToDisplay(IWindow window, int seq, WindowManager.LayoutParams attrs,
                     int viewVisibility, int layerStackId, Rect outFrame,
                     Rect outContentInsets, Rect outStableInsets,
                     DisplayCutout.ParcelableWrapper displayCutout, InputChannel outInputChannel,
                     InsetsState insetsState, InsetsSourceControl[] activeControls);
    int addToDisplayAsUser(IWindow window, int seq, WindowManager.LayoutParams attrs,
                           int viewVisibility, int layerStackId, int userId,
                           Rect outFrame, Rect outContentInsets, Rect outStableInsets,
                           DisplayCutout.ParcelableWrapper displayCutout, InputChannel outInputChannel,
                           InsetsState insetsState, InsetsSourceControl[] activeControls);
    int relayout(IWindow window, int seq, WindowManager.LayoutParams attrs,
                 int requestedWidth, int requestedHeight, int viewVisibility,
                 int flags, long frameNumber, Rect outFrame,
                 Rect outContentInsets, Rect outVisibleInsets, Rect outStableInsets,
                 Rect outBackdropFrame,
                 DisplayCutout.ParcelableWrapper displayCutout,
                 MergedConfiguration outMergedConfiguration, SurfaceControl outSurfaceControl,
                 InsetsState insetsState, InsetsSourceControl[] activeControls,
                 Point outSurfaceSize, SurfaceControl outBlastSurfaceControl);

//    void finishDrawing(IWindow window, SurfaceControl.Transaction postDrawTransaction);
//    void remove(IWindow window);

    /**
     * Android 10 R48
     */
    int addToDisplay(IWindow window, int seq, WindowManager.LayoutParams attrs,
                     int viewVisibility, int layerStackId, Rect outFrame,
                     Rect outContentInsets, Rect outStableInsets, Rect outOutsets,
                     DisplayCutout.ParcelableWrapper displayCutout, InputChannel outInputChannel,
                     InsetsState insetsState);
    int addToDisplayWithoutInputChannel(IWindow window, int seq, WindowManager.LayoutParams attrs,
                                        int viewVisibility, int layerStackId, Rect outContentInsets,
                                        Rect outStableInsets, InsetsState insetsState);

    int relayout(IWindow window, int seq, WindowManager.LayoutParams attrs,
                 int requestedWidth, int requestedHeight, int viewVisibility,
                 int flags, long frameNumber, Rect outFrame, Rect outOverscanInsets,
                 Rect outContentInsets, Rect outVisibleInsets, Rect outStableInsets,
                 Rect outOutsets, Rect outBackdropFrame,
                 DisplayCutout.ParcelableWrapper displayCutout,
                 MergedConfiguration outMergedConfiguration, SurfaceControl outSurfaceControl,
                 InsetsState insetsState);

    void finishDrawing(IWindow window);
//    void remove(IWindow window);

    /**
     * Android 9 R60
     */
    int add(IWindow window, int seq, WindowManager.LayoutParams attrs,
            int viewVisibility, Rect outContentInsets, Rect outStableInsets,
            InputChannel outInputChannel);
    int addToDisplay(IWindow window, int seq, WindowManager.LayoutParams attrs,
                     int viewVisibility, int layerStackId, Rect outFrame,
                     Rect outContentInsets, Rect outStableInsets, Rect outOutsets,
                     DisplayCutout.ParcelableWrapper displayCutout, InputChannel outInputChannel);
    int addWithoutInputChannel(IWindow window, int seq, WindowManager.LayoutParams attrs,
                               int viewVisibility, Rect outContentInsets, Rect outStableInsets);
    int addToDisplayWithoutInputChannel(IWindow window, int seq, WindowManager.LayoutParams attrs,
                                        int viewVisibility, int layerStackId, Rect outContentInsets,
                                        Rect outStableInsets);

    int relayout(IWindow window, int seq, WindowManager.LayoutParams attrs,
                 int requestedWidth, int requestedHeight, int viewVisibility,
                 int flags, long frameNumber, Rect outFrame, Rect outOverscanInsets,
                 Rect outContentInsets, Rect outVisibleInsets, Rect outStableInsets,
                 Rect outOutsets, Rect outBackdropFrame,
                 DisplayCutout.ParcelableWrapper displayCutout,
                 MergedConfiguration outMergedConfiguration, Surface outSurface);

//    void finishDrawing(IWindow window);
//    void remove(IWindow window);

}
