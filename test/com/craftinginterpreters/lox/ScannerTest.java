package com.craftinginterpreters.lox;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScannerTest {

    @Test
    void testScanner() {
        Scanner scan = new Scanner("!=");

        List<Token> tokens = scan.scanTokens();

        assertEquals(TokenType.BANG_EQUAL,tokens.getFirst().type);
    }

}