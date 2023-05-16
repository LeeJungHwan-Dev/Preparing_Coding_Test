lateinit var map : Array<MutableList<Int>>
lateinit var visited : Array<Boolean>
var answer = 0
fun main(args: Array<String>) {
    var maxComputer = readln().toInt()
    var lineInput = readln().toInt()

    map = Array(maxComputer+1){ mutableListOf() }
    visited = Array(maxComputer+1){false}

    repeat(lineInput){
        var inputs = readln().split(" ").map { it.toInt() }

        map[inputs[0]].add(inputs[1])
        map[inputs[1]].add(inputs[0])
    }

    dfs(1)

    println(answer)
}

fun dfs(startNode: Int){
    visited[startNode] = true

    for (i in map[startNode]){
        if (!visited[i]){
            answer++
            dfs(i)
        }
    }
}