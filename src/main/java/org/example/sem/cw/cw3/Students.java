package org.example.sem.cw.cw3;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Students {
    private String surname;
    private int group;
    private int scholarship;
    private List<Integer> scores;

}

