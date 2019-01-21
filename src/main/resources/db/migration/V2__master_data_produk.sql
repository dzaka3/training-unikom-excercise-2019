create table master_data_produk
(
    id      varchar(64)     not null primary key,
    nama    varchar(100)    not null,
    harga   varchar(100)    not null,
    stok    varchar(100)    not null,
)   engine = InnoDB;

insert into master_data_toko(id, nama, harga, stok) values
('001', 'Karpet', '300000', '10'),
('002', 'Handuk', '50000', '11'),
('003', 'Karpet', '300000', '12'),
('004', 'Handuk', '50000', '13');