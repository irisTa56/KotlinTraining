package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

class SampleTest {/*
    @Test
    fun testWelcome() {
        welcome()

        // Example of test
        val expected = 1
        val actual = 1
        assertEquals(expected, actual, "[want] $expected [got] $actual")
    }

    @Test
    fun testHello() {
        hello()
    }

    @Test
    fun testFizzBuzz() {
        fizzBuzz()
        assertEquals(fizzBuzzAt(33), "Fizz")
        assertEquals(fizzBuzzAt(40), "Buzz")
        assertEquals(fizzBuzzAt(45), "FizzBuzz")
        assertEquals(fizzBuzzAt(49), "49")
    }

    @Test
    fun testIsLeapYear() {
        assertEquals(isLeapYear(1700), false)
        assertEquals(isLeapYear(1800), false)
        assertEquals(isLeapYear(1900), false)
        assertEquals(isLeapYear(2100), false)
        assertEquals(isLeapYear(2200), false)
        assertEquals(isLeapYear(2300), false)
        assertEquals(isLeapYear(2500), false)
        assertEquals(isLeapYear(2600), false)
        assertEquals(isLeapYear(1600), true)
        assertEquals(isLeapYear(2000), true)
        assertEquals(isLeapYear(2400), true)
    }

    @Test
    fun testPower() {
        assertEquals(power(1, 100), 1)
        assertEquals(power(2, 10), 1024)
        assertEquals(power(3, 5), 243)
        assertEquals(power(4, 3), 64)
    }

    @Test
    fun testExtendedInt() {
        val a = 5
        assertEquals(a.isOdd(), true)
        assertEquals(a.isEven(), false)
    }

    @Test
    fun testDice() {
        val d = Dice(16)

        for (i in 1..100) {
            assert(d.roll() in 1..16)
        }

        try {
            println(d.roll())
        } catch (e: Throwable) {
            println(e.message)
        }
    }

    @Test
    fun testMyCustomClass() {
        val p = MyCustomClass()
        p.propertyWithCounter = 123
        p.propertyWithCounter = 456
        p.propertyWithCounter = 789
        assertEquals(p.counter, 3)
    }

    @Test
    fun testNabeAtsu() {
        val n = NabeAtsu()
        for (i in 1..100) {
            println(n.next())
        }
    }*/

    @Test
    fun testSendMessageToClient() {
        val m = GMailer()

        val c1 = Client(PersonalInfo("John"))

        sendMessageToClient(c1, "hello", m)

        val c2 = Client(PersonalInfo())

        sendMessageToClient(c2, null, m)
    }
}