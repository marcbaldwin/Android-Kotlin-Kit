package xyz.marcb.support.view

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.viewpager.widget.ViewPager

open class CustomViewPager : ViewPager {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    open var isUserInteractionEnabled = false

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent): Boolean =
            isUserInteractionEnabled && super.onTouchEvent(event)

    override fun onInterceptTouchEvent(event: MotionEvent): Boolean =
            isUserInteractionEnabled && super.onInterceptTouchEvent(event)
}