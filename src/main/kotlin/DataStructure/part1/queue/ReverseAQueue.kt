package DataStructure.part1.queue

import java.util.*

fun reverseQueue(queue: Queue<Int>): Queue<Int> {
    val stack  = Stack<Int>()

    while (!queue.isEmpty()) stack.push(queue.remove())
    while (!stack.isEmpty()) queue.add(stack.pop())

    return queue
}