import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {

    val fileName = "src/main/ip_addresses.txt"
    val converter = Converter()
    val container = Container()

    BufferedReader(FileReader(File(fileName))).use { br ->
        br.lines().forEach {
            container.add(converter.convertToLong(it))
        }
    }
    println(container.size())
}