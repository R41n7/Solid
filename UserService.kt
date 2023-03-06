// Класс UserService, представляющий сервис для работы с пользователями

abstract class UserService : IUserDetails, IUserActions { // интерфейсы IUserDetails и IUserActions
    abstract fun actionsWithUser()
}