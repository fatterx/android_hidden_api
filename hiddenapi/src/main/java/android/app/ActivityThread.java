package android.app;

import android.content.pm.IPackageManager;

/**
 * mock class for ActivityThread.
 *
 * if you want more hidden method / field, add it here
 *
 * created by fatter 2022/5/31
 */
public final class ActivityThread {

    /**
     * open {@link ActivityThread#currentPackageName} method
     *
     * @return packageName
     */
    public static String currentPackageName() {
        return null;
    }

    /**
     * open {@link ActivityThread#currentProcessName} method
     *
     * @return processName
     */
    public static String currentProcessName() {
        return null;
    }

    /**
     * open {@link ActivityThread#currentApplication} method
     *
     * @return application
     */
    public static Application currentApplication() {
        return null;
    }

    /**
     * open {@link ActivityThread#currentActivityThread} method
     *
     * @return activityThread
     */
    public static ActivityThread currentActivityThread() {
        return null;
    }

    /**
     * open {@link ActivityThread#getPackageManager} method
     *
     * @return packageManager
     */
    public static IPackageManager getPackageManager() {
        return null;
    }

    /**
     * open {@link ActivityThread#getInstrumentation} method
     *
     * @return instrumentation
     */
    public Instrumentation getInstrumentation() {
        throw new RuntimeException("Stub!");
    }
}
