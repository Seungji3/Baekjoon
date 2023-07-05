import kotlin.collections.ArrayList

fun main(){
    while (true){
        var txt = readLine()!!
        val list = ArrayList<String>(txt.split(" "))
        var list_txt:String = list[0]
        if(list[1].toInt() > 17 || list[2].toInt() >= 80) list_txt +=" Senior" else list_txt +=" Junior"
        if (txt == "# 0 0") break
        println(list_txt)
    }
}