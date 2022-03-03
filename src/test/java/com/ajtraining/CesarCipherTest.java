package com.ajtraining;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CesarCipherTest {

    private static final String ENCRYPTED_HELLO_WORLD = "KHOORZRUOG";
    private static final String DECRYPTED_HELLO_WORLD = "HELLOWORLD";

    @Test
    void encode() {
        assertEquals(ENCRYPTED_HELLO_WORLD, CesarCipher.encode(DECRYPTED_HELLO_WORLD));
    }

    @Test
    void encode_lowerCase() {
        assertEquals(ENCRYPTED_HELLO_WORLD.toLowerCase(), CesarCipher.encode(DECRYPTED_HELLO_WORLD.toLowerCase()));
    }
}