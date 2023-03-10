
package com.portfolio.pc.repository;


import com.portfolio.pc.entity.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository<Proyecto,Integer> {
     public Optional<Proyecto> findByProyecto(String proyecto);
    public boolean existsByProyecto(String proyecto);
    public Optional<Proyecto> findById(int id);
    public boolean existsById(int id);
}
