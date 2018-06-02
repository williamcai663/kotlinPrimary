package io.terminus.kotlin.main

fun main(args: Array<String>) {
    val numbers= listOf(1,2,4,6,8,9)
    println("the 偶數：${numbers.filter {it%2==0}.count()}")
    println("the 奇数：${numbers.filter {it%2!=0}.count()}")

}