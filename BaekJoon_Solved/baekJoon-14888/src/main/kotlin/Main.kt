import kotlin.math.max
import kotlin.math.min

var list = Array(100){0}
var math = Array(4){ 0 }
var maxs = -1000000000
var mins = 1000000000
var nCount = readln().toInt()

fun main(args: Array<String>) {

    readln().split(" ").mapIndexed {i,item ->
        list[i] = item.toInt()
    }

    readln().split(" ").mapIndexed{i,item ->
        math[i] = item.toInt()
    }

    dfs(1,list[0])

    println(maxs)
    println(mins)
}

fun dfs(n : Int, x:Int){
    if (n == nCount){
        maxs = max(maxs,x)
        mins = min(mins,x)
    }

    for (i in math.indices){
        if (math[i] != 0){
            math[i]--
            when (i){
                0 -> dfs(n+1, x+list[n])
                1 -> dfs(n+1, x-list[n])
                2 -> dfs(n+1, x*list[n])
                3 -> dfs(n+1, x/list[n])
            }
            math[i]++ //작을때도 찾아야해서 다시 더해준다.
        }
    }
}