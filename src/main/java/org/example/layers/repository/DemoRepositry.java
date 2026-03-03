package org.example.layers.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepositry {
    public String hello() {
        return "hello repository";
    }
}
