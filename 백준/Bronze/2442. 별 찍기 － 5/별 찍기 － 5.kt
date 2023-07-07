fun main(){
    val count = readLine()!!.toInt()
    for (i in 0 until count){
        for(j in 0 until count-i-1){
            print(" ")
        }
        for(k in 0..i){
            print("*")
        }
        for(n in 1..i){
            print("*")
        }
        println()
    }
}