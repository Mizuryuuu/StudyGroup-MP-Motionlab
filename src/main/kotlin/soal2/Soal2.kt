package soal2


// TODO
fun minAndMax(number: Int): Int {
    val digits = number.toString().map { it.digitToInt() }
    return (digits.minOrNull() ?: 0) + (digits.maxOrNull() ?: 0)
}