import java.lang.Exception

fun main(args: Array<String>) {
    var count = readln().split(" ").map { it.toInt() }
    var monster = count[0]
    var answerCounter = count[1]
    var map = HashMap<String,String>()
    var sc = System.`in`.bufferedReader()
    var out = System.`out`.bufferedWriter()
    var str = StringBuilder()

    repeat(monster){
       var name = readln()
       map[(it+1).toString()] = name
       map[name] = (it+1).toString()
    }

    repeat(answerCounter){
        var line = sc.readLine()
        str.append(map[line]).append("\n")
    }

    out.write(str.toString())

    sc.close()
    out.close()

}