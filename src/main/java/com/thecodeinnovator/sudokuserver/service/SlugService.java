package com.thecodeinnovator.sudokuserver.service;

import org.springframework.stereotype.Service;


@Service
public class SlugService {
    public String generateSlugIDFromHash(Byte[] hole_hash, Byte[] position_hash, Byte[] puzzle_hash, int size) {
        // use shasum digest to get the hash for all the items and condense them to get the shasum
        return null;
    }
}