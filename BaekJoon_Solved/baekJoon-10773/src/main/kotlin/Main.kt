import java.util.*
fun main(args: Array<String>) {
    var stack = Stack<Int>() //Java 라이브러리를 활용한 Stack 객체 생성
    var size = readln().toInt() // 입력 받을 횟수 입력

    for (i in 0 until size){ // 입력 받은 문제 만큼 for문 반복
        var command = readln().toInt() // 각 라인마다 숫자를 입력받는다.

        if (command != 0){ // 0이 아닐 경우 stack에 추가
            stack.add(command)
        }else{
            stack.pop() // 0일경우 가장 최근 LIFO 특성을 이용해 맨 위의 숫자 삭제
        }

    }

    println(stack.sum()) // 전부 더한 값 출력

}