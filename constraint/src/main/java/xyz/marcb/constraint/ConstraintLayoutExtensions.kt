package xyz.marcb.constraint

import android.support.constraint.ConstraintLayout
import android.support.constraint.ConstraintSet

inline fun ConstraintLayout.applyConstraints(handler: ConstraintSet.() -> Unit) {
    val constraintSet = ConstraintSet()
    constraintSet.clone(this)
    handler.invoke(constraintSet)
    constraintSet.applyTo(this)
}
