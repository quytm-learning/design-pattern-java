# Observer Design Pattern

**Observer**: người quan sát, người giám sát, ...

**Observer Design pattern** là một Behavior design pattern. Nó được sử dụng
khi ta muốn nhận được thông báo khi có bất kì thay đổi nào trong trạng
thái của object.

Trong Observer DP, object quan sát sự thay đổi trạng thái gọi là **Observer**,
object chịu sự giám sát, được quan sát gọi là **Subject**

- Subject chứa list các Observer để chúng gửi thông báo khi có thay đổi.
- Observer nên có method set các object có thể watch và các method mà Subject
có thể truy cập và thông báo, gửi notification

## Implementation

