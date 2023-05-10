fun main(args: Array<String>) {
    var people = readln().toInt() // 사람수
    var count = 1 // 컵홀더 개수
    var sit = readln() // 자리 입력

    var list = arrayListOf("*") // 최초 맨 왼쪽 컵홀더 생성

    sit.forEach { // 문자열을 읽으며 각 커플석 / 솔로석에 따른 컵홀더 배치 및 자리 생성
        if(list.last() == "*" && it == 'L') {
            list.add(it.toString())
        }else if(list.last() == "L" && it == 'L'){
            list.add("L")
            list.add("*")
            count++
        }else if(list.last() != "*" && it == 'L'){
            list.add("*")
            list.add("$it")
            count++
        }else if(list.last() == "*" && it == 'S'){
            list.add(it.toString())
        }else if(list.last() != "*" && it == 'S'){
            list.add("*")
            list.add("$it")
            count++
        }
    }

    if(list.last() != "*") {
        list.add("*")
        count++
    }//마지막 자리에 컵홀더가 없다면 컵홀더 생성

    if (count >= people){ // 컵홀더가 사람수 보다 많으면 사람수 리턴
        println(people)
    }else{ // 컵홀더가 사람수 보다 적으면 컵홀더 개수 리턴
        println(count)
    }
}