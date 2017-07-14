# Command Pattern

## Benefit

Bằng việc tách đối tượng điều khiển và đối tượng Command, ta có thể theo
dõi các hoạt động, trạng thái thông qua đối tượng Command. Từ đó có thể
implement thêm các operation như Undo, Redo, Recording, Queuing.

Việc áp dụng Command có những lợi ích sau:

- Đóng gói yêu cầu xử lý vào các class
- Phân tách đối tượng thực thi với các yêu cầu, và cung cấp cách xử lý các
nhiệm vụ một cách thống nhất
- Có thể implement thêm các operation như Undo, Redo, Recording, Queuing.
- Dễ dàng thêm một command mới mà không cần thay đổi class, thỏa mãn
Open Close design pattern

