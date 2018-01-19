create table if not exists countries (
	id bigint not null auto_increment,
    country_name varchar(32) not null,
    constraint pk_country primary key (id)
);

CREATE TABLE if not exists teams (
	id BIGINT NOT NULL AUTO_INCREMENT,
	team_name VARCHAR(32) NOT NULL,
    team_manager VARCHAR(32),
    country_id BIGINT not null,
	CONSTRAINT pk_team PRIMARY KEY (id),
    constraint fk_country foreign key(country_id)
    references countries(id)
);

insert into countries(country_name) values ('Bahrein');
insert into countries(country_name) values ('United Kingdom');

INSERT INTO teams (team_name,team_manager, country_id)
VALUES ('Team Bahrain Merida', 'Brent Copeland',2);

INSERT INTO teams (team_name,team_manager, country_id)
VALUES ('Team Sky', 'David Brailsford',1);