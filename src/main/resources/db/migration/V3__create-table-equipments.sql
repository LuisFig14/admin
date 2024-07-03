CREATE TABLE equipments(

    id_equipment BIGINT NOT NULL AUTO_INCREMENT,
    description VARCHAR(100) NOT NULL,
    brand VARCHAR(50) NOT NULL,
    model VARCHAR(50) NOT NULL,
    serial_number VARCHAR(50) NOT NULL,
    location VARCHAR(50) NOT NULL,

    PRIMARY KEY(id_equipment)

)