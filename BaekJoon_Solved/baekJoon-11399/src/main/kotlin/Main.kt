fun main(args: Array<String>) {
    var count = readln().toInt()
    var list = ArrayList<Int>(readln().split(" ").map{it.toInt()})

    list.sort()

    for (i in 1 until list.size){
        list[i] = list[i-1]+list[i]
    }

    println(list.sum())
}