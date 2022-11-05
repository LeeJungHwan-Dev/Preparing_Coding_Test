fun main(args: Array<String>) {

    var count : Int = readLine()!!.toInt() // 처음 입력받을 횟수
    var numberList : String = readLine().toString() // 입력 받을 문자열
    var result : Int = 0 // 결과값

    for (i in 0 until(count)){
        result += Integer.parseInt(numberList!!.get(i).toString())
    }

    /**
     ******* 로직 *******
     * 해당 문제를 접근한 방법은 처음에 입력받을 문자 갯수를 변수에 저장하고
     * 이후 입력받은 문자를 for문을 사용하여 한글자씩 순회하며 result값에 더한후
     * 값을 출력하면 해결되는 문제이다.
     *
     * */

    print(result)


}