/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

/**
 *
 * @author admin
 */
public class ChiTietHoaDonId implements Serializable {

    private UUID idCtdv;
    private UUID idHd;

    public ChiTietHoaDonId() {
    }

    public ChiTietHoaDonId(UUID idCtdv, UUID idHd) {
        this.idCtdv = idCtdv;
        this.idHd = idHd;
    }

    public UUID getIdCtdv() {
        return idCtdv;
    }

    public void setIdCtdv(UUID idCtdv) {
        this.idCtdv = idCtdv;
    }

    public UUID getIdHd() {
        return idHd;
    }

    public void setIdHd(UUID idHd) {
        this.idHd = idHd;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.idCtdv);
        hash = 97 * hash + Objects.hashCode(this.idHd);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ChiTietHoaDonId other = (ChiTietHoaDonId) obj;
        if (!Objects.equals(this.idCtdv, other.idCtdv)) {
            return false;
        }
        return Objects.equals(this.idHd, other.idHd);
    }

}
