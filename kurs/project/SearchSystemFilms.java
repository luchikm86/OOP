public class SearchSystemFilms {	//	поисковая система фильмов
	/*
		Описание сущщностей которые присутствуют в системе.
	*/
	privat final String name;	//	имя
	privat final String author;	//	автор
	privat final String user;	//	пользователь системы
	privat final String description;	// описание
	privat final int years;	//	год
	privat final String country;	//	страна
	privat final long like;	//	лайк
	privat final long dislike;	// дизлайк
	privat final double	rating; //	рейтинг
	privat final String reviews;	//	отзывы
	privat final int	durability;	//длительность фильма в минутах
	privat final ArrayList <FavoriteMovies> favoritesMovies = new ArrayList();	//	список избранных фильмов
	privat final ArrayList <FavoriteAuthor> favoriteAuthor = new ArrayList();	// список любимых актеров
	privat final ArrayList <WatchedMovies> watchedMovies = new ArrayList();	// список просмотренных фильмов с рейтингом
	
	
	
	
	/*
		Описание связи между сущностями.
		В фильме может сниматься много актеров.
		Один актер может сниматься в нескольких фильмах.
		Пользователь может хранить список любимых фильмов.
		Пользователь может хранить список любимых актеров.
		Список просмотренных фильмов с рейтингом
	*/
	
	
	
	


}