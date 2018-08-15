-- MySQL Script generated by MySQL Workbench
-- Thu Jul 26 20:42:32 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema kino
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema kino
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `kino` DEFAULT CHARACTER SET utf8 ;
USE `kino` ;

-- -----------------------------------------------------
-- Table `kino`.`kino`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `kino`.`kino` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `nazwa` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `kino`.`filmy`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `kino`.`filmy` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `nazwa` VARCHAR(45) NOT NULL,
  `kino_ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_film_kino_idx` (`kino_ID` ASC),
  CONSTRAINT `fk_film_kino`
    FOREIGN KEY (`kino_ID`)
    REFERENCES `kino`.`kino` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SELECT * FROM kino;
SELECT * FROM filmy;
SELECT * FROM bilety;
-- -----------------------------------------------------
-- Table `kino`.`bilety`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `kino`.`bilety` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `ilosc` VARCHAR(45) NOT NULL,
  `filmy_ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_bilety_filmy1_idx` (`filmy_ID` ASC),
  CONSTRAINT `fk_bilety_filmy1`
    FOREIGN KEY (`filmy_ID`)
    REFERENCES `kino`.`filmy` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
