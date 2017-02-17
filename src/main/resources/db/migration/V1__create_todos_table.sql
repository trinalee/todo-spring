CREATE TABLE `todos` (
  `id`        INT           NOT NULL  AUTO_INCREMENT,
  `value`     VARCHAR(255)  NOT NULL,
  `completed` BOOLEAN       NOT NULL  DEFAULT FALSE,
  `version`   INT           NOT NULL  DEFAULT 0,
  `created`   TIMESTAMP     NOT NULL  DEFAULT NOW(),
  `modified`  TIMESTAMP     NOT NULL  DEFAULT NOW(),
  PRIMARY KEY (`id`));