/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3_Listo.Reto3_Listo;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 *
 * @author macbookpro
 */

@Repository
public class RepositorioQuadbike {
    
     
    @Autowired
    private InterfaceQuadbike crud;

    public List<Quadbike> getAll(){
        return (List<Quadbike>) crud.findAll();
    }

    public Optional<Quadbike> getQuadbike(int id){
        return crud.findById(id);
    }

    public Quadbike save(Quadbike quadbike){
        return crud.save(quadbike);
    }
    public void delete(Quadbike quadbike){
        crud.delete(quadbike);
    }
    
    
}
