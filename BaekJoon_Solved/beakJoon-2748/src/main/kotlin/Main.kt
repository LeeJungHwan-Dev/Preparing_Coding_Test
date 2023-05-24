var map = HashMap<Int,Long>()
fun main(args: Array<String>) {
    var input = readln().toInt()

    println(fibo(input))

}

fun fibo(i : Int) : Long{
    if(i <= 1){
        return i.toLong()
    }else {
        if (map.containsKey(i)) {
            return map[i]!!
        } else {
            map[i] = fibo(i - 1) + fibo(i - 2)
            return map[i]!!
        }
    }

}