package xyz.marcb.support

import androidx.appcompat.app.AlertDialog

fun AlertDialog.Builder.setItems(vararg items: Pair<Int, () -> Unit>): AlertDialog.Builder {
    return setItems(listOf(*items))
}

fun AlertDialog.Builder.setItems(items: List<Pair<Int, () -> Unit>>): AlertDialog.Builder {
    val ids = items.map { (id, _) -> context.getString(id) }.toTypedArray()
    return setItems(ids) { _, index ->
        items[index].second.invoke()
    }
}
