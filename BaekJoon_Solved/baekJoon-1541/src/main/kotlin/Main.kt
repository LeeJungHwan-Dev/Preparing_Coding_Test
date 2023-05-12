import kotlin.math.sign

fun main(args : Array<String>){
    var min = readln().split("-") // -로 1차 분리하고 만약 전부 +이면 아래에서 처리된다.
    var p = min[0].split("+").sumOf { it.toInt() } //전부 + 일 경우 1+2+3 => 6이 처리된다.

    for (i in 1 until min.size){ // 만약 전부 +일 경우 size가 0이니 작동 X
        p -= min[i].split("+").sumOf { it.toInt() }
        //최초에 +로 split 했을때 걸러지지 않은 다음 번지 + 식들을 split을 사용해 분리하고 sumOf로 더해 최종적으로 p에서 빼준다.
    }

    println(p)

}