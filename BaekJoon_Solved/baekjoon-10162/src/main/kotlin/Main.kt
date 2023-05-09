fun main(args: Array<String>) {
    var (a,b,c) = arrayOf(300,60,10) // 각 시간 저장 변수 a,b,c
    var (count1,count2,count3) = arrayOf(0,0,0) // 각 버튼 클릭 횟수 c1,c2,c3


    var inputNum = readln().toInt() // 시간 입력 받기

    while (true){
        if (inputNum - a >= 0){ // 5분을 뺐을때 0보다 크거나 같으면 c1 ++
            inputNum -= a
            count1++
        }else if(inputNum - b >= 0){ // 1분을 뺐을때 0보다 크거나 같으면 c2++
            inputNum -= b
            count2++
        }else if(inputNum - c >= 0){ // 10초를 뺐을때 0보다 크거나 같으면 c3++
            inputNum -= c
            count3++
        }else{
            if (inputNum == 0){// 올바르게 최소 조작 버튼 값이 구해졌을때
                println("$count1 $count2 $count3") // 최소 조작 버튼 개수 출력
                break
            }else{ // 올바르지 않게 구해졌을때
                println(-1) // -1 출력
                break
            }
        }
    }


}