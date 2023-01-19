package com.rlapi.rlapi.Entity;

import jakarta.persistence.*;
import lombok.*;

@RequiredArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="DATATYPE_TBL")
public class DataType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @NonNull
    @Column(name = "type_desc", nullable = false)
    private String type_desc;
    
    @NonNull
    @Column(name = "rank", nullable = false)
    private Integer rank;

}
