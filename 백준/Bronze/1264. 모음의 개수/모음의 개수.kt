import kotlin.collections.ArrayList

fun main(){
    while (true){
        var count:Int = 0
        val txt = readLine()!!.lowercase()
        var list = ArrayList<String>(txt.split(""))
        for(i in 0 until list.size){
            if(list[i].contains('a') || list[i].contains('e') || list[i].contains('o') || list[i].contains('u') || list[i].contains('i') ) count++
        }
        if(txt.contains('#')) break
        println(count)
    }
}