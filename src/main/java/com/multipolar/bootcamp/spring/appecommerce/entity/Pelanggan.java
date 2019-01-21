package com.multipolar.bootcamp.spring.appecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@RestController
@Table(name = "pelanggan")
public class Pelanggan {

    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "nama", nullable = false)
    private String nama;

    @Column(name = "nomor_ktp", nullable = false, unique = true)
    private String nomor_ktp;

    @Type(type = "text")
    @Column(name = "alamat", nullable = false)
    private String alamat;
}
