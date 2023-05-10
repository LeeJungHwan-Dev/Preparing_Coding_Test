fun main(args: Array<String>) {

    var count = 1 // Case 카운트

    while (true){
        var time = 0 // 출력할 시간
        var line = readln().split(" ").map { it.toInt() }
        // 사용자 입력 P L V

        if(line[0] == 0 && line[1] == 0 && line[2] == 0){ // 0 0 0 일때 종료
            break
        }else{
            var campTime = line[1] - line[0] // L - P => 캠핑장 이용후 남은 쿨타임
            var totalTime = line[2] // 총 휴가 일수
            while (true){
                if (totalTime - line[0] >= 0){ // 총 휴가일수 - 사용가능일이 0보다 같거나 클경우
                    time += line[0] // 이용 가능 시간에 사용일을 더해준다.
                    totalTime -= line[0] // 휴가일수에서 이용 시간을 제외한다.

                    if(totalTime - campTime > 0){ // 캠핑 이용이 끝나고 쿨타임을 제외한다.
                        totalTime -= campTime // 남은 휴가일수에서 쿨타임을 뺀다.
                    }else{ // 이용 가능 휴가 일수보다 남은 이용 가능 시간은 클수 없기에 종료.
                        break
                    }
                }else if(totalTime - line[0] <= 0){ // 남은 휴가 일수가 이용 가능 시간보다 클 경우
                    time += totalTime // 남은 캠핑장 이용시간을 더하고 종료
                    break
                }
            }
            println("Case ${count++}: $time") // 출력
        }
    }
}