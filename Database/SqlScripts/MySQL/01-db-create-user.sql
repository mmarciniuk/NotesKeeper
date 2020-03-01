DROP USER IF EXISTS `notes_keeper_db_user`;
CREATE USER IF NOT EXISTS `notes_keeper_db_user` IDENTIFIED BY '/L4zSlGMbvab(o_I<E0.';

GRANT SELECT, INSERT, UPDATE, DELETE, EXECUTE
ON notes_keeper_db.*
TO `notes_keeper_db_user`@`%`;