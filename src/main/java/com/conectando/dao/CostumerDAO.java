package com.conectando.dao;

import com.conectando.model.Costumer;

public interface CostumerDAO {

    void save(Costumer costumer);

    Costumer findById(int id);
}
