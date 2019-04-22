package com.martinying.service;

import com.martinying.data.ExampleDao;
import com.martinying.model.ExampleModel;

public class ExampleService {
    private ExampleDao dao;

    public ExampleService(ExampleDao dao) {
        this.dao = dao;
    }
    public ExampleModel executeService(){
        return dao.getData();
    }
}
