fun main(args: Array<String>) {
    var listSize = readln().toInt()
    var list = HashSet<Int>(readln().split(" ").map { it.toInt() })

    var listSize2 = readln().toInt()

    var list2 = readln().split(" ").map { it.toInt() }.toSet()
    var index = if(list.size >= list2.size){list2-list}else{list-list2}

    list2.forEach{
        if(index.contains(it)){
            println(0)
        }else{
            println(1)
        }
    }

}