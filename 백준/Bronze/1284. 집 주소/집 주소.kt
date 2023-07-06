fun main(){
    while(true){
        val txt:String = readLine()!!
        var list = txt.toList()
        var count:Int = 0
        if (txt == "0") break
        for(i in 0 until list.size){
            if (list[i] == '1') count+=2
            else if (list[i] == '0') count+=4
            else count+=3
        }
        count += list.size+1
        println(count)
    }
}