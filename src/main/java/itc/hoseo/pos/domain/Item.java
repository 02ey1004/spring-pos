package itc.hoseo.pos.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Item {
    //TODO 속성과 테스트케이스까지 만들기
    private Integer id;
    private String name;
    private Integer price;
    private Integer stockQuantity;


    public void addStock(int stock){
        stockQuantity += stock;
    }
    public void removeStock(int stock){
        stockQuantity -= stock;
    }
}
