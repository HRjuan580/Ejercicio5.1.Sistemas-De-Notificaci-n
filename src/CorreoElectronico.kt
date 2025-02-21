class CorreoElectronico: Nofificable {
    override fun enviarNotificacion(msj : String) {
        println("Correo electronico enviado: $msj")
    }
}