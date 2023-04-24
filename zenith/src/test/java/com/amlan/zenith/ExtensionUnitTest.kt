package com.amlan.zenith

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*


class ExtensionUnitTest {

    @Test
    fun testGetNotNullInt() {
        val givenValues = arrayOf("1", Int.MAX_VALUE.toString(), Int.MIN_VALUE.toString(), " ", null)
        val expectedResults = arrayOf(1, Int.MAX_VALUE, Int.MIN_VALUE, 0, 0)
        givenValues.forEachIndexed { index, s ->
            val givenValue = givenValues[index]
            val actualValue = givenValue.getNotNullInt()
            assertEquals(expectedResults[index], actualValue)
        }
    }

    @Test
    fun testGetInt() {
        val givenValues = arrayOf("1", Int.MAX_VALUE.toString(), Int.MIN_VALUE.toString(), " ", null, "3", "s", "SABV")
        val expectedResults = arrayOf(1, Int.MAX_VALUE, Int.MIN_VALUE, 0, 0, 3, 0, 0)
        givenValues.forEachIndexed { index, s ->
            val givenValue = givenValues[index]
            val actualValue = getInt(givenValue)
            assertEquals(expectedResults[index], actualValue)
        }
    }

    @Test
    fun testGetNotNullLong() {
        val givenValues = arrayOf("1", Long.MAX_VALUE.toString(), Long.MIN_VALUE.toString(), " ", null)
        val expectedResults = arrayOf(1L, Long.MAX_VALUE, Long.MIN_VALUE, 0L, 0L)
        givenValues.forEachIndexed { index, s ->
            val givenValue = givenValues[index]
            val actualValue = givenValue.getNotNullLong()
            assertEquals(expectedResults[index], actualValue)
        }
    }

    @Test
    fun testGetLong() {
        val givenValues = arrayOf("1", Long.MAX_VALUE.toString(), Long.MIN_VALUE.toString(), " ", null, "3", "s", "SABV")
        val expectedResults = arrayOf(1L, Long.MAX_VALUE, Long.MIN_VALUE, 0L, 0L, 3L, 0L, 0L)
        givenValues.forEachIndexed { index, s ->
            val givenValue = givenValues[index]
            val actualValue = getLong(givenValue)
            assertEquals(expectedResults[index], actualValue)
        }
    }

    @Test
    fun testGetNotNullDouble() {
        val givenValues = arrayOf("1", Double.MAX_VALUE.toString(), Double.MIN_VALUE.toString(), " ", null)
        val expectedResults = arrayOf(1.0, Double.MAX_VALUE, Double.MIN_VALUE, 0.0, 0.0)
        givenValues.forEachIndexed { index, s ->
            val givenValue = givenValues[index]
            val actualValue = givenValue.getNotNullDouble()
            Assert.assertEquals(actualValue, expectedResults[index], 0.001)
        }
    }

    @Test
    fun testGetDouble() {
        val givenValues = arrayOf("1", Double.MAX_VALUE.toString(), Double.MIN_VALUE.toString(), " ", null, "3", "s", "SABV")
        val expectedResults = arrayOf(1.0, Double.MAX_VALUE, Double.MIN_VALUE, 0.0, 0.0, 3.0, 0.0, 0.0)
        givenValues.forEachIndexed { index, s ->
            val givenValue = givenValues[index]
            val actualValue = getDouble(givenValue)
            assertEquals(expectedResults[index], actualValue, 0.001)
        }
    }
}
