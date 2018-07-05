# Strategy Design Pattern

## Tổng quan

Strategy là một pattern thuộc nhóm Behavioral design pattern

Strategy pattern (mẫu chiến lược): hiểu một cách đơn giản thì đây là
mẫu thiết kế giúp bạn trừu tượng hóa những hành vi (behavior, method, function)
của một đối tượng bằng cách đưa ra những cài đặt vào những lớp khác nhau.

Hay

Strategy pattern được sử dụng khi ta có nhiều thuật toán cho một nhiệm vụ cụ thể
và client sẽ quyết định sử dụng thuật toán nào cho nhiệm vụ đó.


Ví dụ cụ thể cho Strategy đó là Collections.sort()

![diagram](https://i.stack.imgur.com/M6f7O.png)

## Implementation

Trong code demo có triển khai mô hình:

![diagram](https://cdn.journaldev.com/wp-content/uploads/2013/07/Strategy-Pattern-450x261.png)

## Note

Cần phân biệt Strategy và Command pattern, 2 thằng này khá là giống nhau,
Strategy sử dụng trong trường hợp có nhiều thuật toán để xử lý vấn đề,
nó thay đổi ruột của phương thức từ đó thay đổi luôn behavior của phương
thức đó, trong khi Command sử dụng trong trường hợp có nhiều action,
client sử dụng từng đối tượng Command thì sẽ nhận được một kết quả khác nhau

