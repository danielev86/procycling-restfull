CREATE TABLE if not exists teams (
	id BIGINT NOT NULL AUTO_INCREMENT,
	team_name VARCHAR(16) NOT NULL,
    team_manager VARCHAR(16),
	CONSTRAINT pk_team PRIMARY KEY (id)
);

INSERT INTO teams (team_name,team_manager)
VALUES ('Team Bahrain Merida', 'Brent Copeland');

INSERT INTO teams (team_name,team_manager)
VALUES ('Team Sky', 'David Brailsford');