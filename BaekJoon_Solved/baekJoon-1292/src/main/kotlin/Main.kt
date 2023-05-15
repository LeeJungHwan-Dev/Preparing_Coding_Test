fun main(args: Array<String>) {
    var n1 = readln().split(" ").map { it.toInt() }
    var list = ArrayList<Int>()
    var answer = 0

    for (i in 1 .. 100){
        repeat(i){
            list.add(i)
        }
    }

    for (i in n1[0]-1 until n1[1]){
        answer += list[i]
    }

    println(answer)

}