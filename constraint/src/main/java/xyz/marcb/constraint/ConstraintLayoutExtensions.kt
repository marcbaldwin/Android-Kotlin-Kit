package xyz.marcb.constraint

import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

inline fun ConstraintLayout.applyConstraints(handler: ConstraintSet.() -> Unit) {
    val constraintSet = ConstraintSet()
    constraintSet.clone(this)
    handler.invoke(constraintSet)
    constraintSet.applyTo(this)
}
