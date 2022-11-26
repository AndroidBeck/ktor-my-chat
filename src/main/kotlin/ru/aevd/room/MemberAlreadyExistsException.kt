package ru.aevd.room

class MemberAlreadyExistsException : Exception(
    "There is a;ready a member with that username in the room"
)
