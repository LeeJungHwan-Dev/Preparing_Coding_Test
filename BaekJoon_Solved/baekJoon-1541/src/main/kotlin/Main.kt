fun main(args:Array<String>){
    var line = readln()
    var str = line.split("-")
    var str2 = str[0].split("+").sumOf { it.toInt() }

    for (i in 1 until  str.size){
        str2 -= str[i].split("+").sumOf { it.toInt() }
    }

    println(str2)
}