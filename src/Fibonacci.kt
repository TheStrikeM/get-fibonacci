fun main() {
    println(Fibonacci.getWithNaive(10))
    println(Fibonacci.getWithEffective(100000))
}

class Fibonacci {
    companion object {
//        O(2^n)
        fun getWithNaive(num: Int): Int {
            if (num <= 1) return num
            return getWithNaive(num - 1) + getWithNaive(num - 2)
        }

//        O(n)
        fun getWithEffective(num: Int): Long {
            var numArray = LongArray(num+1)
            numArray[0] = 0
            numArray[1] = 1
            for (index in 2 until numArray.size) numArray[index] = numArray[index - 1] + numArray[index - 2]
            return numArray[num]
        }
    }
}