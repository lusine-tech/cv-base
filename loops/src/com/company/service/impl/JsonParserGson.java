package com.company.service.impl;

import com.company.model.People;
import com.company.repository.FileRepository;
import com.company.service.JsonParser;
import com.google.gson.Gson;

import java.lang.reflect.Type;


public class JsonParserGson implements JsonParser {
    private Gson gson = new Gson();
    private FileRepository fileRepository = new FileRepository();



    @Override
    public String parseToJsonAndWriteInFile(People... o) {
        String str = "export const personList= " + gson.toJson(o);
        fileRepository.writeInFile(str);
        return str;
    }

    @Override
    public Object parseFromJson(String jsonStr, Class c) {
        return gson.fromJson(jsonStr, (Type)c);
    }
}

