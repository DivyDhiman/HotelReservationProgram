CREATE TABLE IF NOT EXISTS room_type (
    id INT(10) UNSIGNED UNIQUE NOT NULL AUTO_INCREMENT,
    type VARCHAR(32) NOT NULL,
    description VARCHAR(256),
    image VARCHAR(256),
    quantity INT(10) UNSIGNED DEFAULT 0,
    price decimal(12,2) UNSIGNED NOT NULL,
    created_at BIGINT UNSIGNED NOT NULL,
    updated_at BIGINT UNSIGNED NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;