fun main(args: Array<String>) {
    var numList : List<String> = readln().split(' ')
    val work : Int = Integer.parseInt(numList[0])
    val back : Int = Integer.parseInt(numList[1])
    val distance : Int = Integer.parseInt(numList[2])

    print((distance - back-1) / (work - back)+1)
}