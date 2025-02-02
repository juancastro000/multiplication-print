package dev.juancastro.multiplication;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {

    int n;
    List<String> tableList;

    public MultiplicationTable(int n) {

        this.n = n;
        this.tableList = new ArrayList<>();

    }

    public List<String> generateTable(){

        for (int i = 1; i <= 10; i++) {
            tableList.add(n + " x " + i + " = " + n*i);
        }

        return tableList;

    }



   
}
