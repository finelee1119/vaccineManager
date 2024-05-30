-- 주민정보 jumin 테이블 생성
CREATE TABLE IF NOT EXISTS jumin (
    jumin VARCHAR(20) NOT NULL PRIMARY KEY,
    name VARCHAR(15),
    phone VARCHAR(15),
    address VARCHAR(50)
);

-- 병원정보 hospital 테이블 생성
CREATE TABLE IF NOT EXISTS hospital (
    host_code VARCHAR(4) NOT NULL PRIMARY KEY,
    host_name VARCHAR(40),
    host_tel VARCHAR(15),
    host_addr VARCHAR(2)
);

-- 백신예약정보 vaccresv 테이블 생성
CREATE TABLE IF NOT EXISTS vaccresv (
    resv_no BIGINT NOT NULL PRIMARY KEY,
    jumin VARCHAR(20),
    hosp_code VARCHAR(4),
    resv_date DATE,
    resv_time VARCHAR(4),
    v_code VARCHAR(4)
);