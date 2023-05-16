fun main(args: Array<String>) {
    var num = readln().toInt()
    var num2 = readln().toInt()
    var list = ArrayList<Int>()

    for (i in num .. num2){
        var isTrue = true

        for (i2 in 2 until i){
            if (i % i2 == 0){
                isTrue = false
            }
        }

        if (i >= 2 && isTrue){
            list.add(i)
        }
    }

    if (list.size == 0){
        println(-1)
    }else {
        println(list.sum())
        println(list.min())
    }

}