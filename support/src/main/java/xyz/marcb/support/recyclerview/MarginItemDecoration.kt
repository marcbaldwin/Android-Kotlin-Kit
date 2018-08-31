package xyz.marcb.support.recyclerview

import android.content.Context
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import xyz.marcb.support.dpToPixels

open class MarginItemDecoration(
        private val context: Context,
        private val direction: Direction,
        private val horizontalSpacing: Int,
        private val verticalSpacing: Int,
        private val includeFirst: Boolean = false,
        private val includeLast: Boolean = false
) : RecyclerView.ItemDecoration() {

    enum class Direction {
        HORIZONTAL, VERTICAL
    }

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        val position = parent.getChildLayoutPosition(view)

        val itemCount = parent.adapter?.itemCount ?: 0

        if (direction == Direction.HORIZONTAL) {
            outRect.top = verticalSpacing.dpToPixels(context)
            outRect.bottom = verticalSpacing.dpToPixels(context)
            outRect.left = (if (position == 0 && !includeFirst) 0 else horizontalSpacing).dpToPixels(context)
            outRect.right = (if (position == itemCount-1 && includeLast) horizontalSpacing else 0).dpToPixels(context)
        } else {
            outRect.top = (if (position == 0 && !includeFirst) 0 else verticalSpacing).dpToPixels(context)
            outRect.bottom = (if (position == itemCount-1 && includeLast) verticalSpacing else 0).dpToPixels(context)
            outRect.left = horizontalSpacing.dpToPixels(context)
            outRect.right = horizontalSpacing.dpToPixels(context)
        }
    }
}