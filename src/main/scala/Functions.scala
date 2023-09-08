object Functions {

  def isEntireEqualToThirty(a: Int, b: Int): Boolean = {
    val sum: Int = a + b

    if (sum == 30 || a == 30 || b == 30) {
      true
    } else {
      false
    }
  }

  def swapFirstAndLast(s: String): String = {
    if (s.length <= 1) {
      s
    } else {
      s.last + s.slice(1, s.length - 1) + s.head
    }
  }

  def containsValue(arr: Array[Int], value: Int): Boolean = {
    arr.contains(value)
  }

  def indexValue(arr: Array[Int], value: Int): String = {
    if (arr.contains(value)) {
      "Index is " + arr.indexOf(value).toString
    } else {
      "data isnt in the array"
    }
  }

  def removeDuplicates(arr: Array[String]): Array[String] = {
    arr.distinct
  }

  def maxProduct(nums: Array[Int]): Int = {
    val sortedNums = nums.sorted
    val productOfLargestNumbers = sortedNums(sortedNums.length - 1) * sortedNums(sortedNums.length - 2)
    val productOfSmallestNumbers = sortedNums(0) * sortedNums(1)

    Math.max(productOfLargestNumbers, productOfSmallestNumbers)
  }

  def minSumSubArray(nums: Array[Int], taille: Int): (Int, Int, Int) = {
    if (taille > nums.length) return (0, 0, 0)

    var currentSum = nums.slice(0, taille).sum
    var minSum = currentSum
    var startIndex = 0

    for (i <- taille until nums.length) {
      currentSum = currentSum - nums(i - taille) + nums(i)
      if (currentSum < minSum) {
        minSum = currentSum
        startIndex = i - taille + 1
      }
    }

    (startIndex, startIndex + taille - 1, minSum)
  }


}