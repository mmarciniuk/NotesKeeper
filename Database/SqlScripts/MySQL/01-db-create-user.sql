DROP USER IF EXISTS `notes_keeper_db_user`;
CREATE USER IF NOT EXISTS `notes_keeper_db_user` IDENTIFIED BY RANDOM PASSWORD;

GRANT SELECT, INSERT, UPDATE, DELETE, EXECUTE
ON notes_keeper_db.*
TO `notes_keeper_db_user`@`%`;