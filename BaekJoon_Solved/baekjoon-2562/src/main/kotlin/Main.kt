fun main(args: Array<String>) {
    var list = arrayListOf<Int>()

    repeat(9){
        list.add(readln().toInt())
    }
    println(list.max())
    println(list.indexOf(list.max())+1)
}