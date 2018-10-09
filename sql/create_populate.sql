/*
Created: 17-Aug-15
Modified: 06-Sep-15
Model: IKM
Database: MySQL 5.1
*/



-- Create tables section -------------------------------------------------

CREATE TABLE category
(
  id Int NOT NULL AUTO_INCREMENT,
  category_name Varchar(128),
  selected Int,
 PRIMARY KEY (id)
);

INSERT INTO category(
   category_name
  ,selected
) VALUES (
  'All Categories'
  ,1
);
INSERT INTO category(
   category_name
  ,selected
) VALUES (
  'Bridal'
  ,0
);
INSERT INTO category(
   category_name
  ,selected
) VALUES (
  'Catering'
  ,0
);
INSERT INTO category(
   category_name
  ,selected
) VALUES (
  'Dance & Choreography'
  ,0
);
INSERT INTO category(
   category_name
  ,selected
) VALUES (
  'Decoration & Lightning'
  ,0
);

INSERT INTO category(
   category_name
  ,selected
) VALUES (
  'Dress & Attire'
  ,0
);

INSERT INTO category(
   category_name
  ,selected
) VALUES (
  'Entertainment ( MC )'
  ,0
);

INSERT INTO category(
   category_name
  ,selected
) VALUES (
  'Entertainment ( DJ )'
  ,0
);

INSERT INTO category(
   category_name
  ,selected
) VALUES (
  'Aksesori Pernikahan'
  ,0
);

INSERT INTO category(
   category_name
  ,selected
) VALUES (
  'Bulan Madu'
  ,0
);

CREATE TABLE country
(
  id Int NOT NULL AUTO_INCREMENT,
  country_name Varchar(128),
  selected Int,
 PRIMARY KEY (id)
);

INSERT INTO country(
   country_name
  ,selected
) VALUES (
  'Indonesia'
  ,1
);

INSERT INTO country(
   country_name
  ,selected
) VALUES (
  'All Countries'
  ,0
);

INSERT INTO country(
   country_name
  ,selected
) VALUES (
  'Albania'
  ,0
);

INSERT INTO country(
   country_name
  ,selected
) VALUES (
  'Angola'
  ,0
);

INSERT INTO country(
   country_name
  ,selected
) VALUES (
  'Antigua'
  ,0
);

INSERT INTO country(
   country_name
  ,selected
) VALUES (
  'Argentina'
  ,0
);

INSERT INTO country(
   country_name
  ,selected
) VALUES (
  'Belgium'
  ,0
);

CREATE TABLE city
(
  id Int NOT NULL AUTO_INCREMENT,
  city_name Varchar(128),
  selected Int,
  countryId Int,
 PRIMARY KEY (id)
);

INSERT INTO city(
   city_name
  ,selected
  ,countryId
) VALUES (
  'Jakarta'
  ,1
  ,1
);

INSERT INTO city(
   city_name
  ,selected
  ,countryId
) VALUES (
  'All Cities'
  ,0
  ,0
);

INSERT INTO city(
   city_name
  ,selected
  ,countryId
) VALUES (
  'Bali'
  ,0
  ,1
);

INSERT INTO city(
   city_name
  ,selected
  ,countryId
) VALUES (
  'Medan'
  ,0
  ,1
);

CREATE TABLE carousel
(
  id Int NOT NULL AUTO_INCREMENT,
  image_name Varchar(128),
  status Int,
 PRIMARY KEY (id)
);

INSERT INTO carousel(
   image_name
  ,status
) VALUES (
  'lake.jpg'
  ,1
);

INSERT INTO carousel(
   image_name
  ,status
) VALUES (
  'lake.jpg'
  ,1
);

CREATE TABLE vendor
(
  id Int NOT NULL AUTO_INCREMENT,
  urlProfileImage Varchar(128),
  vendorName Varchar(128),
  countReviews Varchar(128),
  categoryName Varchar(128),
  categoryId Int,
  cityName Varchar(128),
  cityId Int,  
  status Int,
 PRIMARY KEY (id)
);

CREATE TABLE project
(
  id Int NOT NULL AUTO_INCREMENT,
  urlImageProject Varchar(128),
  titleProject Varchar(128),
  vendorId Int,
 PRIMARY KEY (id)
);

INSERT INTO vendor(
   urlProfileImage
  ,vendorName
  ,countReviews
  ,categoryName
  ,categoryId
  ,cityName
  ,cityId
  ,status
) VALUES (
  '1.jpg'
  ,'Jova Music'
  ,'32'
  ,'Entertainment ( MC )'
  ,7
  ,'Jakarta'
  ,1
  ,1
);

INSERT INTO project(
   urlImageProject
  ,titleProject
  ,vendorId  
) VALUES (
  '1.jpg'
  ,'Michael Bubble - Everything'
  ,1  
);


INSERT INTO vendor(
   urlProfileImage
  ,vendorName
  ,countReviews
  ,categoryName
  ,categoryId
  ,cityName
  ,cityId
  ,status
) VALUES (
  '2.jpg'
  ,'Port Love Creative Studio'
  ,'16'
  ,'Entertainment ( MC )'
  ,7
  ,'Jakarta'
  ,1
  ,1
);

INSERT INTO project(
   urlImageProject
  ,titleProject
  ,vendorId  
) VALUES (
  '3.jpg'
  ,'Michael Bubble - Everything2'
  ,2  
);

CREATE TABLE venue
(
  id Int NOT NULL AUTO_INCREMENT,
  linkImageVenue Varchar(128),
  titleVenue Varchar(128),
  addressVenue Varchar(128),
  capacityVisitor Varchar(128),
  capacityParkir Varchar(128),
  luasBangunan Varchar(128),
  luasTanah Varchar(128),
  hargaVenue Varchar(128),
  idCity Int,
  idUserData Int,
  status Int,
  latitude double,
  longitude double,
 PRIMARY KEY (id)
);

INSERT INTO venue(
   linkImageVenue
  ,titleVenue
  ,addressVenue
  ,capacityVisitor
  ,capacityParkir
  ,luasBangunan
  ,luasTanah
  ,hargaVenue
  ,idCity
  ,status
  ,latitude
  ,longitude
  ,url4d
) VALUES (
  '3.jpg'
  ,'Balai Samudra'
  ,'Jalan Boulevard Barat No. 1, Kelapa Gading Barat, RT.2/RW.9, Kelapa Gading Barat, RT.2/RW.9, Klp. Gading Bar., Klp. Gading, Kota Jkt Utara, Daerah Khusus Ibukota Jakarta 14240'  
  ,'Kapasitas ruangan : 1500 tamu'
  ,'Kapasitas parkir : 1500 mobil'
  ,'Luas bangunan 500 m2'
  ,'Luas lahan 800 m2'
  ,'30000000'
  ,1
  ,1
  ,-6.1541491
  ,106.8893441
  
);

INSERT INTO venue(
   linkImageVenue
  ,titleVenue
  ,addressVenue
  ,capacityVisitor
  ,capacityParkir
  ,luasBangunan
  ,luasTanah
  ,hargaVenue
  ,idCity
  ,status
  ,latitude
  ,longitude
) VALUES (
  '3.jpg'
  ,'Balai Samudra'
  ,'Jalan Boulevard Barat No. 1, Kelapa Gading Barat, RT.2/RW.9, Kelapa Gading Barat, RT.2/RW.9, Klp. Gading Bar., Klp. Gading, Kota Jkt Utara, Daerah Khusus Ibukota Jakarta 14240'  
  ,'Kapasitas ruangan : 1500 tamu'
  ,'Kapasitas parkir : 1500 mobil'
  ,'Luas bangunan 500 m2'
  ,'Luas lahan 800 m2'
  ,'30000000'
  ,1
  ,1
  ,-6.1541491
  ,106.8893441
  
);



CREATE TABLE booking_date
(
  id Int NOT NULL AUTO_INCREMENT,
  bookingDate bigint NOT NULL,
  isDay Int NOT NULL,
  isNight Int NOT NULL,
  idVenue Int NOT NULL,
  bookingOn Datetime NOT NULL,
  namaPernikahan Varchar(128),
  namaPenanggungJawab1 Varchar(128),
  handPhone1 Varchar(128),
  namaPenanggungJawab2 Varchar(128),
  handPhone2 Varchar(128),
  userEmailBooking Varchar(128),
  status Int NOT NULL,
  createdOn Datetime NOT NULL,
  createdBy Varchar(128),
  updatedOn Datetime NOT NULL,
  updatedBy Varchar(128),
  fileNameImage Varchar(128),
 PRIMARY KEY (id)
);
-- 1534784400000

INSERT INTO booking_date(
   bookingDate
  ,isDay
  ,isNight
  ,idVenue
) VALUES (
  1534784400000
  ,1
  ,1
  ,1
);

INSERT INTO booking_date(
   bookingDate
  ,isDay
  ,isNight
  ,idVenue
) VALUES (
  1634784400000
  ,1
  ,1
  ,1
);

CREATE TABLE similar_venue
(
  id Int NOT NULL AUTO_INCREMENT,
  idPrimaryVenue int NOT NULL,
  idSimilarVenue int NOT NULL,
 PRIMARY KEY (id)
);

CREATE TABLE user_data
(
  id Int NOT NULL AUTO_INCREMENT,
  email Varchar(128) NOT NULL,
  password Varchar(80) NOT NULL,
  sessionData Varchar(80),
  sessionDate bigint,
  sessionOn Datetime,
  userType int NOT NULL,
 PRIMARY KEY (id)
);

INSERT INTO user_data(
   email
  ,password
  ,sessionData
  ,sessionDate
  ,sessionOn
) VALUES (
  'admin@gmail.com'
  ,'embadmin'
  ,'9999999999999'
  ,0
  ,null
);

insert into System_Setting(id, setting_name, setting_desc, setting_value, updated_by, updated_at)
values(4, 'TIMEOUT_LOGIN_USER', 'Define how many second user must login again', '300', 1, NOW());

-- Table User

CREATE TABLE User
(
  id Int NOT NULL AUTO_INCREMENT,
  kode_sekolah Varchar(64),
  nomor_induk Varchar(64),
  name Varchar(50) NOT NULL,
  password Varchar(80),
  user_type Varchar(32),
  status_user Int NOT NULL,
  created_on Datetime NOT NULL,
  updated_on Timestamp NOT NULL,
 PRIMARY KEY (id)
)
  COMMENT = 'status: 
0 pending
1 active
2 blocked

activate key : digunakan pada saat registration user, key activate di cocokan dengan yg di kirim dari email

session key: digunakan pada saat device req ke server '
;

-- Table Sekolah

CREATE TABLE Sekolah
(
  id Int NOT NULL AUTO_INCREMENT,
  kode_sekolah Varchar(64),
  nama_sekolah Varchar(64),
  created_on Datetime NOT NULL,
  updated_on Timestamp NOT NULL,
 PRIMARY KEY (id)
)
  COMMENT = 'status: 
0 pending
1 active
2 blocked

activate key : digunakan pada saat registration user, key activate di cocokan dengan yg di kirim dari email

session key: digunakan pada saat device req ke server '
;

-- Table Kelas

CREATE TABLE Kelas
(
  id Int NOT NULL AUTO_INCREMENT,
  kode_kelas Varchar(64),
  nama_kelas Varchar(64),
  created_on Datetime NOT NULL,
  updated_on Timestamp NOT NULL,
 PRIMARY KEY (id)
)
  COMMENT = 'status: 
0 pending
1 active
2 blocked

activate key : digunakan pada saat registration user, key activate di cocokan dengan yg di kirim dari email

session key: digunakan pada saat device req ke server '
;

-- Table user_sekolah_kelas

CREATE TABLE user_sekolah_kelas
(
  user_id Int NOT NULL,
  sekolah_id Int NOT NULL,
  kelas_id Int NOT NULL,
  subject_id Int
)
  COMMENT = 'status: 
0 pending
1 active
2 blocked

activate key : digunakan pada saat registration user, key activate di cocokan dengan yg di kirim dari email

session key: digunakan pada saat device req ke server '
;

-- Table agenda

CREATE TABLE agenda
(
  kode_kelas Varchar(64),
  nama_kelas Varchar(64),
  kode_sekolah Varchar(64),
  nama_sekolah Varchar(64),
  tanggal_agenda Datetime,
  isi_agenda Varchar(512),
  agenda_type Int,
  created_on Datetime NOT NULL,
  created_by Varchar(50) NOT NULL,
  updated_on Timestamp NOT NULL,
  updated_by Varchar(50) NOT NULL
)
  COMMENT = 'status: 
0 pending
1 active
2 blocked

activate key : digunakan pada saat registration user, key activate di cocokan dengan yg di kirim dari email

session key: digunakan pada saat device req ke server '
;

-- Table kalender_akademis

CREATE TABLE kalender_akademis
(
  kode_sekolah Varchar(64),
  tanggal_agenda Datetime,
  isi_agenda Varchar(512)
)
  COMMENT = 'status: 
0 pending
1 active
2 blocked

activate key : digunakan pada saat registration user, key activate di cocokan dengan yg di kirim dari email

session key: digunakan pada saat device req ke server '
;

-- Table message

CREATE TABLE message
(
  from_user_id Int,
  to_user_id Int,
  isi_message Varchar(512),
  is_read Int,
  created_on Datetime,
  updated_on Timestamp
)
  COMMENT = 'status: 
0 pending
1 active
2 blocked

activate key : digunakan pada saat registration user, key activate di cocokan dengan yg di kirim dari email

session key: digunakan pada saat device req ke server '
;

-- Table nilai

CREATE TABLE nilai
(
  id Int NOT NULL AUTO_INCREMENT,
  user_id Int,
  nama_test Varchar(512),
  nilai Bigint,
  created_on Datetime,
  updated_on Timestamp,
 PRIMARY KEY (id)
)
  COMMENT = 'status: 
0 pending
1 active
2 blocked

activate key : digunakan pada saat registration user, key activate di cocokan dengan yg di kirim dari email

session key: digunakan pada saat device req ke server '
;

-- Table subject

CREATE TABLE subject
(
  id Int NOT NULL AUTO_INCREMENT,
  subject_name Varchar(64),
  created_on Datetime NOT NULL,
  updated_on Timestamp NOT NULL,
 PRIMARY KEY (id)
)
  COMMENT = 'status: 
0 pending
1 active
2 blocked

activate key : digunakan pada saat registration user, key activate di cocokan dengan yg di kirim dari email

session key: digunakan pada saat device req ke server '
;



ALTER TABLE parkingonline.mall
 ADD mall_image VARCHAR(64) AFTER mall_phone;


INSERT INTO mall(
   mall_code
  ,mall_name
  ,mall_address
  ,mall_phone
  ,mall_image
  ,created_on
  ,created_by
  ,updated_on
  ,updated_by
) VALUES (
  'KOKAS-001'
  ,'Kota Casablanka'  -- mall_name - IN varchar(128)
  ,'Jalan Raya Tebet No 100'  -- mall_address - IN varchar(128)
  ,'021-55934854'  -- mall_phone - IN varchar(64)
  ,'kota_kasablanka'  -- mall_phone - IN varchar(64)
  ,CURRENT_TIMESTAMP -- created_on - IN timestamp
  ,'SYS'  -- created_by - IN varchar(128)
  ,CURRENT_TIMESTAMP -- updated_on - IN timestamp
  ,'SYS'  -- updated_by - IN varchar(128)
);

INSERT INTO mall_slots(
   mall_id
  ,slots_name
  ,slots_price_idr
  ,slots_status
  ,created_on
  ,created_by
  ,updated_on
  ,updated_by
) VALUES (
   1,'B1-A27'  -- slots_name - IN varchar(128)
  ,10000   -- slots_price_idr - IN bigint(20)
  ,0   -- slots_status - IN int(11)
  ,CURRENT_TIMESTAMP -- created_on - IN timestamp
  ,'SYS'  -- created_by - IN varchar(128)
  ,CURRENT_TIMESTAMP -- updated_on - IN timestamp
  ,'SYS'  -- updated_by - IN varchar(128)
);

INSERT INTO mall_slots(
   mall_id
  ,slots_name
  ,slots_price_idr
  ,slots_status
  ,created_on
  ,created_by
  ,updated_on
  ,updated_by
) VALUES (
   1,'B1-A28'  -- slots_name - IN varchar(128)
  ,10000   -- slots_price_idr - IN bigint(20)
  ,0   -- slots_status - IN int(11)
  ,CURRENT_TIMESTAMP -- created_on - IN timestamp
  ,'SYS'  -- created_by - IN varchar(128)
  ,CURRENT_TIMESTAMP -- updated_on - IN timestamp
  ,'SYS'  -- updated_by - IN varchar(128)
);

INSERT INTO mall_slots(
   mall_id
  ,slots_name
  ,slots_price_idr
  ,slots_status
  ,created_on
  ,created_by
  ,updated_on
  ,updated_by
) VALUES (
   1,'B1-A29'  -- slots_name - IN varchar(128)
  ,10000   -- slots_price_idr - IN bigint(20)
  ,0   -- slots_status - IN int(11)
  ,CURRENT_TIMESTAMP -- created_on - IN timestamp
  ,'SYS'  -- created_by - IN varchar(128)
  ,CURRENT_TIMESTAMP -- updated_on - IN timestamp
  ,'SYS'  -- updated_by - IN varchar(128)
);

INSERT INTO mall_slots(
   mall_id
  ,slots_name
  ,slots_price_idr
  ,slots_status
  ,created_on
  ,created_by
  ,updated_on
  ,updated_by
) VALUES (
   1,'B1-A30'  -- slots_name - IN varchar(128)
  ,10000   -- slots_price_idr - IN bigint(20)
  ,0   -- slots_status - IN int(11)
  ,CURRENT_TIMESTAMP -- created_on - IN timestamp
  ,'SYS'  -- created_by - IN varchar(128)
  ,CURRENT_TIMESTAMP -- updated_on - IN timestamp
  ,'SYS'  -- updated_by - IN varchar(128)
);
