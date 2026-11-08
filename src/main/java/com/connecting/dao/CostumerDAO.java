package com.connecting.dao;

import com.connecting.model.Costumer;

public interface CostumerDAO {

    void save(Costumer costumer);

    Costumer findById(int id);
}
