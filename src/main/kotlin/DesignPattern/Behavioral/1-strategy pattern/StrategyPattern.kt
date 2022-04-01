package DesignPattern.Behavioral.`1-strategy pattern`

interface Strategy {
    fun execute(a: Int, b: Int): Int
}

class ConcreteStrategyAdd : Strategy {
    override fun execute(a: Int, b: Int): Int {
        return (a + b)
    }
}

class ConcreteStrategySubtract : Strategy {
    override fun execute(a: Int, b: Int): Int {
        return (a - b)
    }
}

class ConcreteStrategyMultiply : Strategy {
    override fun execute(a: Int, b: Int): Int {
        return (a * b)
    }
}

class Context {
    private lateinit var strategy: Strategy

    fun setStrategy(strategy: Strategy) {
        this.strategy = strategy
    }

    fun executeStrategy(a: Int, b: Int): Int {
        return strategy.execute(a, b)
    }

}

fun main() {
    var context = Context()
    context.setStrategy(ConcreteStrategyAdd())

    print(context.executeStrategy(1, 2))
}


