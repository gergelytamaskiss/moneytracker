-- TODO: not inserted when running with testcontainers
-- INSERT SYSTEM USER
INSERT INTO app_user (email, password, first_name, last_name, role_id, enabled, last_login, created_by, created_on, modified_by, modified_on)
VALUES ('system.user@moneytracker.com', '$2a$12$Ou6RBc8UGDl.nk4HrtfhPeTqcvVZLUeRp84oTJ74Or0NK.BPwvTRG', 'System', 'User', null, true, null, null, NOW(), null, NOW());

-- SELECT setval('app_user_id_seq', 1, true);