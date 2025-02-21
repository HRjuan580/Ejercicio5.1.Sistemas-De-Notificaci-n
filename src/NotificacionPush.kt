class NotificacionPush: Nofificable {
    override fun enviarNotificacion(msj : String) {
        println("Notificacion push enviado: $msj")
    }
}