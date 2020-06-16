package org.example;

import org.example.service.CalcService;
import org.example.util.Writer;

import java.util.ArrayList;
import java.util.List;

public class History {
    private CalcService calcService;

    private List<Object> listHistory = new ArrayList<Object>();

    private void history(Object result) {
        listHistory.add(result);
        Writer.write(listHistory);
    }
}
