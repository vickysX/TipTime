package com.example.tiptime

import org.junit.Test
import org.junit.Assert.*
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val tip = calculateTip(10.0, 20.0, false)
        assertEquals(
            NumberFormat.getCurrencyInstance().format(2.0),
            tip
        )
    }
}