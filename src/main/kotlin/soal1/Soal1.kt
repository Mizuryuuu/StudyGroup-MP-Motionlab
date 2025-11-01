package soal1

// TODO
fun sumOfBigThree(numbers: List<Int>): Int {
    var temp: Int = 0
    val listTemp = mutableListOf<Int>()
    val mutableNumbers = numbers.toMutableList()

    for (i in 1..3) {
        temp = mutableNumbers.maxOrNull() ?: 0
        listTemp.add(temp)
        mutableNumbers.remove(temp)
    }

    return listTemp.sum()
}