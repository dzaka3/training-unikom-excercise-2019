package com.multipolar.bootcamp.spring.appecommerce.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "daftarBarang")
@Entity
@Table(name = "toko")
public class Toko {

    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "karyawan", nullable = false)
    private String nama;

    @JsonIgnore
    @OneToMany(mappedBy = "toko")
    private List<Produk> daftarProduk = new ArrayList<>();
}
