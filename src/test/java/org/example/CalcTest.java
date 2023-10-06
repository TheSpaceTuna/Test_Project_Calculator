package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeAll
    public static void beforeAll(){
    System.out.println("Начало тестирования:\n");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Начинаю проверку:");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Тестирование закончено");
    }

    @AfterEach
    public  void afterEach(){
        System.out.println("Проверка закончена \n");
    }

    @ParameterizedTest(name = "#{index} Результат суммирования {0} и {1} равен {2}")
    @DisplayName("Проверка сложения")
    @CsvSource({"1, 2, 3", "-2, -1, -3", "-1, 1, 0", "0, 0, 0"})
    @Tag("summ")
    void summ(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Неверный ответ");
    }

    @ParameterizedTest(name = "#{index} Результат вычитания {0} из {1} равен {2}")
    @DisplayName("Проверка вычитания")
    @CsvSource({"10, 6, 4", "5, 10, -5", "10, 10, 0", "0, 0, 0"})
    @Tag("sub")
    void substraction(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.substraction(a, b);
        Assertions.assertEquals(expectedResult, result, "Неверный ответ");
    }

    //@Test
    //@DisplayName("Проверка умножения")
    //@Timeout(10)
    //void multiply() {
    //    Calc calc = new Calc();
    //   int result = calc.multiply(333, 3);
    //    Assertions.assertEquals(999, result, "Неверный ответ");
    //}

    //@Test
    //@DisplayName("Проверка деления")
    //@Timeout(10)
    //void divide() {
    //    Calc calc = new Calc();
    //    int result = calc.divide(999, 3);
    //    Assertions.assertEquals(333, result, "Неверный ответ");
    //}
}