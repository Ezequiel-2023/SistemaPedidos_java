
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDePedidos {
    static ArrayList<Pedido> pedidos = new ArrayList<>();
    static ArrayList<UsuarioAutenticado> usuarios = new ArrayList<>();
    static UsuarioAutenticado usuarioAutenticado = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\nSistema de Pedidos");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Cerrar sesión");
            System.out.println("4. Agregar pedido");
            System.out.println("5. Editar pedido");
            System.out.println("6. Listar pedidos");
            System.out.println("7. Eliminar pedido");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    registrarUsuario(scanner);
                    break;
                case 2:
                    iniciarSesion(scanner);
                    break;
                case 3:
                    cerrarSesion();
                    break;
                case 4:
                    agregarPedido(scanner);
                    break;
                case 5:
                    editarPedido(scanner);
                    break;
                case 6:
                    listarPedidos();
                    break;
                case 7:
                    eliminarPedido(scanner);
                    break;
                case 8:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }

    static void registrarUsuario(Scanner scanner) {
        System.out.print("Ingrese nombre de usuario: ");
        String userName = scanner.nextLine();
        System.out.print("Ingrese email: ");
        String corre = scanner.nextLine();
        System.out.print("Ingrese contraseña: ");
        String password = scanner.nextLine();
        int id = usuarios.size() + 1;
        UsuarioAutenticado nuevoUsuario = new UsuarioAutenticado(id, userName, password, corre);
        usuarios.add(nuevoUsuario);
        System.out.println("Usuario registrado con éxito.");
    }

    static void iniciarSesion(Scanner scanner) {
        System.out.print("Ingrese email: ");
        String corre = scanner.nextLine();
        System.out.print("Ingrese contraseña: ");
        String password = scanner.nextLine();
        for (UsuarioAutenticado usuario : usuarios) {
            if (usuario.getCorre().equals(corre) && usuario.getPassword().equals(password)) {
                usuarioAutenticado = usuario;
                System.out.println("Sesión iniciada con éxito.");
                return;
            }
        }
        System.out.println("Credenciales incorrectas.");
    }

    static void cerrarSesion() {
        usuarioAutenticado = null;
        System.out.println("Sesión cerrada.");
    }

    static void agregarPedido(Scanner scanner) {
        if (usuarioAutenticado != null) {
            int idPedido = pedidos.size() + 1;
            System.out.print("Ingrese nombre de quien envía el pedido: ");
            String nombreDeQuienEnvia = scanner.nextLine();
            System.out.print("Ingrese tipo de pedido: ");
            String tipoPedido = scanner.nextLine();
            System.out.print("Ingrese descripción del pedido: ");
            String descripcion = scanner.nextLine();
            System.out.print("Ingrese fecha de entrega: ");
            String fechaDeEntrega = scanner.nextLine();
            System.out.print("Ingrese fecha de recolección: ");
            String fechaDeRecoleccion = scanner.nextLine();
            System.out.print("Ingrese cantidad de artículos: ");
            int cantidadDeArticulos = scanner.nextInt();
            System.out.print("Ingrese costo del pedido: ");
            float costo = scanner.nextFloat();
            scanner.nextLine();  // Limpiar el buffer

            Pedido pedido = new Pedido(idPedido, nombreDeQuienEnvia, tipoPedido, descripcion, fechaDeEntrega, fechaDeRecoleccion, cantidadDeArticulos, costo);
            pedidos.add(pedido);
            System.out.println("Pedido agregado con éxito.");
        } else {
            System.out.println("Acceso denegado. Debe estar autenticado para agregar pedidos.");
        }
    }

    static void editarPedido(Scanner scanner) {
        if (usuarioAutenticado != null) {
            System.out.print("Ingrese ID del pedido a editar: ");
            int idPedido = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer
            for (Pedido pedido : pedidos) {
                if (pedido.getIdePedido() == idPedido) {
                    System.out.print("Ingrese nuevo nombre de quien envía el pedido (dejar en blanco para no cambiar): ");
                    String nombreDeQuienEnvia = scanner.nextLine();
                    if (!nombreDeQuienEnvia.isEmpty()) {
                        pedido.setNombreClientePedido(nombreDeQuienEnvia);
                    }
                    System.out.print("Ingrese nuevo tipo de pedido (dejar en blanco para no cambiar): ");
                    String tipoPedido = scanner.nextLine();
                    if (!tipoPedido.isEmpty()) {
                        pedido.setTipoPedido(tipoPedido);
                    }
                    System.out.print("Ingrese nueva descripción del pedido (dejar en blanco para no cambiar): ");
                    String descripcion = scanner.nextLine();
                    if (!descripcion.isEmpty()) {
                        pedido.setDescripcion(descripcion);
                    }
                    System.out.print("Ingrese nueva fecha de entrega (dejar en blanco para no cambiar): ");
                    String fechaDeEntrega = scanner.nextLine();
                    if (!fechaDeEntrega.isEmpty()) {
                        pedido.setFechaDeEntrega(fechaDeEntrega);
                    }
                    System.out.print("Ingrese nueva fecha de recolección (dejar en blanco para no cambiar): ");
                    String fechaDeRecoleccion = scanner.nextLine();
                    if (!fechaDeRecoleccion.isEmpty()) {
                        pedido.setFechaDeRecoleccion(fechaDeRecoleccion);
                    }
                    System.out.print("Ingrese nueva cantidad de artículos (dejar en blanco para no cambiar): ");
                    String cantidadDeArticulos = scanner.nextLine();
                    if (!cantidadDeArticulos.isEmpty()) {
                        pedido.setCantidadDeArticulos(Integer.parseInt(cantidadDeArticulos));
                    }
                    System.out.print("Ingrese nuevo costo del pedido (dejar en blanco para no cambiar): ");
                    String costo = scanner.nextLine();
                    if (!costo.isEmpty()) {
                        pedido.setCosto(Float.parseFloat(costo));
                    }
                    System.out.println("Pedido editado con éxito.");
                    return;
                }
            }
            System.out.println("Pedido no encontrado.");
        } else {
            System.out.println("Acceso denegado. Debe estar autenticado para editar pedidos.");
        }
    }

    static void listarPedidos() {
        if (usuarioAutenticado != null) {
            System.out.println("Lista de Pedidos:");
            for (Pedido pedido : pedidos) {
                System.out.println("ID: " + pedido.getIdePedido() +
                        ", Nombre: " + pedido.getNombreClientePedido() +
                        ", Tipo: " + pedido.getTipoPedido() +
                        ", Descripción: " + pedido.getDescripcion() +
                        ", Fecha de Entrega: " + pedido.getFechaDeEntrega() +
                        ", Fecha de Recolección: " + pedido.getFechaDeRecoleccion() +
                        ", Cantidad: " + pedido.getCantidadDeArticulos() +
                        ", Costo: " + pedido.getCosto());
            }
        } else {
            System.out.println("Acceso denegado. Debe estar autenticado para listar pedidos.");
        }
    }

    static void eliminarPedido(Scanner scanner) {
        if (usuarioAutenticado != null) {
            System.out.print("Ingrese ID del pedido a eliminar: ");
            int idPedido = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer
            for (Pedido pedido : pedidos) {
                if (pedido.getIdePedido() == idPedido) {
                    pedidos.remove(pedido);
                    System.out.println("Pedido eliminado con éxito.");
                    return;
                }
            }
            System.out.println("Pedido no encontrado.");
        } else {
            System.out.println("Acceso denegado. Debe estar autenticado para eliminar pedidos.");
        }
    }
}
