fun main(args: Array<String>) {
    var outs = System.`out`.bufferedWriter()
    var inputs = System.`in`.bufferedReader()
    var str = StringBuilder()
    var count = inputs.readLine().toInt()

    repeat(count){
        var list = inputs.readLine().split(" ").map { it.toInt() }

        str.append(list.sorted().reversed()[2]).append("\n")
    }

    outs.write(str.toString())
    outs.close()
    inputs.close()
}