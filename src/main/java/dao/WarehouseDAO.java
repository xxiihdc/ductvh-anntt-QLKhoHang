/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;

/**
 *
 * @author ductr
 */
public abstract class WarehouseDAO <EntityType,KeyType>{
    public abstract void insert (EntityType entity);
    public abstract void update (EntityType entity);
    public abstract void delete (String id);
    public abstract List<EntityType> selectAll();
    public abstract EntityType selectByID(KeyType id);
    public abstract List<EntityType> selectBySql(String sql,Object...args);
}
