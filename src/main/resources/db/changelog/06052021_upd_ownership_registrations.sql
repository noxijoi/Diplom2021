alter table if exists state_registration add column ownership_id int8;
alter table if exists state_registration_aud add column ownership_id int8;
alter table if exists state_registration add constraint FKnnhkmoat5o9uq62xpcswxbt6j foreign key (ownership_id) references ownership;
