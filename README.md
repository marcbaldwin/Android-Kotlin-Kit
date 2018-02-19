# Android Kotlin Kit
[![](https://jitpack.io/v/marcbaldwin/android-kotlin-kit.svg)](https://jitpack.io/#marcbaldwin/android-kotlin-kit)

Convenience views and functions for Android written in Kotlin

## Getting started

1. Add the [JitPack](https://jitpack.io) repository to your project's build.gradle
```
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
```

2. Add a dependency to ***android-kotlin-kit***
```
dependencies {
	implementation 'com.github.marcbaldwin:android-kotlin-kit:1.0.0'
}
```

### Display

```kotlin
val dpInPixels = 16.dpToPixels(context)

val spInPixels = 20.spToPixels(context)
```

### CustomViewPager

A `ViewPager` that allows you to disable swiping between pages

```xml

<xyb.marcb.android.view.CustomViewPager
    android:id="@+id/my_view_pager"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
 
    <!-- Your view pages here -->
 
</xyb.marcb.android.view.CustomViewPager>
```

```kotlin
// Prevent swiping between pages
my_view_pager.isUserInteractionEnabled = false // false by default
```

## Contributors

- Marc Baldwin [@marcbaldwin](https://github.com/marcbaldwin)
