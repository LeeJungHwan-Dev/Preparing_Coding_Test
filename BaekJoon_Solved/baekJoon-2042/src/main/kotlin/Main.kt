fun main(args: Array<String>) {
    var inputs = System.`in`.bufferedReader()
    var outpus = System.`out`.bufferedWriter()
    var str = StringBuilder()
    var reader = inputs.readLine().split(" ").map { it.toInt() }
    var repeatCounter = reader[0]
    var changeCounter = reader[1]
    var outCounter = reader[2]

    var list = Array(repeatCounter){0L}
    var list2 = Array(repeatCounter){0L}

    repeat(repeatCounter){
        list[it] = inputs.readLine().toLong()
    }

    repeat(changeCounter+outCounter){

        var line = inputs.readLine().split(" ").map { it.toLong() }
        var satus = line[0]
        var changeIndex = line[1]-1
        var changeValue = line[2]

        if (satus.toInt() == 1){
            list[changeIndex.toInt()] = changeValue

            list2[0] = list[0]!!

            for (i in 1 until repeatCounter){
                list2[i] = list2[i-1]!! + list[i]!!
            }

        }else{
            if(list2[changeIndex.toInt()-1] == null){
                str.append(list2[changeValue.toInt()-1]!!).append("\n")
            }else {
                str.append(list2[changeValue.toInt() - 1]!! - list2[changeIndex.toInt() - 1]!!).append("\n")
            }
        }
    }

    outpus.write(str.toString())

    inputs.close()
    outpus.close()

}