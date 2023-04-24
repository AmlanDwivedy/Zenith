package com.amlan.zenith

import android.app.Activity
import android.content.Context
import android.content.res.Resources
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.Toast

/**
 * This function takes string as param and returns int
 *
 * for example:
 *  val s = "2"
 *  val intValue = s.getNotNullInt()
 *  In case you need other value than 0 incase its a number then pass defaultvalue
 *  val intValue = s.getNotNullInt(-99)
 *
 *
 * @param String
 * @return Int
 */
fun String?.getNotNullInt(defaultValue: Int = 0): Int {
    return this?.toIntOrNull() ?: defaultValue
}


fun getInt(anyValue: Any?, defaultValue: Int = 0): Int {
    return anyValue.toString().getNotNullInt(defaultValue)
}


fun String?.getNotNullLong(defaultValue: Long = 0L): Long {
    return this?.toLongOrNull() ?: defaultValue
}

fun getLong(anyValue: Any?, defaultValue: Long = 0L): Long {
    return anyValue.toString().getNotNullLong(defaultValue)
}

fun String?.getNotNullDouble(defaultValue: Double = 0.0): Double {
    return this?.toDoubleOrNull() ?: defaultValue
}

fun getDouble(anyValue: Any?, defaultValue: Double = 0.0): Double {
    return anyValue.toString().getNotNullDouble(defaultValue)
}

fun Any?.getFloat(defaultValue: Float = 0.0f): Float {
    if (this == null) {
        return 0f
    }
    var floatValue = defaultValue
    try {
        floatValue = this.toString().toFloat()
    } catch (e: NumberFormatException) {
        e.printStackTrace()
    }
    return floatValue
}


/**
 *  when you want to show a view
 */
fun View.show() {
    visibility = View.VISIBLE
}

/**
 *  When you want to hide a view
 */
fun View.hide() {
    visibility = View.GONE
}

fun getScreenWidth(): Int {
    return Resources.getSystem().displayMetrics.widthPixels
}

fun getScreenHeight(): Int {
    return Resources.getSystem().displayMetrics.heightPixels
}


fun View.hideKeyboard(context: Context) {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(windowToken, 0)
}

fun Activity.hideKeyBoard() {
    window?.setSoftInputMode(
        WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
    )
}

fun Context.showToast(message: String?, length: Int = Toast.LENGTH_SHORT) =
    message?.let { toastMessage ->
        if (toastMessage.isNotEmpty() && toastMessage.isNotBlank()) {
            Toast.makeText(this, toastMessage, length).show()
        } else {
            Toast.makeText(this, this.getString(R.string.something_went_wrong), length).show()
        }
    }
