fun main(args: Array<String>) {
    var command = readln().split(" ").map{it.toInt()}
    var list = ArrayList<Int>(command[0])
    var index = 0
    var coin = 0
    var money = 0

    repeat(command[0]){
        var num = readln().toInt()
        list.add(num)
    }
    list.reverse()

    while (true){
        if(money == command[1]){
            break
        }else{
            if(list[index] + money <= command[1]){
                money += list[index]
                coin++
            }else{
                index++
            }
        }
    }

    println(coin)

}