package com.genuineparts;

import java.util.ArrayList;
import java.util.Scanner;

public class RoverMain {
    public static void main(String[] args) {
        ArrayList<Rover> rovers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Grid grid = Instruction.parseGrid(scanner.nextLine());
        while(scanner.hasNext()) {
            Rover rover = new Rover(grid, Instruction.parsePosition(scanner.nextLine()));
            rovers.add(rover);
            rover.process(scanner.nextLine());
        }
        rovers.forEach(r -> System.out.println(r.getPosition()));
    }
}
