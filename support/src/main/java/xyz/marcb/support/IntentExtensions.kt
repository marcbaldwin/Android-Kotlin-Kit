package xyz.marcb.support

import android.content.Intent
import android.content.pm.PackageManager

fun Intent.canBeResolved(packageManager: PackageManager) = resolveActivity(packageManager) != null