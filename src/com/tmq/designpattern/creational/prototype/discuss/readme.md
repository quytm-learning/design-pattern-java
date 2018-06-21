# Ví dụ
Ví dụ về việc sử dụng sai Prototype

Như đã biết, việc Prototype có thể sử dụng cho việc fetch dữ liệu từ DB.
Tuy nhiên tùy vào từng context cụ thể thì việc sử dụng nó mới hiệu quả,
ví dụ trong phần này là một minh chứng cho điều đó.

**Scenario**: Fetch danh sách các Record từ DB
**Action**: Dữ liệu được clone, sử dụng trên nhiều thread, các thread này
sau khi nhận dữ liệu thì thực hiện việc update dữ liệu vào DB

**Hệ quả**: Dữ liệu bị thay đổi loạn xạ, không thể kiểm soát
=> **Nguyên nhân**: Do việc sử dụng Prototype không hợp lý, dữ liệu
không stable do đó sau 1 thời gian ngắn, nó không còn đúng nữa