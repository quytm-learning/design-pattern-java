# Factory design pattern

Factory pattern là 1 Creational Design Pattern được sử dụng rộng rãi
trong JDK và các framework (như Spring, Struts, ...)

Factory được sử dụng trong trường hợp 1 class cha, có nhiều class con thừa
kế, và dựa vào input có thể xác định được class con nào được gọi đến.

Giống như một nhà máy, ta đưa nguyên liệu vào, nhà máy phân loại chúng và
sản xuất ra các sản phẩm khác nhau dựa vào nguồn nguyên liệu đầu vào đó.