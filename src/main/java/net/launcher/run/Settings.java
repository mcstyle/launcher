package net.launcher.run;

public class Settings {

    public static final String projectLinkLabel = "www.craftorio.com";
    public static final String projectLinkUrl = "https://craftorio.com";
    public static final String toHelpUrl = projectLinkUrl + "/forum";
    public static final String toAccountUrl = projectLinkUrl + "/account";

    /**
     * Настройка заголовка лаунчера
     */
    public static final String title = "Craftorio"; //Заголовок лаунчера
    public static final String titleInGame = "Craftorio"; //Заголовок лаунчера после авторизации
    public static final String baseconf = "craftorio"; //"voxelaria"; //Папка с файлом конфигурации
    public static final String pathconst = "craftorio/%SERVERNAME%"; //Конструктор пути к папке с MC
    public static final String skins = "MinecraftSkins/"; //Папка скинов
    public static final String cloaks = "MinecraftCloaks/"; //Папка плащей

    /**
     * Параметры подключения
     */
    public static final String domain = "craftorio.com";//Домен сайта
    public static final String siteDir = "launcher_test";//Папка с файлами лаунчера на сайте
    public static final String updateFile = "https://craftorio.com/launcher/launcher/launcher";//Ссылка на обновления лаунчера. Не писать на конце ".exe .jar"!
//    public static final String siteDir = "launcher_test";//Папка с файлами лаунчера на сайте
//    public static final String updateFile = "https://craftorio.com/launcher_test/launcher/launcher";//Ссылка на обновления лаунчера. Не писать на конце ".exe .jar"!
    public static final String buyVauncherLink = "https://craftorio.com/shop"; //Ссылка на страницу покупки ваучеров
    //public static final String iMusicname = "001.mp3";
    public static final String[] p = {"wireshark", "cheat"};  //Список запрещенных процессов.
    public static final String http = "https://";   //Протокол подключения https:// если есть ssl сертификат

    public static int height = 532;     //Высота окна клиента
    public static int width = 900;      //Ширина окна клиента
    public static int defaultmemory = 3072;

    public static String[] servers = {
            //        "s1.mine-craft.club, s1.mine-craft.club, 25565, 1.7.10",
            //        "s2.mine-craft.club, s2.mine-craft.club, 25565, 1.7.10",
    };

    /**
     * Настройка панели ссылок
     **/
    public static final String[] links = {
            //Для отключения добавьте в адрес ссылки #
            //" Сайт::http://minecraft.style",
    };

    /**
     * Настройки структуры лаунчера
     */
    public static boolean useAutoenter = false;  //Использовать функцию автозахода на выбранный сервер
    public static boolean useRegister = true;   //Использовать Регистрацию в лаунчере
    public static boolean useMulticlient = true;   //Использовать функцию "по клиенту на сервер"
    public static boolean useStandartWB = true;   //Использовать стандартный браузер для открытия ссылок
    public static boolean usePersonal = false;   //Использовать Личный кабинет
    public static boolean customframe = false;   //Использовать кастомный фрейм
    public static boolean useConsoleHider = false;  //Использовать скрытие консоли клиента
    public static boolean useModCheckerTimer = true;   //Перепроверка jar через 30 секунд
    public static int useModCheckerint = 2;      //Количество раз перепроверки jar во время игры
    public static boolean assetsfolder = false;  //Скачивать assets из папки, или из архива (true=из папки false=из архива) в connect.php должно быть так же.

    public static final String protectionKey = "1234567890"; //Ключ защиты сессии. Никому его не говорите.
    public static final String key1 = "1234567891234567"; //16 Character Key Ключ пост запросов
    public static final String key2 = "1234567891234567"; //16 Character Key Ключ пост запросов

    public static boolean debug = true; //Отображать все действия лаунчера (отладка)(true/false)
    public static boolean drawTracers = false; //Отрисовывать границы элементов лаунчера
    public static final String masterVersion = "1.4.1"; //Версия лаунчера

    public static boolean patchDir = true; //Использовать автоматическую замену директории игры (true/false)

    public static boolean release = false;

    /**
     * Ставим true после окончания настройки!
     * Необходимо для автообновления лаунчера
     * после смены ключей key1 key2.
     */

    public static void onStart() {
    }

    public static void onStartMinecraft() {
    }

}
