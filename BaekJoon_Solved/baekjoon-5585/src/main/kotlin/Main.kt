fun main(args: Array<String>) {
    var (a,b,c,d,e) = arrayOf(500,100,50,10,5) // 잔돈 종류
    var f = 1 // 잔돈 종류
    var count = 0 // 총 잔돈 개수

    var money = 1000 - readln().toInt() // 1000원에서 물건 가격을 뺀다.

    while (true){
        if (money - a >= 0){ // 제일 큰 500원 부터 뺀다.
            money -= a
            count++
        }else if (money - b >= 0){ // 그 다음으르 큰 100원을 뺀다.
            money -= b
            count++
        }else if (money - c >= 0){ // 그 다음으르 큰 50원을 뺀다.
            money -= c
            count++
        }else if (money - d >= 0){ // 그 다음으르 큰 10원을 뺀다.
            money -= d
            count++
        }else if (money - e >= 0){ // 그 다음으르 큰 5원을 뺀다.
            money -= e
            count++
        }else if (money - f >= 0){ // 그 다음으르 큰 1원을 뺀다.
            money -= f
            count++
        }else{ // 잔돈 갯수가 구해졌을때
            println(count)
            break
        }
    }


}