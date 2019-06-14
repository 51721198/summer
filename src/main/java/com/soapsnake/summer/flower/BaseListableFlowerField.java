package com.soapsnake.summer.flower;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BaseListableFlowerField extends AbstractFlowerField {

    private InputStream inputStream;

    public BaseListableFlowerField(String path) {
        File file = new File(path);
        try(FileInputStream inputStream = new FileInputStream(file)) {
            this.inputStream = inputStream;
            this.loadFlowerDefinitions(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFlowerDefinitions(FileInputStream inputStream) {
    }


}
