var answer = 0

fun main(args: Array<String>){
    var size = readln().toInt()
    var count = readln().toInt()
    var map = Array<MutableList<Int>>(size + 1){ mutableListOf() }
    var isCheck = Array<Boolean>(size + 1) {false}

    repeat(count){
        var line = readln().split(" ").map { it.toInt() }

        map[line[0]].add(line[1])
        map[line[1]].add(line[0])
    }

    dfs(map,isCheck,1)
    println(answer)

}

fun dfs(map: Array<MutableList<Int>>, isCheck: Array<Boolean>, startIndex:Int){
    isCheck[startIndex]= true

    for (i2 in map[startIndex]){ //핵심은 startIndex 즉 1번과 연결된 노드들만 순회할 수 있게 인접 리스트에 담긴 항목을 이용해 접근해서 4번과 7번은 해당되지 않음
        if (!isCheck[i2]){
            answer ++
            dfs(map,isCheck,i2)
        }
    }
}