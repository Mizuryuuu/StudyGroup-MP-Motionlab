package soal3

// TODO
fun getMiddleCharacters(string: String): String {
    val length = string.length
    var char: String
    if(length == 0) return ""

    val middleIndex = length / 2

    char = if(length % 2 == 0){
        string[middleIndex-1].toString() + string[middleIndex].toString()
    } else {
        string[middleIndex].toString()
    }
    return char
}