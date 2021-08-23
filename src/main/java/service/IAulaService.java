/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Aula;
import java.util.List;

/**
 *
 * @author aguss
 */
public interface IAulaService {
    
    public List<Aula> listarAula();
    public void guardar(Aula aula);
    public Aula buscarPorId(Long id);
    public  void eliminar (Long id);
    
    
    
}
