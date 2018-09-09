package com.frg0.caviar.models.caviar;

import org.springframework.data.annotation.Id;

public class Caviar {
    @Id
    private int id;
    private String name;

    public Caviar() {
    }

    public Caviar(int id) {
        this.id = id;
    }
}
