var que = ArrayDeque<Int>()
fun main(args: Array<String>) {
    var str = readln()
    var count = 0

    str.forEach {
        if(it.toString().toInt() == 6 || it.toString().toInt() == 9){
            if(!que.contains(6) && !que.contains(9)){
                resetQue()
                que.remove(it.toString().toInt())
                count++
            }else{
                if (que.contains(6)){
                    que.remove(6)
                }else{
                    que.remove(9)
                }
            }
        }else {
            if(!que.contains(it.toString().toInt())){
                resetQue()
                que.remove(it.toString().toInt())
                count++
            }else{
                que.remove(it.toString().toInt())
            }
        }
    }

    print(count)


}

fun resetQue(){
    repeat(10){
        que.add(it)
    }
}