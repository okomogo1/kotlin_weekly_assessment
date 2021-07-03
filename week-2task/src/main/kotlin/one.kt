fun main(){
    var value : Int = 5
    var returnValue = if( value == 5){
        println("value is equal to 5")
    }else{
        println("value is not equal to 5")
    }

    var name : String = ("Kenneth")
    val returnName = if(name == "Kenneth"){
        println("My name is Kenneth")
    }else{
        println("You are not Kenneth")
    }

    var letter : Char = 'A'
    var returnLetter = if(letter == 'A'){
        println("A is the first letter of the alphabet")
    }else if(letter == 'Z'){
        println("Z is the last letter of the alphabet")
    }else{
        println("$letter is not the first nor the last letter of the alphabet")
    }

    var price : Double = 2000.00
    val returnPrice = if(price == 2000.00){
        println("The price is 2000")
    }else{
        println("The price is not 2000")
    }

    var color : String = "Red"
    var returnColor = if(color == "Red" || color =="Blue" || color == "Green") {
        println("$color is a primary color")
    }else{
        println("$color is a secondary color")
    }

    var day : String = "Monday"
    var returnDay = if(day == "Monday"){
        println("$day is the first day of the week")
    }else if(day == "Tuesday"){
        println("$day is the second day of the week")
    }else if(day == "Wednesday"){
        println("$day is the third day of the week")
    }else if(day == "Thursday"){
        println("$day is the fourth day of the week")
    }else if(day == "Friday"){
        println("$day is the fifth day of the week")
    }else if(day == "Saturday"){
        println("$day is the sixth day of the week")
    }else if(day == "Sunday"){
        println("$day is the seventh day of the week")
    }else{
        println("You input an invalid day of the week")
    }

    var score : Int = 50
    var returnScore = if( score > 50){
        println("You Passed the Exam")
    }else if(score < 50){
        println("You failed the Exam")
    }else{
        println("You score Average, you might be consider for Admission")
    }

    var num : Int = 39
    var returnNum   = if(num % 2 == 0){
        println("$num is an Even number")
    }else{
        println("$num is an Odd number")
    }

    var worldBestPlayer : String = "Messi"
    var returnWorldBestPlayer = if(worldBestPlayer == "Messi"){
        println("$worldBestPlayer is the greatest football player")
    }else if(worldBestPlayer == "Ronald"){
        println("$worldBestPlayer is good both Messi is better")
    }else{
        println("$worldBestPlayer not good enough")
    }


    var number1: Int = 10
    var number2: Int = 20
    var result = if(number1 > number2){
        println("$number1 is greater than $number2")
    }else{
        println("$number1 is less than $number2")
    }

    val num1: Int = -10
    var result1 = if(num1 > 0){
        println("$num1 is positive number")
    }else if(num1 < 0){
        println("$num1 is  negative")
    }else{
        println("num1 is zero")
    }
    println()
    println()
    //when statement
    println("Using when Statement")
    var num4 : Int = 5
    var numberProvided = when(num4){
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "five"
        else -> "invalid number"
    }
    println ("You provide $numberProvided")

    var dayOfWeek : String = "Monday"
    var dayOfWeekProvided = when(dayOfWeek){
        "Monday" -> "Day one"
        "Tuesday" -> "Day two"
        "Wednesday" -> "Day three"
        "Thursday" -> "Day four"
        "Friday" -> "Day five"
        "Saturday" -> "Day six"
        "Sunday" -> "Day seven"
        else -> "Invalid day of the week"
    }
    println("$dayOfWeek is $dayOfWeekProvided")

    var score1 : Int = 67
    var score1Provided = when(score1){
        in 1..45 -> "You failed the Exam"
        in 46..55 -> "You score average, you might be consider"
        in 55..100 -> "You passed the Exam"
        else -> "Invalid score, you are a cheat"
    }
    println("You score $score1. $score1Provided")

    var color1 : String = "Red"
    var color1Provided = when(color1){
        "Red","Blue","Green" -> "Primary color"
        "Yellow", -> "Secondary color"
        else -> "Invalid color name"
    }
    println("$color1 is a $color1Provided")

    var time : Int = 11
    var timeProvided = when(time){
        in 0..12 -> "Good Morning"
        in 12..18 -> "Good Afternoon"
        in 19..24 ->  "Good Night"
        else -> "Invalid time"
    }
    println("$timeProvided")




}