package buoi3.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

    @OneToMany
    @JoinColumn(name = "id_san_pham", referencedColumnName = "id")
    private SanPham sanPham;
}
