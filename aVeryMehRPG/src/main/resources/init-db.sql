CREATE TABLE `Room` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `max_capacity` int(11) DEFAULT NULL,
  `available` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1;

INSERT INTO `Room` (name, max_capacity, available)
VALUES ('Annex', 16, 1);
INSERT INTO `Room` (name, max_capacity, available)
VALUES ('Balcony', 24, 0);
INSERT INTO `Room` (name, max_capacity, available)
VALUES ('Penthouse', 50, 1);


CREATE TABLE `Bootcamp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `language` varchar(45) DEFAULT NULL,
  `teacher` varchar(45) DEFAULT NULL,
  `studentCount` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1;

INSERT INTO `Bootcamp` (language, teacher, studentCount)
VALUES ('Java', 'Antonella', 11);
INSERT INTO `Bootcamp` (language, teacher, studentCount)
VALUES ('JavaScript', 'Adam', 20);