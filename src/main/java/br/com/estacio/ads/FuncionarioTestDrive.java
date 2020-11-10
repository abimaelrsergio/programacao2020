package br.com.estacio.ads;

import java.util.HashSet;
import java.util.Set;

public class FuncionarioTestDrive {
    public static void main(String[] args) {
        Set<String> funcionarios = new HashSet<>();
        funcionarios.add("Abimael Sergio");
        funcionarios.add("André Godoi");
        funcionarios.add("Matheus Silva");
        System.out.println(funcionarios);
        for (String func : funcionarios) {
            System.out.println(func);
        }
        funcionarios.forEach(func -> {
            System.out.println(func);
        });
        boolean contem = funcionarios.contains("Abimael Sergio");
        System.out.println(contem);
    }
}
