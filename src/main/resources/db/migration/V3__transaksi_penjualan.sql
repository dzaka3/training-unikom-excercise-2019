create table transaction
(
  id              varchar(64) not null primary key,
  tanggal_beli  timestamp   not null default now()

) engine = InnoDB;

create table transaction_detail
(
  id             varchar(64) not null primary key,
  transaksi_id varchar(64) not null,
  barang_id        varchar(64) not null
) engine = InnoDB;