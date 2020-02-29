USE `notes_keeper_db`;

-- Insert role ADMIN
INSERT INTO `base_info`(`Uuid`, `CreatedTimestamp`)
VALUES(uuid(), now());

SET @adminId = last_insert_id();

INSERT INTO `role`(`Id`, `RoleName`)
VALUES(@adminId, 'ADMIN');

-- Insert role USER
INSERT INTO `base_info`(`Uuid`, `CreatedTimestamp`)
VALUES(uuid(), now());

SET @userId = last_insert_id();

INSERT INTO `role`(`Id`, `RoleName`)
VALUE(@userId, 'USER');