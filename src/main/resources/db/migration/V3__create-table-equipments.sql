CREATE TABLE equipments(

    idEquipment BIGINT NOT NULL AUTO_INCREMENT,
    description VARCHAR(100) NOT NULL,
    brand VARCHAR(50) NOT NULL,
    model VARCHAR(50) NOT NULL,
    serialNumber VARCHAR(50) NOT NULL,
    location VARCHAR(50) NOT NULL,

    PRIMARY KEY (idEquipment)

)