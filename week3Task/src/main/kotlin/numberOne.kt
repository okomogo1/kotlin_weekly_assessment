fun main(){
    for(a in 1..100){
        if(a%3 == 0 && a%5 == 0){
            println("FizzBuzz")
        }else if(a%5 == 0){
            println("Buzz")
        }else if(a%3 == 0 ){
            println("Fizz")
        }else {
            println(a)
        }
    }
}