fun main(args : Array<String>){

    var command = readln().split(" ").map{ it.toInt() }

    var map = Array<MutableList<Int>>(command[0] + 1){mutableListOf()}
    var isCheck = Array(command[0] + 1){false}

    repeat(command[1]){
        var line = readln().split(" ").map{ it.toInt() }

        map[line[0]].add(line[1])
        map[line[1]].add(line[0])
    }

    for(i in map.indices){
        map[i].sort()
    }

    dfs(map,isCheck,command[2])

}

fun dfs(map: Array<MutableList<Int>>, isCheck: Array<Boolean>, startIndex : Int){
    isCheck[startIndex] = true
    print("$startIndex ")

    for(i in map[startIndex]){
        if(!isCheck[i]){
            dfs(map,isCheck, i)
        }
    }

}