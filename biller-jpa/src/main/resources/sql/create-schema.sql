CREATE SEQUENCE SEQ_IDENT START WITH 1 INCREMENT BY 1;
/*==============================================================*/
/* Table: BILLER_COMPANIES                                      */
/*==============================================================*/
create table BILLER_COMPANIES (
  ID                   NUMERIC(12)          not null,
  COMPANY_NAME         VARCHAR(256)         not null,
  constraint PK_BILLER_COMPANIES primary key (ID),
  constraint UK_BILLER_COMPANY unique (COMPANY_NAME)
);

comment on table BILLER_COMPANIES is
'Биллинговая компания';

comment on column BILLER_COMPANIES.ID is
'Идентификатор компании';

comment on column BILLER_COMPANIES.COMPANY_NAME is
'Наименование компании';

/*==============================================================*/
/* Table: CUSTOMERS                                             */
/*==============================================================*/
create table CUSTOMERS (
  ID                   NUMERIC(12)          not null,
  FIRST_NAME           VARCHAR(256)         not null,
  LAST_NAME            VARCHAR(256)         not null,
  BIRTH_DATE           DATE                 not null,
  ADDRESS              VARCHAR(256)         not null,
  constraint PK_CUSTOMERS primary key (ID)
);

comment on table CUSTOMERS is
'Клиент';

comment on column CUSTOMERS.ID is
'Идентификатор клиента';

comment on column CUSTOMERS.FIRST_NAME is
'Имя клиента';

comment on column CUSTOMERS.LAST_NAME is
'Фамилия клиента';

comment on column CUSTOMERS.BIRTH_DATE is
'Дата рождения';

comment on column CUSTOMERS.ADDRESS is
'Адрес проживания';

/*==============================================================*/
/* Index: IDX1_CUSTOMER                                         */
/*==============================================================*/
create  index IDX1_CUSTOMER on CUSTOMERS (
  LAST_NAME,
  FIRST_NAME
);

/*==============================================================*/
/* Index: IDX2_CUSTOMER                                         */
/*==============================================================*/
create  index IDX2_CUSTOMER on CUSTOMERS (
  ADDRESS
);

/*==============================================================*/
/* Table: PAYMENTS                                              */
/*==============================================================*/
create table PAYMENTS (
  ID                   NUMERIC(12)          not null,
  BILLER_ID            NUMERIC(12)          not null,
  CUSTOMER_ID          NUMERIC(12)          not null,
  DT_PAYMENT           DATE                 not null,
  ACCOUNT              NUMERIC(20)          not null,
  AMOUNT               NUMERIC(10,2)        not null,
  constraint PK_PAYMENTS primary key (ID),
  constraint UK_PAYMENT unique (BILLER_ID, CUSTOMER_ID, DT_PAYMENT)
);

comment on table PAYMENTS is
'Платеж клиента';

comment on column PAYMENTS.ID is
'Идентификатор платежа';

comment on column PAYMENTS.BILLER_ID is
'Идентификатор компании';

comment on column PAYMENTS.CUSTOMER_ID is
'Идентификатор клиента';

comment on column PAYMENTS.DT_PAYMENT is
'Дата и время платежа';

comment on column PAYMENTS.ACCOUNT is
'Номер счета';

comment on column PAYMENTS.AMOUNT is
'Сумма плотежа';

alter table PAYMENTS
  add constraint FK_PAYMENTS_BILLER_ID foreign key (BILLER_ID)
references BILLER_COMPANIES (ID)
on delete cascade;

alter table PAYMENTS
  add constraint FK_PAYMENTS_CUSTOMER_ID foreign key (CUSTOMER_ID)
references CUSTOMERS (ID)
on delete cascade;
