package com.multipolar.bootcamp.spring.appecommerce.repository;

import com.multipolar.bootcamp.spring.appecommerce.entity.Pelanggan;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PelangganRepository extends CrudRepository<Pelanggan, String> {
    @Modifying
    @Query("update Pelanggan set nama = ?1 where id = ?2")
    int UpdateNamaPelanggan (String nama, String id);

    List<Pelanggan> findByNama (String nama);
}
