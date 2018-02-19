package xyz.marcb.support

import android.content.Context

fun Int.dpToPixels(context: Context): Int = (this * context.resources.displayMetrics.density + 0.5f).toInt()