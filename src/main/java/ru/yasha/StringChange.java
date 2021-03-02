package ru.yasha;

import org.springframework.stereotype.Service;

@Service
public class StringChange {
    public String   change(String str) {
        return str.toLowerCase();
    }
}
