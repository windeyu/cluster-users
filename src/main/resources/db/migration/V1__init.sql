CREATE TABLE cluster_user (
	id bigint NOT NULL,
	name varchar(100),
	password varchar(100),
	PRIMARY KEY (id)
);

INSERT INTO cluster_user VALUES (0, 'tester', 'tester');
