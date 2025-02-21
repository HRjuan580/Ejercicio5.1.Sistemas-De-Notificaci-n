class MensajeDeTexto: Nofificable {
    override fun enviarNotificacion(msj : String) {
        println("Mensaje de texto enviado: $msj")
    }
}