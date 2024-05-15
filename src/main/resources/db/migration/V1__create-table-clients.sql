CREATE TABLE clients(

    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    address  VARCHAR(100) NOT NULL,
    phone VARCHAR(10) NOT NULL,

    PRIMARY KEY (id)


);