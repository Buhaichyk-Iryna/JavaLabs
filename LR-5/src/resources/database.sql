--
-- PostgreSQL database dump
--

-- Dumped from database version 15.2
-- Dumped by pg_dump version 15.2

-- Started on 2023-05-18 19:51:44

SET
statement_timeout = 0;
SET
lock_timeout = 0;
SET
idle_in_transaction_session_timeout = 0;
SET
client_encoding = 'UTF8';
SET
standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET
check_function_bodies = false;
SET
xmloption = content;
SET
client_min_messages = warning;
SET
row_security = off;

SET
default_tablespace = '';

SET
default_table_access_method = heap;

--
-- TOC entry 197 (class 1175 OID 16752)
-- Name: student; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.student
(
    id             integer NOT NULL,
    surname        character varying(32),
    name           character varying(32),
    patronymic     character varying(32),
    "recordBookId" integer,
    birthday       date
);


ALTER TABLE public.student OWNER TO postgres;

--
-- TOC entry 3318 (class 0 OID 16398)
-- Dependencies: 215
-- Data for Name: student; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.student (id, surname, name, patronymic, "recordBookId", birthday) FROM stdin;

1	Алімов Віталій Олександрович	000002	2003-05-02
2	Баранник Михайло Миколайович	000003	2003-05-03
3	Баштаннік Максим Олександрович	000004	2003-05-04
4	Беспалов Максим Дмитрович	    000005	2003-05-05
5	Бойко Руслан Сергійович 	    000006	2003-05-06
6	Брусенський Олексій Олегович	000007	2003-05-07
7	Бугайчук Ірина Сергіївна	    000008	2003-05-08
8	Вобліков Олександр Миколайович	000009	2003-05-09
9	Гладкий Данило Іванович	        000010	2003-05-10
10	Гопайца Нікіта Іванович	        000011	2003-05-11
11	Гордієнко Данило Дмитрович	    000012	2003-05-12
12	Дарчич Владислав Ігорович	    000013	2003-05-13
13	Даценко Олег Олегович	        000014	2003-05-14
14	Єріс Анастасія Євгенівна	    000015	2003-05-15
15	Єрмаков Сергій Андрійович	    000016	2003-05-16
16	Карпусь Артур Дмитрович	        000017	2003-05-17
17	Колотило Кирило Максимович	    000018	2003-05-18
18	Лещенко Олександр Олегович	    000019	2003-05-19
19	Маленик Костянтин Андрійович	000020	2003-05-20
20	Матвєєв Володимир Євгенович	    000021	2003-05-21
21	Мозальов Максим Дмитроаич	    000022	2003-05-22
22	Моргаленко Марія Анатоліївна	000023	2003-05-23
23	Мороз Данило Олександрович	    000024	2003-05-24
24	Пятничук Ілля Дмитрович	        000025	2003-05-25
25	Парастатов Ярослав Маріанович	000026	2003-05-26
26	Пучко Владислав Сергійович	    000027	2003-05-27
27	Сдобніков Євгеній Борисович	    000028	2003-05-28
28	Скорик Владислав Максимович	    000029	2003-05-29
29	Уваровський Максим Дмитрович	000030	2003-05-30
30	Цісар Данило Михайлович	        000031	2003-05-31
31	Чирков Роман Андрійович	        000032	2003-06-01
32	Чорний Віталій Олександрович	000033	2003-06-02
33	Чорний Роман Олександрович	    000034	2003-06-03
\.


--
-- TOC entry 3533 (class 2606 OID 16856)
-- Name: student recordBookId_unique; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.student
    ADD CONSTRAINT "recordBookId_unique" UNIQUE ("recordBookId");


--
-- TOC entry 36741 (class 2606 OID 16911)
-- Name: student student_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.student
    ADD CONSTRAINT student_pkey PRIMARY KEY (id);


-- Completed on 2023-05-18 22:32:59

--
-- PostgreSQL database dump complete
--

