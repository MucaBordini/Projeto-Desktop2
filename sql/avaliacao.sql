--
-- PostgreSQL database dump
--

-- Dumped from database version 11.1
-- Dumped by pg_dump version 11.1

-- Started on 2019-06-04 22:47:20

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'ISO_8859_5';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2 (class 3079 OID 16395)
-- Name: pgcrypto; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS pgcrypto WITH SCHEMA public;


--
-- TOC entry 2868 (class 0 OID 0)
-- Dependencies: 2
-- Name: EXTENSION pgcrypto; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION pgcrypto IS 'cryptographic functions';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 199 (class 1259 OID 16448)
-- Name: avaliacao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.avaliacao (
    nota double precision,
    comentario character varying(300)[],
    usu_email_fk character varying(50)[] NOT NULL,
    jogo_nome_fk character varying(100)[] NOT NULL
);


ALTER TABLE public.avaliacao OWNER TO postgres;

--
-- TOC entry 198 (class 1259 OID 16440)
-- Name: jogo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.jogo (
    jogo_nome character varying(100)[] NOT NULL,
    jogo_dev character varying(50)[] NOT NULL,
    jogo_gen character varying(50)[] NOT NULL
);


ALTER TABLE public.jogo OWNER TO postgres;

--
-- TOC entry 197 (class 1259 OID 16432)
-- Name: usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.usuario (
    usu_nome character varying(150)[] NOT NULL,
    usu_email character varying(100)[] NOT NULL,
    usu_pass character varying(100)[] NOT NULL,
    usu_pass_conf character varying(100)[] NOT NULL
);


ALTER TABLE public.usuario OWNER TO postgres;

--
-- TOC entry 2862 (class 0 OID 16448)
-- Dependencies: 199
-- Data for Name: avaliacao; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.avaliacao (nota, comentario, usu_email_fk, jogo_nome_fk) FROM stdin;
\.


--
-- TOC entry 2861 (class 0 OID 16440)
-- Dependencies: 198
-- Data for Name: jogo; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.jogo (jogo_nome, jogo_dev, jogo_gen) FROM stdin;
\.


--
-- TOC entry 2860 (class 0 OID 16432)
-- Dependencies: 197
-- Data for Name: usuario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.usuario (usu_nome, usu_email, usu_pass, usu_pass_conf) FROM stdin;
\.


--
-- TOC entry 2736 (class 2606 OID 16455)
-- Name: avaliacao avaliacao_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.avaliacao
    ADD CONSTRAINT avaliacao_pkey PRIMARY KEY (usu_email_fk, jogo_nome_fk);


--
-- TOC entry 2734 (class 2606 OID 16447)
-- Name: jogo jogo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.jogo
    ADD CONSTRAINT jogo_pkey PRIMARY KEY (jogo_nome);


--
-- TOC entry 2732 (class 2606 OID 16439)
-- Name: usuario usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (usu_email);


--
-- TOC entry 2738 (class 2606 OID 16461)
-- Name: avaliacao avaliacao_jogo_nome_fk_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.avaliacao
    ADD CONSTRAINT avaliacao_jogo_nome_fk_fkey FOREIGN KEY (jogo_nome_fk) REFERENCES public.jogo(jogo_nome);


--
-- TOC entry 2737 (class 2606 OID 16456)
-- Name: avaliacao avaliacao_usu_email_fk_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.avaliacao
    ADD CONSTRAINT avaliacao_usu_email_fk_fkey FOREIGN KEY (usu_email_fk) REFERENCES public.usuario(usu_email);


-- Completed on 2019-06-04 22:47:20

--
-- PostgreSQL database dump complete
--

