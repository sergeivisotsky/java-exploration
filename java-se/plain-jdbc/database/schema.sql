DROP TABLE IF EXISTS DCTR_SPEC_RELATION;
DROP TABLE IF EXISTS CABINET;
DROP TABLE IF EXISTS DEPARTMENT;
DROP TABLE IF EXISTS AMBULANCE;
DROP TABLE IF EXISTS ROOM;
DROP TABLE IF EXISTS PATIENT;
DROP TABLE IF EXISTS REG_POINT;
DROP TABLE IF EXISTS OPERATOR;
DROP TABLE IF EXISTS SPECIALITY;
DROP TABLE IF EXISTS DOCTOR;

CREATE TABLE CABINET (
    ID NUMERIC(19) NOT NULL PRIMARY KEY,
    ROOM_NUMBER INTEGER NOT NULL,
    ROOM_TITLE VARCHAR(45) NOT NULL,
    NUMBER_OF_PERS NUMERIC(2) NOT NULL,
    CONSTRAINT ROOM_TITLE_CHECK CHECK(ROOM_TITLE IN ('Physician', 'Dermatologist', 'Pulmonologist', 'Cardiologist',
                                            'Developmental pediatrician', 'Hematologist', 'Pediatrician',
                                            'Psychiatrist', 'Gastroenterologist'))
);

CREATE TABLE DEPARTMENT (
    ID NUMERIC(19) NOT NULL PRIMARY KEY,
    TITLE VARCHAR(45) NOT NULL,
    WORKERS_QUANTITY INTEGER NOT NULL,
    NUMBER_OF_PATIENTS INTEGER NOT NULL,
    CONSTRAINT WORKERS_QUANTITY_CHECK CHECK(WORKERS_QUANTITY <= 300),
    CONSTRAINT NUMBER_OF_PATIENTS CHECK(NUMBER_OF_PATIENTS <= 500),
    CONSTRAINT TITLE_CHECK CHECK(TITLE IN('Pulmonology', 'Cardiology', 'Nefrology', 'Gastroenterology', 'Critical care',
                                        'Chaplaincy', 'Diagnostic imaging', 'General surgery', 'Gynaecology', 'Haematology'))
);

CREATE TABLE AMBULANCE(
    ID NUMERIC(19) NOT NULL PRIMARY KEY,
    AREA VARCHAR(100) NOT NULL,
    AVAILABILITY CHAR(1) NOT NULL,
    CONSTRAINT AVAILABILITY_CHECK CHECK(AVAILABILITY IN ('1', '0'))
);

CREATE TABLE ROOM (
    ID NUMERIC(19) NOT NULL PRIMARY KEY,
    MAX_PATIENTS NUMERIC(2) NOT NULL,
    CURRENT_PAT_QUANTITY NUMERIC(2) NOT NULL,
    CONSTRAINT MAX_PATIENTS_CHECK CHECK(MAX_PATIENTS <= 5),
    CONSTRAINT CURR_PAT_QUANT_CHECK CHECK(CURRENT_PAT_QUANTITY <= 5)
);

CREATE TABLE PATIENT (
    ID NUMERIC(19) NOT NULL PRIMARY KEY,
    FIRST_NAME VARCHAR(45) NOT NULL,
    LAST_NAME VARCHAR(45) NOT NULL,
    AGE INTEGER NOT NULL CHECK (AGE <= 130),
    PERS_CODE VARCHAR(12) NOT NULL,
    ADDRESS VARCHAR(100) NOT NULL,
    ARRIVAL_TIME TIMESTAMP NOT NULL,
    DESCH_TIME TIMESTAMP NOT NULL,
    DIAGNOSIS VARCHAR(100) NOT NULL,
    FEE FLOAT(5) NOT NULL,
    ROOM_ID NUMERIC(19) NOT NULL,
    AMB_ID NUMERIC(19) NOT NULL,
    DEPT_ID NUMERIC(19) NOT NULL,
    REG_POINT_ID NUMERIC(19) NOT NULL,
    FOREIGN KEY (ROOM_ID) REFERENCES ROOM(ID),
    FOREIGN KEY (AMB_ID) REFERENCES AMBULANCE(ID),
    FOREIGN KEY (DEPT_ID) REFERENCES DEPARTMENT(ID),
    CONSTRAINT PATIENT_AGE_CHECK CHECK(AGE <= 130)
);

CREATE TABLE REG_POINT(
    ID NUMERIC(19) NOT NULL PRIMARY KEY,
    REG_DATE TIMESTAMP NOT NULL,
    OPERATOR_ID NUMERIC(19) NOT NULL,
    PAT_ID NUMERIC(19) NOT NULL,
    FOREIGN KEY (PAT_ID) REFERENCES PATIENT(ID)
);

ALTER TABLE PATIENT ADD FOREIGN KEY (REG_POINT_ID) REFERENCES REG_POINT(ID);

CREATE TABLE OPERATOR(
    ID NUMERIC(19) NOT NULL PRIMARY KEY,
    FIRST_NAME VARCHAR(45) NOT NULL,
    LAST_NAME VARCHAR(45) NOT NULL
);

ALTER TABLE REG_POINT ADD FOREIGN KEY(OPERATOR_ID) REFERENCES OPERATOR(ID);

CREATE TABLE SPECIALITY(
    ID NUMERIC(19) NOT NULL PRIMARY KEY,
    SPEC_NAME VARCHAR(45) NOT NULL,
    EXP_REQUIRED NUMERIC(2) NOT NULL,
    CONSTRAINT SPEC_NAME_CHECK CHECK(SPEC_NAME IN ('Physician', 'Dermatologist', 'Pulmonologist', 'Cardiologist',
                                            'Developmental pediatrician', 'Hematologist', 'Pediatrician',
                                            'Psychiatrist', 'Gastroenterologist')),
    CONSTRAINT EXPERIENCE_CHECK CHECK(EXP_REQUIRED = 5)
);

CREATE TABLE DOCTOR (
    ID NUMERIC(19) NOT NULL PRIMARY KEY,
    FIRST_NAME VARCHAR(45) NOT NULL,
    LAST_NAME VARCHAR(45) NOT NULL,
    AGE INTEGER NOT NULL,
    POSITION VARCHAR(45) NOT NULL,
    EXPERIENCE_YEARS INTEGER NOT NULL,
    SPCLTY_ID NUMERIC(19) NOT NULL,
    CAB_ID NUMERIC(19) NOT NULL,
    DEP_ID NUMERIC(19) NOT NULL,
    CONSTRAINT DOCTOR_AGE_CHECK CHECK(AGE <= 130),
    CONSTRAINT EXP_CHECK CHECK(EXPERIENCE_YEARS <= 50),
    FOREIGN KEY (CAB_ID) REFERENCES CABINET(ID),
    FOREIGN KEY (DEP_ID) REFERENCES DEPARTMENT(ID),
    CONSTRAINT POSITION_CHECK CHECK(POSITION IN ('Physician', 'Dermatologist', 'Pulmonologist', 'Cardiologist',
                                            'Developmental pediatrician', 'Hematologist', 'Pediatrician',
                                            'Psychiatrist', 'Gastroenterologist'))
);

CREATE TABLE DCTR_SPEC_RELATION (
    DOC_ID NUMERIC(19) NOT NULL,
    SPEC_ID NUMERIC(19) NOT NULL,
    FOREIGN KEY (DOC_ID) REFERENCES DOCTOR(ID),
    FOREIGN KEY (SPEC_ID) REFERENCES SPECIALITY(ID)
);

INSERT INTO CABINET(ID, ROOM_NUMBER, ROOM_TITLE, NUMBER_OF_PERS) VALUES(1, 236, 'Physician', '2');
INSERT INTO DEPARTMENT(ID, TITLE, WORKERS_QUANTITY, NUMBER_OF_PATIENTS) VALUES(1, 'Nefrology', 250, 430);
INSERT INTO DEPARTMENT(ID, TITLE, WORKERS_QUANTITY, NUMBER_OF_PATIENTS) VALUES(2, 'Pulmonology', 230, 261);
INSERT INTO DEPARTMENT(ID, TITLE, WORKERS_QUANTITY, NUMBER_OF_PATIENTS) VALUES(3, 'Cardiology', 240, 350);
INSERT INTO ROOM(ID, MAX_PATIENTS, CURRENT_PAT_QUANTITY) VALUES(1, 5, 3);
INSERT INTO ROOM(ID, MAX_PATIENTS, CURRENT_PAT_QUANTITY) VALUES(2, 5, 1);
INSERT INTO ROOM(ID, MAX_PATIENTS, CURRENT_PAT_QUANTITY) VALUES(3, 5, 4);
INSERT INTO AMBULANCE(ID, AREA, AVAILABILITY) VALUES(1, 'Riga', '1');
INSERT INTO SPECIALITY(ID, SPEC_NAME, EXP_REQUIRED) VALUES(1, 'Physician', 5);
INSERT INTO SPECIALITY(ID, SPEC_NAME, EXP_REQUIRED) VALUES(2, 'Dermatologist', 5);
INSERT INTO SPECIALITY(ID, SPEC_NAME, EXP_REQUIRED) VALUES(3, 'Gastroenterologist', 5);
INSERT INTO DOCTOR(ID, FIRST_NAME, LAST_NAME, AGE, POSITION, EXPERIENCE_YEARS, SPCLTY_ID, CAB_ID, DEP_ID) VALUES(1, 'John', 'Smith', 45, 'Physician', 20, 1, 1, 1);
INSERT INTO DCTR_SPEC_RELATION(DOC_ID, SPEC_ID) VALUES(1, 1);
INSERT INTO DCTR_SPEC_RELATION(DOC_ID, SPEC_ID) VALUES(1, 2);
INSERT INTO REG_POINT(ID, REG_DATE, OPERATOR_ID, PAT_ID) VALUES(1, TO_TIMESTAMP('2019-01-31 09:26:56', 'YYYY-MM-DD HH24:MI:SS'), 1, 1);
INSERT INTO REG_POINT(ID, REG_DATE, OPERATOR_ID, PAT_ID) VALUES(2, TO_TIMESTAMP('2019-01-31 09:26:56', 'YYYY-MM-DD HH24:MI:SS'), 1, 2);
INSERT INTO REG_POINT(ID, REG_DATE, OPERATOR_ID, PAT_ID) VALUES(3, TO_TIMESTAMP('2019-01-31 09:26:56', 'YYYY-MM-DD HH24:MI:SS'), 1, 3);
INSERT INTO PATIENT(ID, FIRST_NAME, LAST_NAME, AGE, PERS_CODE, ADDRESS, ARRIVAL_TIME, DESCH_TIME, DIAGNOSIS, FEE, ROOM_ID, AMB_ID, DEPT_ID, REG_POINT_ID)
VALUES(1, 'Chris', 'Cary', 25, '111111-11400', '5th avenue', TO_TIMESTAMP('2019-01-31 09:26:56', 'YYYY-MM-DD HH24:MI:SS'),
TO_TIMESTAMP('2019-02-15 09:26:56', 'YYYY-MM-DD HH24:MI:SS'), '?enal failure', 250.30, 1, 1, 1, 1);
INSERT INTO PATIENT(ID, FIRST_NAME, LAST_NAME, AGE, PERS_CODE, ADDRESS, ARRIVAL_TIME, DESCH_TIME, DIAGNOSIS, FEE, ROOM_ID, AMB_ID, DEPT_ID)
VALUES(2, 'Adam', 'Savage', 55, '111112-11401', '25th avenue', TO_TIMESTAMP('2019-02-21 09:45:56', 'YYYY-MM-DD HH24:MI:SS'),
TO_TIMESTAMP('2019-03-08 15:30:56', 'YYYY-MM-DD HH24:MI:SS'), 'Asthma', 600.30, 2, 1, 2);
INSERT INTO PATIENT(ID, FIRST_NAME, LAST_NAME, AGE, PERS_CODE, ADDRESS, ARRIVAL_TIME, DESCH_TIME, DIAGNOSIS, FEE, ROOM_ID, AMB_ID, DEPT_ID)
VALUES(3, 'Chris', 'Cary', 25, '111111-11400', '5th avenue', TO_TIMESTAMP('2019-01-31 09:26:56', 'YYYY-MM-DD HH24:MI:SS'),
TO_TIMESTAMP('2019-02-15 09:26:56', 'YYYY-MM-DD HH24:MI:SS'), 'Heart attack', 874.30, 3, 1, 3);
INSERT INTO OPERATOR(ID, FIRST_NAME, LAST_NAME) VALUES(1, 'Chris', 'Lie');