fun main(args: Array<String>) {
    readln()
    var line = readln().split(" ").map { it.toInt() }
    var count = 0

    line.forEach {
        var istrue = true

        for (i in 2 until it){
            if(it % i == 0){
                istrue = false
                break
            }
        }

        if (it >= 2 && istrue){
            count++
        }
    }

    println(count)

}