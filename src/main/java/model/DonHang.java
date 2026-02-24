package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "don_hang")
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_khach_hang")
    private String tenKhachHang;

    @Column(name = "ngay_mua")
    private Date ngayMua;

    @Column(name = "tong_tien")
    private Float tongTien;

    @Column(name = "da_thanh_toan")
    private Boolean daThanhToan;

    @ManyToOne
    @JoinColumn(name = "id_san_pham", referencedColumnName = "id")
    private SanPham sanPham;
}
