package com.example.demo.domain.model.compositekeys;

import java.io.Serializable;
import java.util.UUID;

public class KeyMovieUser implements Serializable {
    public UUID movieid;
    public UUID userid;
}
