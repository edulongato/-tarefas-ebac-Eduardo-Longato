package Adapter;

import java.io.File;

public interface IPersistencia {

    void gravar(File file);
    File ler(String id);
}
