lateinit var visited : Array<MutableList<Boolean>>

fun main(args: Array<String>) {
    var size = readln().split(" ").map { it.toInt() }
    var map = Array(size[1]){ MutableList(size[0]) {""} }
    var dps_w = 0
    var dps_b = 0

    visited = Array(size[1]){MutableList(size[0]) {false} }

    repeat(size[1]){
        readln().forEachIndexed { it2,item ->
            map[it][it2] = item.toString()
        }
    }

    for (i in 0 until size[1]){
        for (i2 in 0 until size[0]){
            var num = dfs(map,i,i2,"W")
            var num2 = dfs(map,i,i2,"B")

            if(num != 0){
                dps_w += num*num
            }

            if (num2 != 0){
                dps_b += num2*num2
            }
        }
    }

    println("$dps_w $dps_b")

}

fun dfs(map : Array<MutableList<String>>, startIndex : Int, lastIndex : Int,team:String) : Int{

    if (map.size <= startIndex || map[0].size <= lastIndex || 0 > startIndex || 0 > lastIndex || visited[startIndex][lastIndex]){
        return 0
    }

    var count = 1

    if (!visited[startIndex][lastIndex] && map[startIndex][lastIndex] == team){
        visited[startIndex][lastIndex] = true

        count += dfs(map, startIndex-1, lastIndex,team)
        count += dfs(map, startIndex+1, lastIndex,team)
        count += dfs(map, startIndex, lastIndex-1,team)
        count += dfs(map, startIndex, lastIndex+1,team)

        return count
    }

    return 0
}