fun main() {
    // Static name
    val agency: String = "Aplikasi Penjualan Pulsa"

    /*
     Header
     */
    println("================================")
    println("=== $agency ===")
    println("================================")

    /*
     * Body
     */
    println()
    // Status
    var status: Boolean = true
    if (status) println("Aplikasi Aktif/Buka") else println("Aplikasi Tutup")

    // Body Header
    val bodyHeader = arrayOf("Daftar", "Pulsa")
    print("${bodyHeader[0]} ${bodyHeader[1]} : ")

    // List code
    val rangeList = 0.rangeTo(4)
    rangeList.forEach {
        print("$it ")
    }
    println()

    // daftar pulsa dan harga pulsa
    val pulsaList = intArrayOf(5000, 10_000, 20_000, 50_0000, 100_000)
    var hargaList = intArrayOf(7000, 12_000, 22_000, 52_0000, 102_000)

    var lala: Array<IntArray> = arrayOf(pulsaList, hargaList)

    println("Isi Pulsa : ")
    for ((i, value) in pulsaList.withIndex()){
        println("${i}. $value Harga : ${hargaList[i]}")
    }
}