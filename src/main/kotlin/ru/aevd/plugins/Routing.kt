package ru.aevd.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject
import ru.aevd.room.RoomController
import ru.aevd.routes.chatSocket
import ru.aevd.routes.getAllMessages

fun Application.configureRouting() {
    install(Routing) {
        val roomController by inject<RoomController>()
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
