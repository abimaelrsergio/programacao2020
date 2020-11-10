package br.com.estacio.ads;

import java.util.*;

public class FuncionarioTestDrive {
    public static void main(String[] args) {
        Collection<String> funcionarios = new HashSet<>();
        funcionarios.add("Abimael Sergio");
        funcionarios.add("André Godoi");
        funcionarios.add("Matheus Silva");
        funcionarios.add("Rodolfo");
        funcionarios.add("Mario");
        funcionarios.add("Miguel");
        List<String> newFunc = new ArrayList<>(funcionarios);
        System.out.println(newFunc.get(1));
        Collections.sort(newFunc);
        System.out.println(newFunc);
    }
}
