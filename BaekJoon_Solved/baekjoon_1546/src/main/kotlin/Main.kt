fun main(args: Array<String>) {

    var count = readLine()!!.toInt() //입력받을 숫자열의 갯수
    var numberList = readLine()!!.split(" ").map { it.toFloat() } // 입력받는 숫자열 리스트
    var result : Float = 0.0f // 결과값

    for (i in 0 until count){

        result += numberList.get(i)

    }

    print("${ (((result / numberList.maxOf { it }) * 100) / count)}")

    /**
     ****** 로직 *****
     * 이 문제의 핵심은 float 리스트를 입력 받는것
     * 또한, max가 아닌 maxOf를 사용해 baekjoon error를 넘어가는 것이 핵심이다.
     *
     * 문제는 각 평균 즉, ( 원점 / max점수 * 100 ) + ... ) / 과목수 라는 공식이 생긴다.
     * 이는 원점을 전부 더하여 max점수를 나누고 * 100 / 과목수를 하면 쉽게 해결할 수 있는 문제이다.
     *
     * */


}