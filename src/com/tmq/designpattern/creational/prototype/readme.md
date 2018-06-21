# Prototype Design Pattern

Prototype được sử dụng khi việc khởi tạo tốn nhiều thời gian, chi phí và
resource trong khi đó ta đã có sẵn instance đã được khởi tạo trước đó.

Thay vì liên tục gọi new Object... thì ta sẽ khởi tạo 1 đối tượng sẵn,
sau đó clone nó cho các instance khác -> tiết kiệm chi phí, thời gian

## Khi nào nên sử dụng Prototype
- Việc định nghĩa, khai báo, khởi tạo tách biệt với hệ thống hiện tại
(do nó phức tạp và không cần thiết đối với client)
- Tuy nhiên cũng có khi, ta cần che giấu những thứ đó đối với client
- Dùng cho các lớp class được tạo được xác định tại thời điểm runtime (??? hơi khó hiểu)
- Việc khởi tạo tốn kém thời gian, do đó ta clone nó
- Hay là object cần dùng giống với object đã có sẵn

## Ưu điểm
- Tiết kiệm chi phí, thời gian khởi tạo
- Tạo đối tượng mới mà không cần phải init nó, ta chỉ việc clone và thay đổi thuộc tính của nó là có thể tạo ra 
đối tượng mới với state mới, chức năng mới. Clone trong prototype cũng tương đương với tạo một instance mới cho classs
- Config các tham số dynamic cho ứng dụng (chưa giải thích đc)

## Nhược điểm và Những điểm cần chú ý khi sử dụng 

- Dữ liệu có độ stable cao thì nên sử dụng, bởi vì trong khi clone, hay sau khi clone object xong, dữ liệu có update thì 
có mà ăn shit, lúc đó nó không còn là mới nhất nữa (dirty) -> Cái này liên quan tới việc khi nào nên sử dụng Prototype
- Việc clone có thể bị gián đoạn hoặc không thể thực hiện khi mà trong object đó có chứa đối tượng không support cho việc 
clone hoặc chứa các tham chiếu vòng (circular references), vì vậy khi mà ta sử dụng đối tượng bên ngoài (libs, ...) 
có thể sẽ gặp phải trường hợp fail do nó không hỗ trợ clone
- Cần hiểu rõ về cấu trúc dữ liệu trong object mà ta clone, bởi vì nó sẽ không có ý nghĩa khi ta clone xong mà không thể 
thay đổi được một điều gì đó
- Trong class có thể có những đối tượng được init sau, vì vậy cần chú ý tới thời điểm clone để tránh việc bỏ sót dữ liệu
-  It hides the concrete product classes from the client, thereby reducing the number of names clients know about
(Vẫn chưa hiểu được câu này)

[Link tham khảo](http://java.boot.by/scea5-guide/ch07s03.html)