package models

import locale.toLocalMoney
import java.io.Serializable

data class LineaVenta(
    val idVenta: Int, // No la necesitamos porque no estamos guardando la linea en la BD
    val idLineaVenta: Int,
    val idProducto: Int,
    val cantidad: Int,
    val precioProducto: Double
) : Serializable {
    val total: Double
        get() = precioProducto * cantidad

    fun toLocalString(): String {
        return "LineaVenta(idLineaVenta=$idLineaVenta, idProducto=$idProducto, cantidad=$cantidad, precioProducto=${precioProducto.toLocalMoney()}, total=${total.toLocalMoney()})"
    }
}