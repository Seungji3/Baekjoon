fun main(){
    val count = readLine()!!.toInt()
    for(i in 1..count){
        print("${if (i%6==0 || i == count) "$i Go! " else "$i "}")
    }
}