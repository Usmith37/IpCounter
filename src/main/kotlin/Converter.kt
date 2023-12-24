import kotlin.math.pow

class Converter {
    fun convertToLong(ipAddress: String): Long {
        val ipAddressArray = ipAddress.split(".").toTypedArray()
        var result: Long = 0
        for (i in 0..3) {
            val pow = 3 - i
            val ip = ipAddressArray[i].toInt()
            result = (((result + ip * 256.0.pow(pow)).toLong()))
        }
        return result
    }
}