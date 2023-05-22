fun main(args: Array<String>) {
    var setList = HashSet<Int>()

    repeat(10){
        setList.add(readln().toInt() % 42)
    }

    println(setList.size)


}