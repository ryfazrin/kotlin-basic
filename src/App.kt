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
    println()

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

    // for array multidimentional
    var lala: Array<IntArray> = arrayOf(pulsaList, hargaList)

    for ((i, value) in pulsaList.withIndex()){
        println("${i}. $value Harga : ${hargaList[i]}")
    }
    println()

    // Isi Pulsa
    print("Isi Pulsa Sebanyak : ")
    var pulsaBuy: Int = 10000
    println(pulsaBuy)

    // cek daftar pulsa
    when(pulsaBuy){
        in pulsaList -> println("Bisa, ada didalam daftar penjualan pulsa")
        else -> println("Tidak ada didalam daftar penjualan pulsa")
    }

    // menentukan harga pulsa
    print("Harga Bayar: Rp. ")
    when(pulsaBuy){
        pulsaList[0] -> println(hargaList[0])
        pulsaList[1] -> println(hargaList[1])
        pulsaList[2] -> println(hargaList[2])
        pulsaList[3] -> println(hargaList[3])
        else -> println(0)
    }
}