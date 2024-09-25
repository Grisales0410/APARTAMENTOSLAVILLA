package org.example;

import org.example.MODELOS.Apartamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("\n DATOS APARTAMENTOS LA VILLA");

        Scanner lea = new Scanner(System.in);
        Apartamento apartamento = new Apartamento();

        System.out.print("Digita su id: ");
        apartamento.setIdApartamento(lea.nextLine());

        System.out.print("Digita la direccion: ");
        apartamento.setDireccion(lea.nextLine());

        System.out.print("Digita el estado: ");
        apartamento.setEstado(lea.nextLine());

        System.out.print("Digita el numero de habitaciones: ");
        apartamento.setNumeroHabitaciones(lea.nextInt());

        System.out.print("Digita el numero de baños: ");
        apartamento.setNumeroBanos(lea.nextInt());

        System.out.print("Digita el precio del alquiler: ");
        apartamento.setPrecioAlquiler(lea.nextDouble());


        System.out.print("Digita si hay estacionamiento disponible: ");
        apartamento.setEstacionamientoDisponible(lea.nextBoolean());

        System.out.print(apartamento);


    }
}