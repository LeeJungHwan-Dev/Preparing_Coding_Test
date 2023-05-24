fun main(args: Array<String>) {
    var list = intArrayOf(1,3,2,4,2)
    var math1 = intArrayOf(1,2,3,4,5)
    var math2 = intArrayOf(2,1,2,3,2,4,2,5)
    var math3 = intArrayOf(3,3,1,1,2,2,4,4,5,5)
    var rankList = ArrayList<Int>()
    var m1Score = 0
    var m2Score = 0
    var m3Score = 0
    var max = 0

    var rank = ArrayList<Int>()

    var listSize = list.size

    while (true){

        if (listSize >= math1.size){
            math1 += math1
        }else{
            break
        }

        if (listSize > math2.size){
            math2 += math2
        }

        if (listSize > math3.size){
            math3 += math3
        }
    }


    list.forEachIndexed{ it,item ->
        if(math1[it] == item){
            m1Score++
        }

        if(math2[it] == item){
            m2Score++
        }

        if (math3[it] == item){
            m3Score++
        }
    }

    rank.add(m1Score)
    rank.add(m2Score)
    rank.add(m3Score)

    println(rank.toList())

    max = rank.maxOf { it }

    rank.forEachIndexed {it,item ->
        if(item == max){
            rankList.add(it+1)
        }
    }

    println(rankList.toIntArray().toList())

}