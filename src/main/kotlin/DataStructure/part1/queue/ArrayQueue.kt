package DataStructure.part1.queue

class ArrayQueue(private val capacity: Int) {
    //enqueue
    //dequeue
    //isEmpty
    //isFull
    //peek
    //[0,0,0,0,0]
    //F R
    var items = arrayOfNulls<Int>(capacity)
    var rear = 0
    var front = 0
    var count = 0

    fun enqueue(item: Int) {
        if (isFull()) throw Exception()
        rear %= capacity
        items[rear++] = item

        count++
    }

    fun dequeue(): Int {
        if (isEmpty()) throw Exception()
        count--

        front %= capacity
        val item = items[front]
        items[front++] = 0

        return item!!
    }

    fun peek(): Int {
        if (isEmpty()) throw Exception()

        return items[front]!!
    }

    fun isEmpty(): Boolean {
        return count == 0
    }

    fun isFull(): Boolean {
        return count == capacity
    }

    override fun toString(): String {
        return items.toList().toString()
    }

}