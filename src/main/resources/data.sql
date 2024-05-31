-- jumin 데이터 삽입
INSERT INTO jumin (jumin, name, phone, address) VALUES
('710101-1000001', '김주민', '010-1111-1111', '경기도 성남시 수정구 태평1동'),
('720101-2000001', '이주민', '010-111-2222', '경기도 성남시 수정구 태평2동'),
('730101-1000001', '박주민', '010-1111-3333', '경기도 성남시 수정구 복정동'),
('740101-2000001', '홍주민', '010-1111-4444', '경기도 성남시 수정구 산성동'),
('750101-1000001', '조주민', '010-1111-5555', '경기도 성남시 수정구 성남동'),
('760101-2000001', '최주민', '010-1111-6666', '경기도 성남시 수정구 중앙동'),
('770101-1000100', '장주민', '010-1111-7777', '경기도 성남시 수정구 상대원동'),
('780101-2000001', '정주민', '010-1111-8888', '경기도 성남시 수정구 하대원동'),
('790101-1000001', '강주민', '010-1111-9999', '경기도 성남시 수정구 야탑1동'),
('800101-2000001', '신주민', '010-2222-1111', '경기도 성남시 수정구 야탑2동');

-- hospital 데이터 삽입
INSERT INTO hospital (hosp_code, hosp_name, hosp_tel, hosp_addr) VALUES
('H001', '가_병원', '031-1111-2222', '10'),
('H002', '나_병원', '031-1111-3333', '20'),
('H003', '다_병원', '031-1111-4444', '30'),
('H004', '라_병원', '031-1111-5555', '40');

-- vacresv 데이터 삽입
INSERT INTO vaccresv (resv_no, jumin, hosp_code, resv_date, resv_time, v_code) VALUES
(1, '710101-1000001', 'H001', '2024-01-01', '0830', 'V001'),
(2, '720101-2000001', 'H002', '2024-02-01', '0930', 'V002'),
(3, '730101-1000001', 'H003', '2024-03-01', '1030', 'V003'),
(4, '740101-2000001', 'H001', '2024-04-01', '0130', 'V001'),
(5, '750101-1000001', 'H001', '2024-05-01', '1230', 'V002'),
(6, '760101-2000001', 'H002', '2024-06-01', '0130', 'V003'),
(7, '700101-1000100', 'H003', '2024-07-01', '1430', 'V001'),
(8, '780101-2000001', 'H001', '2024-08-01', '1530', 'V002'),
(9, '790101-1000001', 'H001', '2024-09-01', '1630', 'V003'),
(10,'800101-2000001', 'H002', '2024-10-01', '1730', 'V001');