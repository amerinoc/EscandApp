-- SE INDICA QUE SE DESACTIVEN LOS CHEQUEOS DE INTEGRIDAD REFERENCIALES
 SET FOREIGN_KEY_CHECKS = 0;
 ALTER TABLE RECIPE_INGREDIENT
  DROP FOREIGN KEY FK_1;
 ALTER TABLE RECIPE_INGREDIENT
  DROP FOREIGN KEY FK_2;
 ALTER TABLE INGREDIENT_TYPE
  DROP FOREIGN KEY FK_1;
 DROP TABLE `RECIPE_INGREDIENT`;
 DROP TABLE `INGREDIENT_TYPE`;
 DROP TABLE `INGREDIENT`;
 DROP TABLE `RECIPE`;
 DROP TABLE `INGREDIENT_RECIPE_INGREDIENTFK`;
 DROP TABLE `RECIPE_INGREDIENT_RECIPEFK`;
-- SE ACTIVAN LOS CHEQUEOS DE INTEGRIDAD REFERENCIALES
 SET FOREIGN_KEY_CHECKS = 1;
-- CREAR TABLA INGREDIENT_TYPE
CREATE TABLE `Ingredient_Type`
(
 `ingredientTypeName` varchar(45) NOT NULL ,
PRIMARY KEY (`ingredientTypeName`)
);
-- CREAR TABLA INGREDIENT
CREATE TABLE `Ingredient`
(
 `ingredientName`     varchar(100) NOT NULL ,
 `ingredientTypeName` varchar(45) NOT NULL ,
 `ingredientCalories` integer NOT NULL ,
PRIMARY KEY (`ingredientName`),
KEY `FK_1` (`ingredientTypeName`),
CONSTRAINT `FK_3` FOREIGN KEY `FK_1` (`ingredientTypeName`) REFERENCES `Ingredient_Type` (`ingredientTypeName`)
);
-- CREAR TABLA RECIPE
CREATE TABLE `Recipe`
(
 `recipeId`          integer NOT NULL AUTO_INCREMENT ,
 `recipeName`        varchar(100) NOT NULL ,
 `recipePreparation` mediumtext NOT NULL ,
 `recipePrepTimeMin` integer NOT NULL ,
 `recipeCalories`    integer NULL ,
 `recipePrice`       float NULL ,
PRIMARY KEY (`recipeId`)
);
-- CREAR TABLA RECIPES_INGREDIENT
CREATE TABLE `Recipe_Ingredient`
(
 `recipeId`       integer NOT NULL ,
 `ingredientName` varchar(100) NOT NULL ,
 `ri_Quantity`    integer NULL ,
 `ri_TotalWeight` float NULL ,
 `ri_NetWeight`   float NULL ,

PRIMARY KEY (`recipeId`, `ingredientName`),
KEY `FK_1` (`recipeId`),
CONSTRAINT `FK_1` FOREIGN KEY `FK_1` (`recipeId`) REFERENCES `Recipe` (`recipeId`),
KEY `FK_2` (`ingredientName`),
CONSTRAINT `FK_2` FOREIGN KEY `FK_2` (`ingredientName`) REFERENCES `Ingredient` (`ingredientName`)
);


