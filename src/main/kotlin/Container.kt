import java.util.*

class Container {
    private val bitSetLow = BitSet(Int.MAX_VALUE)
    private val bitSetHigh = BitSet(Int.MAX_VALUE)

    fun add(i: Long) {
        if (i <= Integer.MAX_VALUE) {
            bitSetLow.set(i.toInt())
        } else {
            bitSetHigh.set((i - Integer.MAX_VALUE).toInt())
        }
    }

    fun size(): Long {
        return bitSetLow.cardinality().toLong() + bitSetHigh.cardinality()
    }
}