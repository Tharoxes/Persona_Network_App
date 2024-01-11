INSERT INTO `users`
VALUES
('john', '{noop}test123', 1),
('jack', '{noop}check123', 1),
('james', '{noop}authenticate123', 1);

INSERT INTO `authorities` VALUES
('john', 'ROLE_SOLDIER'),
('john', 'ROLE_LIEUTENANT'),
('john', 'ROLE_GENERAL'),
('jack', 'ROLE_SOLDIER'),
('jack', 'ROLE_LIEUTENANT'),
('james', 'ROLE_SOLDIER');
