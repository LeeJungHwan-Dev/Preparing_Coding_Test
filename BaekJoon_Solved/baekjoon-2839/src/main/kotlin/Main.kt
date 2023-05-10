fun main(args: Array<String>) {
    var count = 0 // 봉지 수

    var weight = readln().toInt() // 설탕 무게

    while (true) {
        if (weight > 0) { // 아직 구할수 있는 상태일때
            if (weight % 5 == 0) {
                count += weight / 5
                println(count)
                break
            } else {
                count++
                weight -= 3
            }
        }else{
            if (weight == 0){ // 딱 떨어져 봉지 개수가 구해졌을때
                println(count)
                break
            }else {// 봉지 개수가 구할수 없을때
                println(-1)
                break
            }
        }
    }

    /**
     * 기존에는 앞에서 뺐지만
     * 작은 수를 빼고 큰 수를 나눠봄으로써 큰수로 나눠지면 해당 몫과 count를 더해
     * 답을 구하고, 제일 작은수로 뺐을때도 음수 단위로 넘어가면 구할 수 없으니 -1 출력
     * */
}