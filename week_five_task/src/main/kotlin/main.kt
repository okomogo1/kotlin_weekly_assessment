fun main(args: Array<String>) {
    var result1: String = "Hello Kenneth, How are you doing today"
    println("The Original Sentence is: $result1")
    var result2: String = removeVowels("Hello Kenneth, How are you doing today")
    println("When the removeVowels function is use: $result2")
}

fun removeVowels(str: String): String {
    var result: String = ""
    var c: Char
    for (x in 0 until str.length) {
        c = str[x]
        if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')){
            result += c
        }
    }
    return result
}