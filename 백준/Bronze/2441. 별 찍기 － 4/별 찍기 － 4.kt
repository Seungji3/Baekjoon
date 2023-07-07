fun main(){
    val count = readLine()!!.toInt()
    for (i in 0 until count){
        for(j in 0 until i){
            print(" ")
        }
        for(k in 0 until count-i){
            print("*")
        }
        println()
    }
}