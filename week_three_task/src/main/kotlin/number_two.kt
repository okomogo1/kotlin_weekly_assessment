fun main(){
    var str: String = "Good food"
    strReverse(str)
}


fun strReverse(str: String){
    var reverse = ""
    for (i in str.length - 1 downTo 0){
        reverse += str[i]
    }

    println(reverse)
}