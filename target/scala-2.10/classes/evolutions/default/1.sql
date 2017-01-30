# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table audit_log (
  id                        integer auto_increment not null,
  user_id                   varchar(255),
  email                     varchar(255),
  role                      varchar(255),
  context                   varchar(255),
  screen                    varchar(255),
  field                     varchar(255),
  value                     varchar(255),
  ip                        varchar(255),
  path                      varchar(255),
  host                      varchar(255),
  created                   datetime(6),
  constraint pk_audit_log primary key (id))
;

create table comment (
  id                        bigint auto_increment not null,
  author                    varchar(255),
  authoremail               varchar(255),
  comment                   varchar(255),
  intakekey                 varchar(255),
  commentkey                varchar(255),
  userkey                   varchar(255),
  datecreated               datetime(6),
  constraint pk_comment primary key (id))
;

create table intake (
  id                        bigint auto_increment not null,
  projectid                 varchar(255),
  projectname               varchar(255),
  summary                   varchar(255),
  projectstatus             varchar(255),
  agency                    varchar(255),
  requestor                 varchar(255),
  daterequested             datetime(6),
  howrequested              varchar(255),
  initialmeetdate           datetime(6),
  initialmeetcomments       varchar(255),
  requeststatus             varchar(255),
  bamanager                 varchar(255),
  bamanageremail            varchar(255),
  bamanagerkey              varchar(255),
  baassigneddate            datetime(6),
  baassigned                varchar(255),
  baassignedemail           varchar(255),
  baassignedkey             varchar(255),
  badeliverable             varchar(255),
  bataskstatus              varchar(255),
  batimeestimate            integer,
  batargetdate              datetime(6),
  bacompletiondate          datetime(6),
  semanager                 varchar(255),
  semanageremail            varchar(255),
  semanagerkey              varchar(255),
  seassigneddate            datetime(6),
  seassigned                varchar(255),
  seassignedemail           varchar(255),
  seassignedkey             varchar(255),
  sedeliverable             varchar(255),
  setaskstatus              varchar(255),
  setimeestimate            integer,
  setargetdate              datetime(6),
  secompletiondate          datetime(6),
  datecreated               datetime(6),
  intakekey                 varchar(255),
  userkey                   varchar(255),
  editkey                   varchar(255),
  updatedby                 varchar(255),
  to_start_evolution        varchar(255),
  dateupdated               datetime(6),
  constraint pk_intake primary key (id))
;

create table intake_audit (
  id                        bigint auto_increment not null,
  intakekey                 varchar(255),
  editor                    varchar(255),
  editoremail               varchar(255),
  editorkey                 varchar(255),
  editdate                  datetime(6),
  fieldname                 varchar(255),
  fielddisplay              varchar(255),
  oldvalue                  varchar(255),
  newvalue                  varchar(255),
  auditkey                  varchar(255),
  constraint pk_intake_audit primary key (id))
;

create table intake_edit (
  id                        bigint auto_increment not null,
  editkey                   varchar(255),
  projectid                 varchar(255),
  projectname               varchar(255),
  summary                   varchar(255),
  projectstatus             varchar(255),
  agency                    varchar(255),
  requestor                 varchar(255),
  daterequested             datetime(6),
  howrequested              varchar(255),
  initialmeetdate           datetime(6),
  initialmeetcomments       varchar(255),
  requeststatus             varchar(255),
  bamanager                 varchar(255),
  bamanageremail            varchar(255),
  bamanagerkey              varchar(255),
  baassigneddate            datetime(6),
  baassigned                varchar(255),
  baassignedemail           varchar(255),
  baassignedkey             varchar(255),
  badeliverable             varchar(255),
  bataskstatus              varchar(255),
  batimeestimate            integer,
  batargetdate              datetime(6),
  bacompletiondate          datetime(6),
  semanager                 varchar(255),
  semanageremail            varchar(255),
  semanagerkey              varchar(255),
  seassigneddate            datetime(6),
  seassigned                varchar(255),
  seassignedemail           varchar(255),
  seassignedkey             varchar(255),
  sedeliverable             varchar(255),
  setaskstatus              varchar(255),
  setimeestimate            integer,
  setargetdate              datetime(6),
  secompletiondate          datetime(6),
  datecreated               datetime(6),
  intakekey                 varchar(255),
  userkey                   varchar(255),
  updatedby                 varchar(255),
  dateupdated               datetime(6),
  constraint pk_intake_edit primary key (id))
;

create table lookup (
  id                        bigint auto_increment not null,
  lookuptype                varchar(255),
  name                      varchar(255),
  description               varchar(255),
  datecreated               datetime(6),
  lookupkey                 varchar(255),
  updatedby                 varchar(255),
  dateupdated               datetime(6),
  userkey                   varchar(255),
  constraint pk_lookup primary key (id))
;

create table removed_intake (
  id                        bigint auto_increment not null,
  projectid                 varchar(255),
  projectname               varchar(255),
  summary                   varchar(255),
  projectstatus             varchar(255),
  agency                    varchar(255),
  requestor                 varchar(255),
  daterequested             datetime(6),
  howrequested              varchar(255),
  initialmeetdate           datetime(6),
  initialmeetcomments       varchar(255),
  requeststatus             varchar(255),
  bamanager                 varchar(255),
  bamanageremail            varchar(255),
  bamanagerkey              varchar(255),
  baassigneddate            datetime(6),
  baassigned                varchar(255),
  baassignedemail           varchar(255),
  baassignedkey             varchar(255),
  badeliverable             varchar(255),
  bataskstatus              varchar(255),
  batimeestimate            integer,
  batargetdate              datetime(6),
  bacompletiondate          datetime(6),
  semanager                 varchar(255),
  semanageremail            varchar(255),
  semanagerkey              varchar(255),
  seassigneddate            datetime(6),
  seassigned                varchar(255),
  seassignedemail           varchar(255),
  seassignedkey             varchar(255),
  sedeliverable             varchar(255),
  setaskstatus              varchar(255),
  setimeestimate            integer,
  setargetdate              datetime(6),
  secompletiondate          datetime(6),
  datecreated               datetime(6),
  intakekey                 varchar(255),
  userkey                   varchar(255),
  updatedby                 varchar(255),
  dateupdated               datetime(6),
  removed_by                varchar(255),
  removedbyuserkey          varchar(255),
  date_removed              datetime(6),
  constraint pk_removed_intake primary key (id))
;

create table removed_user (
  id                        bigint auto_increment not null,
  email                     varchar(255),
  fullname                  varchar(255),
  agency                    varchar(255),
  confirmation_token        varchar(255),
  password_hash             varchar(255),
  date_creation             datetime(6),
  validated                 tinyint(1) default 0,
  role                      integer,
  rolename                  varchar(255),
  approved                  varchar(255),
  active                    varchar(255),
  userkey                   varchar(255),
  updated_by                varchar(255),
  date_updated              datetime(6),
  removed_by                varchar(255),
  removedbyuserkey          varchar(255),
  date_removed              datetime(6),
  constraint ck_removed_user_role check (role in ('2','0','3','5','4','1')),
  constraint uq_removed_user_email unique (email),
  constraint uq_removed_user_fullname unique (fullname),
  constraint pk_removed_user primary key (id))
;

create table service (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  shortname                 varchar(255),
  comment                   varchar(255),
  constraint pk_service primary key (id))
;

create table session (
  id                        integer auto_increment not null,
  hash                      varchar(255),
  user_id                   varchar(255),
  email                     varchar(255),
  expiration_date           datetime(6),
  data                      varchar(255),
  userkey                   varchar(255),
  role                      integer,
  rolename                  varchar(255),
  constraint ck_session_role check (role in ('2','0','3','5','4','1')),
  constraint pk_session primary key (id))
;

create table token (
  token                     varchar(255) not null,
  user_id                   bigint,
  type                      varchar(8),
  date_creation             datetime(6),
  email                     varchar(255),
  constraint ck_token_type check (type in ('password','email','admin','user')),
  constraint pk_token primary key (token))
;

create table user (
  id                        bigint auto_increment not null,
  email                     varchar(255),
  fullname                  varchar(255),
  agency                    varchar(255),
  confirmation_token        varchar(255),
  password_hash             varchar(255),
  date_creation             datetime(6),
  date_password_remind      datetime(6),
  date_remind               datetime(6),
  validated                 tinyint(1) default 0,
  role                      integer,
  rolename                  varchar(255),
  approved                  varchar(255),
  active                    varchar(255),
  userkey                   varchar(255),
  updated_by                varchar(255),
  date_updated              datetime(6),
  constraint ck_user_role check (role in ('2','0','3','5','4','1')),
  constraint uq_user_email unique (email),
  constraint uq_user_fullname unique (fullname),
  constraint pk_user primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table audit_log;

drop table comment;

drop table intake;

drop table intake_audit;

drop table intake_edit;

drop table lookup;

drop table removed_intake;

drop table removed_user;

drop table service;

drop table session;

drop table token;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

