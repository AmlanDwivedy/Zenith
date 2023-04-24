package com.amlan.zenith

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
    return anyValue.toString().getNotNullInt()
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

