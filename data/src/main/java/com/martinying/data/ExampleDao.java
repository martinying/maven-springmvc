package com.martinying.data;

import com.martinying.model.ExampleModel;

import java.time.LocalDate;

public class ExampleDao {
    private ExampleModel em;

    public ExampleDao(ExampleModel em) {
        this.em = em;
    }

    public ExampleModel getData(){
        em.setAttribute("Integrated Test Attribute");
        return em;
    }
}