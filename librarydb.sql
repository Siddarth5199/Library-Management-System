create table login(
	login_ID int,
	username varchar(30),
	password varchar(30),
	user_ID int,
	constraint pk_login PRIMARY KEY (login_ID)
);


create table shelf(
	shelf_ID int,
	snumber int,
	constraint pk_shelf PRIMARY KEY (shelf_ID)
);


create table research_papers(
	research_id int,
	topic varchar(50),
	faculty_name varchar(30),
	faculty_ID int,
	constraint pk_research PRIMARY KEY (research_id)
);


create table recommended_books(
	book_ID int,
	book_name varchar(30),
	faculty_id int,
	faculty_name varchar(30),
	constraint pk_recommended PRIMARY KEY (book_ID)
);


create table admin(
	admin_ID int,
	salary int,
	constraint pk_admin PRIMARY KEY (admin_ID)
);


create table reference_books(
	CR_ID int,
	constraint pk_CR PRIMARY KEY (CR_ID)
);


create table borrowable_books(
	bbook_ID int,
	status boolean,
	constraint pk_bbook PRIMARY KEY (bbook_ID)
);


create table books(
	ISBN int,
	bookname varchar(30),
	author varchar(30),
	edition_b char(9),
	shelf_ID int,
	constraint pk_book PRIMARY KEY (ISBN)
);


create table student(
	student_ID int,
	program varchar(30),
	rollno varchar(15),
	constraint pk_student PRIMARY KEY (student_ID)
);


create table faculty(
	faculty_ID int,
	department varchar(30),
	constraint pk_faculty PRIMARY KEY (faculty_ID)
);


create table librarian(
	librarian_ID int,
	salary int,
	work_shift varchar(10),
	constraint pk_librarian PRIMARY KEY (librarian_ID)
);


create table users(
	users_ID int,
	username varchar(30),
	profession varchar(30),
	constraint pk_user PRIMARY KEY (users_ID)
);


create table borrower(
	b_ID int,
	borrower_type varchar(20),
	constraint pk_borrower PRIMARY KEY (b_ID)
);


create table issue_log(
	issue_ID int,
	book_ID int,
	student_ID int,
	date_issued date,
	expected_return date,
	return_date date,
	constraint pk_issue PRIMARY KEY (issue_ID)
);


create table penalty(
	penalty_ID int,
	issue_ID int,
	amount int,
	description varchar(30),
	constraint pk_penalty PRIMARY KEY (penalty_ID)
);



alter table login
	add constraint fk_user_ID FOREIGN KEY (user_ID) REFERENCES users(users_ID)
	ON DELETE CASCADE;

alter table books
	add constraint fk_shelf_ID FOREIGN KEY (shelf_ID) REFERENCES shelf(shelf_ID) 
	ON DELETE SET NULL;

alter table research_papers
	add constraint fk_faculty_ID FOREIGN KEY (faculty_ID) REFERENCES faculty(faculty_ID)
	ON DELETE SET NULL;

alter table recommended_books
	add constraint fk_f_ID FOREIGN KEY (faculty_ID) REFERENCES faculty(faculty_ID)
	ON DELETE SET NULL;

alter table reference_books
	add constraint fk_CR_ID FOREIGN KEY (CR_ID) REFERENCES books(ISBN)
	ON DELETE CASCADE;

alter table borrowable_books
	add constraint fk_bbook_ID FOREIGN KEY (bbook_ID) REFERENCES books(ISBN)
	ON DELETE CASCADE;

alter table student
	add constraint fk_student_ID FOREIGN KEY (student_ID) REFERENCES users(users_ID)
	ON DELETE CASCADE;

alter table faculty
	add constraint fk_facul_ID FOREIGN KEY (faculty_ID) REFERENCES users(users_ID)
	ON DELETE CASCADE;

alter table librarian
	add constraint fk_librarian_ID FOREIGN KEY (librarian_ID) REFERENCES users(users_ID)
	ON DELETE CASCADE;

alter table borrower
	add constraint fk_b_ID FOREIGN KEY (b_ID) REFERENCES users(users_ID)
	ON DELETE CASCADE;

alter table issue_log
	add constraint fk_issuebook_ID FOREIGN KEY (book_ID) REFERENCES books(ISBN);
	
alter table issue_log
	add constraint fk_stud_ID FOREIGN KEY (student_ID) REFERENCES student(student_ID);

alter table penalty
	add constraint fk_issue_ID FOREIGN KEY (issue_ID) REFERENCES issue_log(issue_ID)
	ON DELETE CASCADE;
