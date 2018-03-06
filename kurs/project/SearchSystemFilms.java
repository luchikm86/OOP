public class SearchSystemFilms {	//	поисковая система фильмов
	/*
		Описание сущщностей которые присутствуют в системе.
	*/
	private final String name;	//	имя
	private final String author;	//	автор
	private final String user;	//	пользователь системы
	private final String description;	// описание
	private final int years;	//	год
	private final String country;	//	страна
	private final long like;	//	лайк
	private final long dislike;	// дизлайк
	private final double rating; //	рейтинг
	private final String reviews;	//	отзывы
	private final int	durability;	//длительность фильма в минутах
	private final ArrayList <FavoriteMovies> favoritesMovies = new ArrayList();	//	список избранных фильмов
	private final ArrayList <FavoriteAuthor> favoriteAuthor = new ArrayList();	// список любимых актеров
	private final ArrayList <WatchedMovies> watchedMovies = new ArrayList();	// список просмотренных фильмов с рейтингом
	
	/*
		Описание связи между сущностями.
		В фильме может сниматься много актеров.
		Один актер может сниматься в нескольких фильмах.
		Пользователь может хранить список любимых фильмов.
		Пользователь может хранить список любимых актеров.
		Список просмотренных фильмов с рейтингом
	*/
	public SearchSystemFilms (String name, String author, String user, String description, 
				  int years, String country, long like, long dislike, double rating, String reviews, int durability) {
		this.name = name;
		this.author = author;
		this.user = user;
		this.description = description;
		this.years = years;
		this.country = country;
		this.loke = like;
		this.dislike = dislike;
		this.rating = rating;
		this.reviews = reviews;
		this.durability = durability;
	}
	
	


}
