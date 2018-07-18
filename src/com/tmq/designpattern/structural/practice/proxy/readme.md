# Proxy

Proxy là một design pattern trong nhóm Structure

Proxy (có thể dịch là người đại diện), đúng như tên gọi của nó, Proxy pattern
cung cấp một cách truy cập vào đối tượng mà ta muốn làm việc với nó, nó như một
người đại diện, mà chỉ có thông qua nó ta mới làm việc được với object đó.

>  “Provide a surrogate or placeholder for another object to control access to it”

Proxy kiểm soát các thao tác mà client được phép làm đối với object nó đại diện.

## Tại sao cần sử dụng Proxy

Trong phần trên ta có thể hình dung được 1 phần về vai trò của proxy,
proxy được sử dụng khi:

- Muốn bảo vệ quyền truy xuất vào các phương thức của object.
- Muốn bổ sung trước khi thực hiện phương thức của object.
-  Muốn tạo object với chức năng được nâng cao hơn theo yêu cầu.

## Implementations

![proxy uml](https://www.oodesign.com/images/design_patterns/structural/proxy-design-pattern-implementation-uml-class-diagram.png)

Có 3 thành phần nằm trong proxy:

- **RealSubject**: chính là đối tượng mà client muốn làm việc với (nhưng không
làm việc trực tiếp)
- **Subject**: là interface được implemented bởi RealSubject, trong đó, nó
định nghĩa các service mà RealSubject có thể cung cấp, expose ra bên ngoài
- **Proxy**:
    - Là đối tượng có thể access vào RealSubject
    - Để đảm bảo tính thống nhất thì nó cần implement Subject interface
    - Có thể có trách nhiệm trong việc tạo hoặc xóa instance của RealSubject
    mà nó truy cập

## Một số kiểu proxy

Có nhiều kiểu proxy mà ta có thể implement, và sử dụng trong tùy từng trường
hợp cụ thể:

### Virtual Proxies

 Nó hướng tới việc tiết kiệm bộ nhớ, trì hoãn việc khởi tạo RealSubject
 cho tới khi nó được gọi tới ở nơi sử dụng.

 Các RealSubject trong case này
 thường là các đối tượng mà việc khởi tạo tốn kém nhiều time và resource,
 nó làm cho việc khởi động một app hoặc chức năng trở nên nặng nề, trong
 khi đó nó vẫn chưa được dùng tới.

Trong này, RealSubject được khởi tạo trong `doOperation()`

### Protection Proxies

Phân quyền truy cập cho từng kiểu client, do đó, mặc dù vẫn có API expose
ra ngoài (thông qua proxy) nhưng tùy vào kiểu client mà nó có thể access
hoặc không thể access vào API đó

### Remote Proxies

Cung cấp một cách truy cập giữa các đối tượng nằm trong một môi trường
khác. Dễ hình dung nhất là việc server cung cấp proxy cho client ở đâu
đó trong internet có thể remote lên đó và thao tác một số action mà proxy
cho phép
