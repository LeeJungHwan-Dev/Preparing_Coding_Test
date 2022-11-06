fun main(args: Array<String>) {

    var info = readLine()!!.split(" ").map { it.toInt() }
    var numberList = ArrayList<Int>()
    numberList.add(0)
    numberList = readLine()!!.split(" ").map { it.toInt() } as ArrayList<Int>

    var sumList = ArrayList<Int>()

    sumList.add(0)
    sumNumber(numberList,sumList)


    for(i in 1 .. info[1]){
        var indexNumber = readLine()!!.split(" ").map { it.toInt() }

        getNumber(sumList,indexNumber)

    }


}

fun sumNumber(numberList : List<Int> , sumList : ArrayList<Int>){

    sumList.add(numberList.get(0))

    for(i in 1..numberList.size-1){
        sumList.add(sumList.get(i)+numberList.get(i))
    }

}

fun getNumber(sumList : ArrayList<Int> , indexNumber : List<Int>){

    var num1 : Int = indexNumber.get(0) -1
    var num2 : Int = indexNumber.get(1)


    println(sumList.get(num2) - sumList.get( num1 ))


}

/**
 * 메모리초과와 시간초과로 괴롭힌 문제
 * 핵심은 부분합
 *
 * 처음 로직 완전 탐색으로 매번 0 ~ x 번까지 더해서 구현 -> 시간초과
 * 테이블위에 미리 2차원 배열로 각 열과행을 더해 값을 가져오기 -> 메모리초과
 *
 * 1차원 배열에 첫 자리 더한값과 다음 넘버 리스트값을 더해 배열에 기록 후 가져오기 -> 통과
 *
 * */