fun main(args: Array<String>) {
    var size = readln() //아래와 같이 구현하면 사용하지 않음
    var hash = HashSet<Int>() // 중복을 제외한 HashSet<>()

    readln().split(" ").map { hash.add(it.toInt()) } // 확인을 위한 배열 작성

    var size2 = readln() //아래와 같이 구현하면 사용하지 않음

    readln().split(" ").map {// 확인이 필요한 배열을 받아 hash.contains()활용
        if (hash.contains(it.toInt())){ // contains는 시간복잡도가 O(1)이다. ArrayList / Array는 탐색 시간이 O(n)이므로 Hash 사용
            println(1)
        }else{
            println(0)
        }
    }

}