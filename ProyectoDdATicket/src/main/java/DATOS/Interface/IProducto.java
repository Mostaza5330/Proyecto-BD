/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DATOS.Interface;
import DATOS.Entity.Producto;
import DATOS.Entity.Producto;
import java.util.List;
/**
 *
 * @author eduar
 */
public interface IProducto {
    public boolean agregar(Producto producto);
    public boolean eliminar(int id);
    public boolean actualizar (Producto producto);
    public Producto consultar(int id);
    public List<Producto> consultar();
}
