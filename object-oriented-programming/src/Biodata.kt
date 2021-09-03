class Biodata(
    val name: String,
    val nim: Int,
    val desc: String,
    val ipk: Double
) {
    public fun getName() {
        println("Nama: $name")
        println("Nama: ${name.reversed()}")
        println("Nama: ${name.toUpperCase()}")
        println("Nama: ${name.toLowerCase()}")
    }

    public fun getNim() {
        println("NIM: $nim")
    }

    public fun getDesc() {
        println("Deskripsi: $desc")
    }

    fun getIpk() {
        println("IPK: $ipk")
    }
}