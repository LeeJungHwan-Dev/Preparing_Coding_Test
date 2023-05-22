import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

var train = HashMap<Int, Array<Int>>()

fun main(args: Array<String>) {
    var bf = BufferedWriter(OutputStreamWriter(System.out))
    var br = BufferedReader(InputStreamReader(System.`in`))
    var str = StringBuilder()

    var line = br.readLine().split(" ").map { it.toInt() }
    var trainSet = HashSet<List<Int>>()

    repeat(line[0]){
        var list = Array<Int>(20){0}
        train[it+1] = list
    }

    repeat(line[1]){
        var command = br.readLine().split(" ").map { it.toInt() }

        when(command[0]){
            1 -> {
                addPeople(command[1],command[2] -1)
            }
            2 -> {
                delPeople(command[1],command[2] -1)
            }
            3 -> {
                backPeople(command[1])
            }
            4 -> {
                pushPeople(command[1])
            }
        }
    }

    train.forEach {
        trainSet.add(it.value.toList())
    }

    str.append(trainSet.size)
    bf.write(str.toString())
    bf.close()
    br.close()

}

fun addPeople(trainNum : Int, setNum : Int){
    if(train[trainNum]!![setNum] == 0){
        train[trainNum]!![setNum] = 1
    }

}

fun delPeople(trainNum : Int, setNum : Int){
    if(train[trainNum]!![setNum] != 0){
        train[trainNum]!![setNum] = 0
    }
}

fun backPeople(trainNum : Int){
    for (i in 19 downTo  1){
        train[trainNum]!![i] = train[trainNum]!![i-1]
        train[trainNum]!![i-1] = 0
    }
}

fun pushPeople(trainNum : Int){
    for (i in 1 until 20){
        train[trainNum]!![i-1] = train[trainNum]!![i]
        train[trainNum]!![i] = 0
    }
}