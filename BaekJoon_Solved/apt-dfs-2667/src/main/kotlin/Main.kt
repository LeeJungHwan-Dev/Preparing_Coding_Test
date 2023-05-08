fun main(args : Array<String>){

    var command = readln().split(" ").map{ it.toInt() }
    //4 5 1입력을 받는 코드
    //4 : 정점의 개수 / 5: 간선의 개수 / 1 : 시작 인덱스

    var map = Array<MutableList<Int>>(command[0] + 1){mutableListOf()}
    var isCheck = Array(command[0] + 1){false}

    /**
     * 주의! 0을 사용하지 않으니 +1을 해서 초기화를 해야한다.
     *
     * 인접 리스트로 구현된 map 변수
     * 방문 확인을 위한 isCheck 변수
     */

    for(i in 0 until command[1]){
        var line = readln().split(" ").map{ it.toInt() }

        map[line[0]].add(line[1])
        map[line[1]].add(line[0])
    }

    /**
     * 간선의 수 만큼 입력을 받는다.
     * 1 - 2 / 2 - 1 식으로 리스트에 등록해 무방향 그래프를 대응한다.
     */

    for(i in map.indices){
        map[i].sort()
    }

    /**
     * why 정렬?
     * 정렬을 하지 않을 경우 노드의 방문 순서가 올바르게 작동하지 않습니다.
     * 고로 각 노드마다 정렬을 해줘야합니다.
     */

    dfs(map,isCheck,command[2])

}

fun dfs(map: Array<MutableList<Int>>, isCheck: Array<Boolean>, startIndex : Int){
    isCheck[startIndex] = true
    println("$startIndex ")

    for(i in map[startIndex]){
        if(!isCheck[i]){
            dfs(map,isCheck, i)
        }
    }

}