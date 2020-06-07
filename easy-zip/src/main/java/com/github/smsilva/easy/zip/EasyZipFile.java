package com.github.smsilva.easy.zip;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class EasyZipFile {

    private Map<String, File> files;
    private File zipFile;

    public EasyZipFile(File zipFile) {
        this.zipFile = zipFile;
    }

    public EasyZipFile add(File file) {

        return this;
    }

    public EasyZipFile zip() throws IOException {
        zipFile.createNewFile();
        return this;
    }

}
