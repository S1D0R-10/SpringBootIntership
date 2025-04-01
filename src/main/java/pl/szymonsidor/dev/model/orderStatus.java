package pl.szymonsidor.dev.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum orderStatus {
    NOWE,
    W_TRAKCIE,
    ZAKONCZONE,
    ANULOWANE
}
