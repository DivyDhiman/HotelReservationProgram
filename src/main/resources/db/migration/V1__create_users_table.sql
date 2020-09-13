CREATE TABLE IF NOT EXISTS users (
  id INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  username VARCHAR(32) NOT NULL UNIQUE,
  password VARCHAR(64) NOT NULL,
  enabled BOOLEAN NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;