import Functions.{containsValue, indexValue, isEntireEqualToThirty, maxProduct, minSumSubArray, removeDuplicates, swapFirstAndLast}

object Main {

  def main(args: Array[String]): Unit = {

    println(isEntireEqualToThirty(10, 20))
    println(swapFirstAndLast("1LASTTOTO2"))

    val numbers = Array(1, 2, 3, 4, 5)
    println(containsValue(numbers, 4))
    println(indexValue(numbers, 5))

    val strings = Array("apple", "banana", "apple", "orange", "banana", "grape")
    val uniqueStrings = removeDuplicates(strings)
    println(uniqueStrings.mkString(", "))

    val nums = Array(2, 3, 5, 7, -7, 5, 8, -5)
    println(maxProduct(nums))

    val nums2 = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val taille = 4
    val (start, end, sum) = minSumSubArray(nums2, taille)
    println(s"Sub-array size: $taille Sub-array from $start to $end and sum is: $sum")
  }
}