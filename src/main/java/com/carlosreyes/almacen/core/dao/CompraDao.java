package com.carlosreyes.almacen.core.dao;

import com.carlosreyes.almacen.core.model.Compra;
import java.util.List;

public interface CompraDao {
    
    public List<Compra> findAllCompra();

    public Compra findById(Long idCompra);

    public void saveCompra(Compra elemento);

    public void deleteCompra(Compra elemento);

    public void updateCompra(Compra elemento);
}
