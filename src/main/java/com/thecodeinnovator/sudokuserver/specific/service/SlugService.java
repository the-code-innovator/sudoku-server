package com.thecodeinnovator.sudokuserver.specific.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

import org.springframework.stereotype.Service;


@Service
public class SlugService {
    public String generateSlugIDFromHash(byte[] puzzleHash, byte[] positionHash, byte[] holeHash, int size) throws NoSuchAlgorithmException {
        // use shasum digest to get the hash for all the items and condense them to get the shasum
        
        byte[] netHashByteArray = new byte[(3 * puzzleHash.length) + 1];
        byte sizeByte = (byte) size;
        netHashByteArray[0] = sizeByte;
        for (int i = 0; i < puzzleHash.length; i++) {
            netHashByteArray[i + 1] = puzzleHash[i];
        }
        for (int i = 0; i < positionHash.length; i++) {
            netHashByteArray[i + puzzleHash.length + 1] = positionHash[i];
        }
        for (int i = 0; i < holeHash.length; i++) {
            netHashByteArray[i + puzzleHash.length + positionHash.length + 1] = holeHash[i];
        }

        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] digestByteArray = md.digest(netHashByteArray);
        String hexString = this.byteArray2Hex(digestByteArray);

        return hexString;
    }

    private String byteArray2Hex(byte[] hash) {
        try (Formatter formatter = new Formatter()) {
            for (byte b : hash) {
                formatter.format("%02x", b);
            }
            return formatter.toString();
        }
    }
}