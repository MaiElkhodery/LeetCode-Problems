class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
    val uniqueTriplets = mutableSetOf<List<Int>>()
    nums.sort()
    for(p in 0 until nums.size-2){
        if(p == 0 || (p > 0 && nums[p] != nums[p-1])){
            var left = p+1
            var right = nums.lastIndex

            while (left<right){
                val list = listOf(nums[p],nums[left],nums[right])
                when{
                    list.sum() > 0 -> right--
                    list.sum() < 0 -> left++
                    else -> {
                        uniqueTriplets.add(list)
                        left++
                        right--
                    }
                }
            }
        }
    }
    return uniqueTriplets.toList()
    }

}