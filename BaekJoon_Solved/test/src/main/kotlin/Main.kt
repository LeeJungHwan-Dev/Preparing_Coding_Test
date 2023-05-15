fun main(args: Array<String>) {

    var node = readln().toInt()
    var line = readln().toInt()

    var list = Array<MutableList<Int>>(node+1){ mutableListOf() }
    var isCheck = ArrayList<Boolean>(node+1)

    isCheck.add(false)

    repeat(line) {
        var input = readln().split(" ").map { it.toInt() }
        list[input[0]].add(input[1])
        isCheck.add(false)
    }

    dfs(list,isCheck,1)
}

fun dfs(list: Array<MutableList<Int>>,isCheck:ArrayList<Boolean>,startIndex : Int){
    println(startIndex)
    isCheck[startIndex] = true

    for(i in list[startIndex]){
        if (!isCheck[i]){
            dfs(list, isCheck, i)
        }
    }
}