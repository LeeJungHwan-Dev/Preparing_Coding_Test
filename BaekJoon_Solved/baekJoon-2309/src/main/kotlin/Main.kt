fun main(args: Array<String>) {
    var list = ArrayList<Int>()
    var sum = list.sum()

    repeat(9){
        var num = readln().toInt()
        list.add(num)
    }


    repeat(9){
        var num2 = list[it]
        for (i2 in it+1 until 9){
            var num3 = list[i2] + num2

            if (sum - num3 == 100){
                println("찾음")
            }
        }
    }

    list.sort()

    list.forEach{
        println("$it")
    }

}