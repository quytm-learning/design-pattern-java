# Prototype Design Pattern

Prototype được sử dụng khi việc khởi tạo tốn nhiều thời gian, chi phí và
resource trong khi đó ta đã có sẵn instance đã được khởi tạo trước đó.

Thay vì liên tục gọi new Object... thì ta sẽ khởi tạo 1 đối tượng sẵn,
sau đó clone nó cho các instance khác -> tiết kiệm chi phí, thời gian