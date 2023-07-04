fun main(){
    var count:Int = 0
    for(i: Int in 0 until 5){
        val num: Int = readLine()!!.toInt()
        count += num
    }
    println(count)
}