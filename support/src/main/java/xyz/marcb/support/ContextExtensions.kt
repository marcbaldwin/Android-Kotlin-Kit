package xyz.marcb.support

import android.content.Context

fun Int.dpToPixels(context: Context) = (this * context.resources.displayMetrics.density + 0.5f).toInt()

fun Int.spToPixels(context: Context) = (this * context.resources.displayMetrics.scaledDensity + 0.5f).toInt()

fun Float.pixelsToSp(context: Context) = this / context.resources.displayMetrics.scaledDensity
