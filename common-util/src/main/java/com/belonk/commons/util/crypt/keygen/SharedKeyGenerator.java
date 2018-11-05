package com.belonk.commons.util.crypt.keygen;

/**
 * Key generator that simply returns the same key every time.
 *
 * @author Keith Donald
 * @author Annabelle Donald
 * @author Corgan Donald
 */
final class SharedKeyGenerator implements BytesKeyGenerator {

    private byte[] sharedKey;

    public SharedKeyGenerator(byte[] sharedKey) {
        this.sharedKey = sharedKey;
    }

    @Override
    public int getKeyLength() {
        return sharedKey.length;
    }

    @Override
    public byte[] generateKey() {
        return sharedKey;
    }
}