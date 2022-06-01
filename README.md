# android_hidden_api

## What

this project we mock Android hidden system api, so that you can use it directly in your Android app

## Why

Technically, you can not use `ActivityThread.currentApplication()` method in your application,

because Android Team removed `ActivityThread.class` and other classes / methods / fields annotated
by @hide when packing Android.jar. That's a very tricky way.

When you write `ActivityThread.currentApplication()` in your code, your IDE and compiler will complaint **"Can't find ActivityThread"**.

But, what if we still want to use?

As we known, Those hidden classes / methods / fields can be accessed at runtime,

so we just need a little trick to cheat on compiler.

This project is the **little trick**.

## How

In simple words, we just reverse the Android Team work.

We mock `ActivityThread.class` and associates as a general 3rd-party library.

The **key point** is to add this dependency by **compileOnly**.

**compileOnly** means I guarantee those hidden apis will be found at runtime,

the compiler will not search those in classpath any more.

```
dependencies { 

        compileOnly "com.github.fatterx:android_hidden_api:0.0.1"

        // DO NOT ADD THIS DEPENDENCY LIKE THIS
        // api "com.github.fatterx:android_hidden_api:0.0.1"
        // implementation "com.github.fatterx:android_hidden_api:0.0.1"
        // runtimeOnly "com.github.fatterx:android_hidden_api:0.0.1"
        
    }

```
