fun main(){
    val notificaciones: List<Nofificable> = listOf(
        CorreoElectronico(),
        MensajeDeTexto(),
        NotificacionPush()
    )

    notificaciones.forEach {nofificable ->
        nofificable.enviarNotificacion("¡Hola! ¿Como estas?")
    }
}