package com.example.demo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileRoot = "C:\\Users\\juana\\Desktop\\DEV\\Proyectos\\Servidor\\demo\\Ejemplo.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileRoot))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}