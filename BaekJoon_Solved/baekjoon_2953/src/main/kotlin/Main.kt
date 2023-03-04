fun main(args: Array<String>) {
    val row = 5
    val col = 4
    var count = 0

    var arr = Array(row){IntArray(col)}
    var list = ArrayList<Int>()

    for(i in 0 until row){
        var list = readln().split(" ")

        for(i2 in 0 until col){
            arr[i][i2] = list[i2].toInt()
        }
    }

    arr.forEach { it ->
        var number = 0
        it.forEach {
            number += it
        }
        list.add(count,number)
        count++
    }

    print("${list.indexOf(list.max())+1} ${list.max()}")

}