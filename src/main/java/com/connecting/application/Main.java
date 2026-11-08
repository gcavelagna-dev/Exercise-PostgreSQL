package com.connecting.application;

import com.connecting.dao.CostumerDAO;
import com.connecting.dao.CostumerDAOImpl;
import com.connecting.model.Costumer;
import com.connecting.shared.dao.EmailAlreadyExistsException;

public class Main {

    public static void main(String[] args){
        System.out.println("\ninitializing database...");
        time(1000);
        System.out.println("...");
        time(1000);
        System.out.println("...");

        Costumer giovanni = new Costumer("Pedro de Coveiros da Silva ", "pedrin.matador@gmail.com");

        CostumerDAO dao = new CostumerDAOImpl();

        try{
            dao.save(giovanni);
            System.out.println("Successfully loaded client.");
        } catch (EmailAlreadyExistsException e){
            System.err.println(e.getMessage());
        } catch(Exception e) {
            System.err.println("An error occurred during execution: " + e.getMessage());
        }
    }

    public static void time(int pause){

        try {
            Thread.sleep(pause);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("The system pause was interrupted.", e);
        }
    }
}
