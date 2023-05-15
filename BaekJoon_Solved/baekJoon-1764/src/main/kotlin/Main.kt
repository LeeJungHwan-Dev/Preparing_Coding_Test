fun main(args: Array<String>) {
    var size = readln().split(" ").map { it.toInt() }
    var notSee = HashSet<String>()
    var list = ArrayList<String>()
    var str = StringBuilder()
    var count = 0

    repeat(size[0]){
        notSee.add(readln())
    }

    repeat(size[1]){
        var item = readln()
        if (notSee.contains(item)){
            count++
            list.add(item)
        }
    }
    list.sort()

    list.forEach {
        str.append("$it\n")
    }

    println(count)
    println(str)



    when(size[0]){
        1 -> {println("1")}

    }

}
