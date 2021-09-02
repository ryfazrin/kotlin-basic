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

    // * Nilai with vararg
    val nilai = intArrayOf(10, 10, 10, 10, 10)
    val mySumNilai = getSumNilai(nilai= nilai)

    nilai.forEachIndexed { index, value ->
        if (index == (nilai.size - 1))
            println("$value")
        else
            print("$value, ")
    }
    println(mySumNilai)

    // * short about with NUll type & Elvis Operator (?:)
    val about: String? = null
    val myAbout = about ?: "Saya adalah seorang mobile developer dan bussiness man";

    println(myAbout)
}

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