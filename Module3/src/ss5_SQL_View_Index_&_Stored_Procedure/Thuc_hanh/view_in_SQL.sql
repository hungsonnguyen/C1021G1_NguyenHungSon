use classicmodels;

#Tạo View có tên customer_views truy vấn dữ liệu từ bảng customers để lấy các dữ liệu: customerNumber, customerName, phone bằng câu lệnh SELECT:
CREATE VIEW customer_views AS

SELECT customerNumber, customerName, phone

FROM  customers;
select * from customer_views;

#Cập nhật view
#Một view có thể cập nhật khi nó thỏa mãn các điều kiện

#View được định nghĩ từ một và chỉ một bảng cơ sở
#Trong câu lệnh SELECT định nghĩa view không được sử dụng từ khoá DISTINCT, TOP, GROUP BY, HAVING, ORDER_BY và UNION.
#Trong view không có bất kỳ SUBQUERIES nào được định nghĩa
#Các thành phần xuất hiện trong danh sách chọn của câu lệnh SELECT phải là các cột trong các bảng cơ sở. Trong danh sách chọn không được chứa các biểu thức tính toán, các hàm gộp.
#Các cột được ước lượng không thể bị cập nhật.
#Tất cả các cột NOT NULL từ bảng ban đầu phải được bao trong view để cho truy vấn INSERT vận hành.
#Khi view của bạn thỏa mãn tất cả các quy tắc trên thì bạn có thể cập nhật view bằng câu lệnh:

CREATE OR REPLACE VIEW customer_views AS

SELECT customerNumber, customerName, contactFirstName, contactLastName, phone

FROM customers

WHERE city = 'Nantes';


#Xoá view
#Khi bạn đã có 1 view, nhưng khi không sử dụng đến nó nữa, thì chúng ta nên xóa view đó đi. cú pháp để xóa view như sau: 

DROP VIEW view_name;
#Ví dụ: xoá view customer_views:

DROP VIEW customer_views;