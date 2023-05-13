fun main(args: Array<String>) {
    var list = arrayOf(1,2,3,4,5)

    list.forEachIndexed{ i, item ->
        println("인덱스 : $i 값 : $item")
    }
}