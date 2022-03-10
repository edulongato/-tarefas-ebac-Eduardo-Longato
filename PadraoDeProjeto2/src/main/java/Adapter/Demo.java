package Adapter;

import java.io.File;

public class Demo {

    public static void main(String[] args) {
        String caminhoFile = "/tmp/teste.txt";
        //Lib externa
        DropBox dropBox = new DropBox();
        IPersistencia iPersistencia = new DropBoxAdapter(dropBox);
        iPersistencia.gravar(new File(caminhoFile));
    }
}
