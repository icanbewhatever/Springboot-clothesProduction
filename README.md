# 스프링부트를 이용한, 의류 제조업체를 위한 웹 솔루션 개발

## 📌 목차
1. [🖥️ 프로젝트 개요](#-프로젝트-개요)
2. [📕 주요기능](#-주요기능)
3. [🔧 아키텍처](#-아키텍처)
4. [🏗️ ERD](#-ERD)
5. [⚠️ 트러블 슈팅](#-트러블-슈팅)
   <br><br>

## 🖥️ 프로젝트 개요
### ⏲️ 프로젝트 개발 기간
  - 2024.03.11 ~ 2024.03.19

### 🔖프로젝트 주제
  - 대상: 의류 쇼핑몰을 경영하는 가상의 기업 선정
  - 용도: 의류샘플 주문 → 입고 → 출고/판매 프로세스를 효율적, 체계적으로 관리할 수 있는 시스템
  - 개발: JSP로 만든 코드를 SpringBoot(Maven Project)로 수정하여 웹 솔루션 개발
### 📁프로젝트 구현 내용
  - 의류 쇼핑몰의 프로세스 별 데이터의 CRUD 기능 구현
### ⚙️ 개발환경 및 도구
  - `JAVA 17`
  - `JDK 17.0.2`
  - **IDE**: IntelliJ
  - **Framework**: Springboot(3.1.10)
  - **DataBase**: Oracle DB(ojdbc8)
  - **ORM**: Mybatis
  - **DevOps**: Maven, Git, GitHub
  - **Tools**: Discord, GoogleDrive, StarUML
### 🧑‍🤝‍🧑 멤버 구성
|팀원명|담당업무|
|---|---|
|[박지평(팀장)]|메인 화면, 입출고 관리, 재고 관리 CRUD|
|[이현주(팀원)]|주문의뢰서 CRUD, 주문현황 CRU|
|[김다은(팀원)]|제품관리 CRUD|
|[조성민(팀원)]|로그인, 회원가입|


<br><br>

## 📕 주요기능
원목 가구를 생산/제조하는 업체에서 사용하는 MES 시스템 프로그램을 제공한다.

<details>
  <summary><b>1. 로그인/비밀번호 재설정 [조성민]</b> (👈 Click)</summary>
  <br>
  <div markdown="1">
    <h3>회원가입</h3>
    <ul>
      <li>기존 중복체크 기능 보완하여 체크 시 alert창에서 중복시 빨간색 글씨로 중복 여부 나오도록 변경 Ajax 기능으로 구현</li>
      <img src="https://github.com/icanbewhatever/Basic/assets/139785614/c6397ba2-2082-4447-a6f5-324631b2b0ef" alt="회원가입1">
      <li>로그인 실패 시, Config의 오류 메시지를 받아서 View로 반환한다.</li>
      <img src="https://github.com/icanbewhatever/Basic/assets/139785614/5179b8da-be51-4329-b936-2debbf05bc40" alt="회원가입2">
    </ul>
    <br>
    <h3>로그인</h3>
    <ul>
      <li>기존의 자바 스크립트 구현 코드 스프링 부트로 구현 UserController 등 로직 만들어 로그인 가능</li>
      <img src="https://github.com/icanbewhatever/Basic/assets/139785614/c08ec512-1e7e-422e-af98-5dc54a6e8aaf" alt="로그인1">
    </ul>
  </div>
</details>

<details>
  <summary><b>2. 입고,출고,재고 관리 [박지평]</b> (👈 Click)</summary>
  <br>
  <div markdown="1">
    <h3>메인 화면</h3>
    <ul>
      <li>년도별로 “판매가-(원가+부가세)”로 월별로 계산하여 그래프 표시</li>
      <img src="https://github.com/icanbewhatever/Basic/assets/139785614/2151c774-a14c-4085-9092-7b0f87fae05f" alt="메인1">
    </ul>
    <br>
    <h3>입출고 관리</h3>
    <ul>
      <li>조회 내용 선택 시 왼편에 자동으로 기입되며 제품명으로 조회할 수 있다.</li>
      <li>@RestController Ajax로 구현하여 새로고침 없이 실시간으로 동작하게 만들었습니다.</li>
      <img src="https://github.com/icanbewhatever/Basic/assets/139785614/6af776c2-f572-40c1-bfa6-9b65c8d63b16" alt="입출고1">
    </ul>
    <br>
    <h3>재고 관리</h3>
    <ul>
      <li> 현 재고와 기간 별 재고로 나뉘어 있으며 변경 시 검색 조건과 검색 내용을 변경 할 수 있다.</li>
      <img src="https://github.com/icanbewhatever/Basic/assets/139785614/294a9203-8b7e-4b24-9ec2-0a1079c9f88f" alt="재고관리1">
      <img src="https://github.com/icanbewhatever/Basic/assets/139785614/a6caadcf-6555-4a1d-87eb-d34d3e4f2a7c" alt="재고관리2">
    </ul>
  </div>
</details>

<details>
  <summary><b>3. 재품관리, [김다은]</b> (👈 Click)</summary>
  <br>
  <div markdown="1">
    <h3>재품관리</h3>
    <ul>
      <li>제품 등록</li>
      <img src="https://github.com/icanbewhatever/Basic/assets/139785614/24adeb0c-220b-45b9-b77f-3b4ab9c26eb3" alt="제품등록1">
      <li>제품 검색 후, 검색한 데이터 내에서도 온체인지가 될 수 있도록 코드를 수정했습니다.</li>
      <img src="https://github.com/icanbewhatever/Basic/assets/139785614/36942d4e-2521-4a17-93f6-95a71c7f8ae9" alt="제품정렬1">
      <img src="https://github.com/icanbewhatever/Basic/assets/139785614/967ea8fa-c61f-4292-a31e-d60a46ba9f05" alt="제품정렬2">
    </ul>
    <br>
  </div>
</details>

<details>
  <summary><b>4. 주문의뢰서, 주문현황 [이현주]</b> (👈 Click)</summary>
  <br>
  <div markdown="1">
    <h3>주문의뢰서</h3>
    <ul>
      <li>주문의뢰서 조회 및 검색인터페이스를 mapper.xml 에 choose, when, trim을 사용해 처리</li>
      <img src="https://github.com/icanbewhatever/Basic/assets/139785614/a40cbe38-1b1b-46c2-8822-7adc52e66740" alt="주문의뢰서1">
      <br>
      <li>페이지네이션을 위한 도메인(VO)을 따로 생성 및 총 게시글의 페이지 수와 검색시 페이지 수를 mapper에 적용한 후 JSP에 입력해 처리</li>
      <img src="https://github.com/icanbewhatever/Basic/assets/139785614/769255ad-9103-41de-9115-3e15aed2a9d1" alt="주문의뢰서2">
      <img src="https://github.com/icanbewhatever/Basic/assets/139785614/a77a2a24-79be-4a57-b6e4-1cda431aa883" alt="주문의뢰서3">
    </ul>
    <br>
    <h3>주문현황</h3>
    <ul>
      <li>자바스크립트를 사용해 주문번호와 주문현황댓글번호가 일치 할 경우 주문번호 더블클릭시 주문현황을 볼 수 있다</li>
      <img src="https://github.com/icanbewhatever/Basic/assets/139785614/d73b4d96-5c67-49bb-b2c0-3dc6b8d9d591" alt="주문현황1">
      <img src="https://github.com/icanbewhatever/Basic/assets/139785614/44c657a9-d2e9-4927-a128-e897b826b832" alt="주문현황2">
      <li>외부라이브러리 Sweetalert2 모달창 사용</li>
      <img src="https://github.com/icanbewhatever/Basic/assets/139785614/239f2c3c-e454-4f53-a800-61938a317f57" alt="Sweetalert2">
    </ul>
  </div>
</details>

<br><br>

## 🔧 아키텍처
예시는 아래와 같다.<br>
![image](https://github.com/icanbewhatever/Basic/assets/139785614/c2d5d1b9-e069-49fe-96e9-c33fa9dd6a52)
<br><br>

## 🏗️ ERD
DB와 ERD <br>
![image](https://github.com/icanbewhatever/Basic/assets/139785614/2e520c9d-3e15-407c-aa0d-0836f84d203a)
<br><br>

## ⚠️ 트러블 슈팅
<br><br>

## 📽️ 작동 영상
[🎞️ 작동영상](https://drive.google.com/file/d/1EDnsW60zZSrcG14xzo5LZ-SlpSSHnMYi/view?usp=sharing)
<br><br>
