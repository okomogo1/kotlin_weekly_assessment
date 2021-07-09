fun main() {
    var inLove1 = loveCalculator(4,4)
    println("Are they in love? $inLove1")
    var inLove2 = loveCalculator(3,11)
    println("Are they in love? $inLove2")
    var inLove3 = loveCalculator(22,17)
    println("Are they in love? $inLove3")
    //tried something different
    loveCal(22,21)

}

fun loveCalculator(flower1: Int, flower2: Int): Boolean{
    return(flower1 % 2 != flower2 % 2)
}

fun loveCal(flower1: Int, flower2: Int){
    var result = if(flower1 % 2 != flower2 % 2){
        println("true")
    }else{
        println("false")
    }
}