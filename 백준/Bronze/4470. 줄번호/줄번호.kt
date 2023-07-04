fun main(){
    val count = readLine()!!.toInt()
    var list = ArrayList<String>()
    for(i in 1..count){
        val txt = readLine()
        list.add("$i. $txt")
    }
    for(i in list){
        println(i)
    }
}