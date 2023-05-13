fun main(args: Array<String>) {
    var count = readln().toInt()
    var list = ArrayList<Int>(readln().split(" ").map{it.toInt()}) // 이용시간

    list.sort() // 이용 시간 정렬

    for (i in 1 until list.size){ //정렬한 이용 시간을 전부 합함
        list[i] = list[i-1]+list[i]
    }

    println(list.sum())
}