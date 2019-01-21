create table master_data_toko
(
    id      varchar(64)     not null primary key,
    karyawan    varchar(100)    not null,
    id_transaksi   varchar(100)    not null,
)   engine = InnoDB;

insert into master_data_toko(id, karyawan, id_transaksi) values
('001', 'Dukun', '001'),
('002', 'Ukuy', '002');