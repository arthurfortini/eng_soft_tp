package com.queens.gambit.api.application;

public interface MessageConstants {

    String MESSAGE_USER_NOT_FOUND = "Couldn't find User with login %s";
    String MESSAGE_GAME_NOT_FOUND = "Couldn't find Game with name %s";
    String MESSAGE_USER_ALREADY_PERSISTED = "User already save on database. User login: %s. Provide another login";
    String MESSAGE_USER_IS_NOT_ADMIN = "Attempt to assign non-admin user as admin of machine. User login: %s";
    String MESSAGE_ERROR_PERSISTING_MACHINE = "An error ocurred while persisting User with login %s";
    String MESSAGE_ERROR_PERSISTING_USER = "An error ocurred while persisting User %s";
    String MESSAGE_ERROR_PERSISTING_MACHINE_EVENT_LOG = "An error ocurred while persisting event log for Machine %s";
    String MESSAGE_ERROR_USER_ALREADY_HAVE_ACESS = "User %s already have acess to Machine %s";

}
