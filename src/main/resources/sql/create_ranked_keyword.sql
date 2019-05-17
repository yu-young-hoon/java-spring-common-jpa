CREATE TABLE `yh_youtube`.`ranked_keyword` (
  `ranked_keyword_id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `ranked_keyword_type` VARCHAR(10) NOT NULL,
  `start_at` DATE NOT NULL,
  `end_at` DATE NOT NULL,
  `keyword` VARCHAR(45) NOT NULL,
  `value` INT NOT NULL,
  `created_at` DATETIME NOT NULL,
  `modified_at` DATETIME NOT NULL,
  PRIMARY KEY (`ranked_keyword_id`));
