package com.edu.cibertec.DAWI_CL3_AybarMarcial.Repository;

import com.edu.cibertec.DAWI_CL3_AybarMarcial.model.db.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByNomusuario(String nomusuario);
}