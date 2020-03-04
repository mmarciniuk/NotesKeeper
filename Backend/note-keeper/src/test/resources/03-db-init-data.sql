USE `notes_keeper_db`;

-- Insert role ADMIN
INSERT INTO `base_info`(`Uuid`, `CreatedTimestamp`)
VALUES(uuid(), now());

SET @adminId = (SELECT last_insert_id());

INSERT INTO `role`(`Id`, `RoleName`)
VALUES(1, 'ADMIN');

-- Insert role USER
INSERT INTO `base_info`(`Uuid`, `CreatedTimestamp`)
VALUES(uuid(), now());

SET @userId = (SELECT last_insert_id());

INSERT INTO `role`(`Id`, `RoleName`)
VALUES(@userId, 'USER');