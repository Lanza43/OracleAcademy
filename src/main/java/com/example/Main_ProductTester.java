package com.example;

import com.example.Alejandro_Mora.*;
import java.util.Scanner;

public class Main_ProductTester {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            Product Product1 = new Product();

            System.out.println("\nProducto 1 = " + Product1 + "\n");

            int NewProduct = 0;

            while (NewProduct < 1) {
                System.out.println("Desea agregar un producto nuevo?: (si/no):");
                String Continue = input.next();

                switch (Continue) {
                    case "si":
                        System.out.println("\nIngrese el nombre del producto:");
                        String nameProduct = input.next();
                        System.out.println("\nIngrese las unidades que desea llevar:");
                        int unitProduct = input.nextInt();
                        System.out.println("\nIngrese la cantidad de unidades en el inventario:");
                        int inventoryUnitsProduct = input.nextInt();
                        System.out.println("\nIngrese el precio del producto:");
                        double priceProduct = input.nextDouble();

                        Product a = new Product();
                        a.setItemName(nameProduct);
                        a.setItemUnits(unitProduct);
                        a.setExitentUnits(inventoryUnitsProduct);
                        a.setPrice(priceProduct);
                        System.out.println(a);
                        break;

                    case "no":
                        NewProduct += 1;
                        System.out.println("\nTermino el programa! :P");
                    default:
                        break;
                }
            }
        }
    }
}