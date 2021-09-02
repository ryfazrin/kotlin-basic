/**
 * Main
 * Studi Kasus, Website Portfolio
 */
fun main() {
    // * myFullName with function
    val myFullName = getFullName(
        first = "Muhammad",
        middle = "Pazrin",
        last = "Andreanor"
    )

    println(myFullName)

    // ===========================

    // * short about with NUll type & Elvis Operator (?:)
    val about: String? = null
    val myAbout = about ?: "Saya adalah seorang web/mobile developer dan bussiness man";

    println(myAbout)

    // ===========================

    // * Nilai with array & vararg
    val nilai = intArrayOf(10, 10, 10, 10, 10)

    print("Nilai saya : ")
    nilai.forEachIndexed { index, value ->
        if (index == (nilai.size - 1))
            println("$value")
        else
            print("$value, ")
    }

    // ===========================

    val mySumNilai = getSumNilai(nilai = nilai)

    print("Total : ")
    println(mySumNilai)

    // ===========================

    // * make function avg (rata-rata) with Function Type
    val avg: Arithmetic = { valueA, valueB -> valueA / valueB }

    // Avg Nilai
    val avgNilai = avg(mySumNilai, nilai.size)
    println("Rata-rata nilai : $avgNilai")

    // ===========================


}

// * Arithmetic Function Type
typealias Arithmetic = (Int, Int) -> Int

/**
 * function for Get Full Name
 */
fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

/**
 * function for Get Sum Nilai
 */
fun getSumNilai(vararg nilai: Int): Int {
    return nilai.sum()
}