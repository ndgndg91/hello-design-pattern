package com.ndgndg91.decorator.inputstream

import java.io.FilterInputStream
import java.io.InputStream

class LowerCaseInputStream(private val inputStream: InputStream): FilterInputStream(inputStream) {
    override fun read(): Int {
        val c = this.inputStream.read()
        return if (c == -1) c else Character.toLowerCase(c)
    }

    override fun read(b: ByteArray, off: Int, len: Int): Int {
        val result = this.inputStream.read(b, off, len)
        for (i in off until off + result) {
            b[i] = Character.toLowerCase(b[i].toInt().toChar()).code.toByte()
        }
        return super.read(b, off, len)
    }
}