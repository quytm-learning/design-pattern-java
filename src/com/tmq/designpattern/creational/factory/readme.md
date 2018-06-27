# Factory design pattern

Factory pattern là 1 Creational Design Pattern được sử dụng rộng rãi
trong JDK và các framework (như Spring, Struts, ...)

Factory được sử dụng trong trường hợp 1 class cha, có nhiều class con thừa
kế, và dựa vào input có thể xác định được class con nào được gọi đến.

Giống như một nhà máy, ta đưa nguyên liệu vào, nhà máy phân loại chúng và
sản xuất ra các sản phẩm khác nhau dựa vào nguồn nguyên liệu đầu vào đó.

## Implementation

Điều kiện: class cha có nhiều class con, loại class con được định nghĩa
dựa vào dữ liệu đầu vào.

![](https://cdn.journaldev.com/wp-content/uploads/2013/05/factory-pattern-java.png)

Các bước để implements Factory design pattern:

- Class cha, có thể interface, abstract hoặc class bình thường
- Class con
- Class Factory chứa method có thể return về class con, method này nên
 là static, còn class Factory có thể là singleton

# Chú ý

- Factory cung cấp một cách tiếp cận với việc code cho interface hơn là các implementations
của nó
- Factory loại bỏ việc khởi tạo instances từ client, nó mạnh mẽ hơn, ít phụ thuộc và dễ
dàng mở rộng. Ví dụ: ta có thể thay đổi cách implementation của class PC mà client 
không cần phải biết điều này
- Factory cung cấp sự trừu tượng giữa implementations và client thông qua kế thừa
