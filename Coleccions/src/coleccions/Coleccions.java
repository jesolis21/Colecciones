/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coleccions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Coleccions {
    public static void main(String[] args) {
        // Crear un diccionario Español-Inglés utilizando un HashMap
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("manzana", "apple");
        diccionario.put("libro", "book");
        diccionario.put("agua", "water");
        diccionario.put("sol", "sun");
        diccionario.put("amigo", "friend");
        diccionario.put("rojo", "red");
        diccionario.put("verde", "green");
        diccionario.put("jugar", "play");
        diccionario.put("comer", "eat");
        diccionario.put("trabajo", "work");
        diccionario.put("estudiar", "study");
        diccionario.put("música", "music");
        diccionario.put("tiempo", "time");
        diccionario.put("bienvenido", "welcome");
        diccionario.put("hermano", "brother");
        diccionario.put("comida", "food");
        diccionario.put("nadar", "swim");
        diccionario.put("cielo", "sky");

        // Solicitar al usuario una palabra en español
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra en español: ");
        String palabraEspanol = scanner.nextLine();

        // Buscar la traducción de la palabra en el diccionario
        String traduccion = diccionario.get(palabraEspanol);

        if (traduccion != null) {
            System.out.println("La traducción al inglés de '" + palabraEspanol + "' es: " + traduccion);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }
    }
}
