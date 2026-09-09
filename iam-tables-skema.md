create table public.users (
  id uuid not null,
  first_name character varying(100) not null,
  middle_name character varying(100) not null,
  last_name character varying(100) not null,
  email character varying(255) not null,
  birth_date bigint not null,
  status character varying(20) not null,
  avatar_url character varying(255) null,
  login_history text not null default '[]'::text,
  role character varying(20) not null,
  team_id uuid null,
  created_at character varying(50) not null,
  updated_at character varying(50) not null,
  constraint users_pkey primary key (id),
  constraint fk_users_team foreign KEY (team_id) references teams (id) on delete set null
) TABLESPACE pg_default;


create table public.teams (
  id uuid not null,
  name character varying(100) not null,
  slogan character varying(255) not null,
  icon_url character varying(255) null,
  created_at character varying(50) not null,
  updated_at character varying(50) not null,
  constraint teams_pkey primary key (id)
) TABLESPACE pg_default;
 

create table public.team_mentors (
  team_id uuid not null,
  mentor_id uuid not null,
  constraint team_mentors_pkey primary key (team_id, mentor_id),
  constraint fk_team_mentors_mentor foreign KEY (mentor_id) references users (id) on delete CASCADE,
  constraint fk_team_mentors_team foreign KEY (team_id) references teams (id) on delete CASCADE
) TABLESPACE pg_default;


