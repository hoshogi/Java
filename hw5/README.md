# 과제 5
1. Student 클래스에 속성(이름, 학과, 학번, 학점평균)정보를 가진 필드가 있다. 3명의 학생 객체를 ArrayList<Student> 컬렉션에 저장한 후 출력하는 프로그램을 작성하시오. 단, 학생 객체의 모든 속성은 private로 하고 컬렉션을 검색할 때 Iterator 클래스의 hasNext(), next() 메서드, Student 클래스의 toString()을 사용하여 출력하시오.

- 실행결과
```
Enter student information

student name    : Kim
department      : History
student #       : 20772
average score   : 3.9

Are you finished entering the data? (Yes (y), No (n)) : n
student name    : Hong
department      : Law
student #       : 204573
average score   : 4.5

Are you finished entering the data? (Yes (y), No (n)) : n
student name    : Lee
department      : Computer Eng
student #       : 202056
average score   : 4.3

Are you finished entering the data? (Yes (y), No (n)) : y
---------------------------------------------
student name    :       Kim
department      :       History
student #       :       20772
average score   :       3.9
---------------------------------------------

---------------------------------------------
student name    :       Hong
department      :       Law
student #       :       204573
average score   :       4.5
---------------------------------------------

---------------------------------------------
student name    :       Lee
department      :       Computer Eng
student #       :       202056
average score   :       4.3
---------------------------------------------
```  